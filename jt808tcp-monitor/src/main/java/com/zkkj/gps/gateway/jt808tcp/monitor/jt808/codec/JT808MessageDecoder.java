package com.zkkj.gps.gateway.jt808tcp.monitor.jt808.codec;

import com.zkkj.gps.gateway.jt808tcp.monitor.codec.MessageDecoder;
import com.zkkj.gps.gateway.jt808tcp.monitor.commons.transform.ByteBufUtils;
import com.zkkj.gps.gateway.jt808tcp.monitor.mapping.HandlerMapper;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;

import java.util.ArrayList;
import java.util.List;

/**
 * 808协议解码器
 * @author suibozhuliu
 */
public class JT808MessageDecoder extends MessageDecoder {

    public JT808MessageDecoder() {
    }

    public JT808MessageDecoder(HandlerMapper handlerMapper) {
        super(handlerMapper);
    }

    /**
     * 获取消息类型
     */
    @Override
    public int getType(ByteBuf source) {
        return source.getUnsignedShort(0);
    }

    /**
     * 校验
     */
    @Override
    public boolean check(ByteBuf buf) {
        byte checkCode = buf.getByte(buf.readableBytes() - 1);
        buf = buf.slice(0, buf.readableBytes() - 1);
        byte calculatedCheckCode = ByteBufUtils.bcc(buf);
        return checkCode != calculatedCheckCode;
    }

    /**
     * 反转义
     */
    @Override
    public ByteBuf unEscape(ByteBuf source) {
        int low = source.readerIndex();
        int high = source.writerIndex();

        int mark = source.indexOf(low, high, (byte) 0x7d);
        if (mark == -1)
            return source;
        List<ByteBuf> bufList = new ArrayList<>(3);
        int len;
        do {
            len = mark + 2 - low;
            bufList.add(slice(source, low, len));
            low += len;
            mark = source.indexOf(low, high, (byte) 0x7d);
        } while (mark > 0);
        bufList.add(source.slice(low, high - low));
        return new CompositeByteBuf(UnpooledByteBufAllocator.DEFAULT, false, bufList.size(), bufList);
    }

    /**
     * 截取转义前报文，并还原转义位
     */
    protected ByteBuf slice(ByteBuf byteBuf, int index, int length) {
        byte second = byteBuf.getByte(index + length - 1);
        if (second == 0x02)
            byteBuf.setByte(index + length - 2, 0x7e);

        // 0x01 不做处理 p47
        // if (second == 0x01) {
        // }
        return byteBuf.slice(index, length - 1);
    }
}