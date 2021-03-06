package com.zkkj.gps.gateway.jt808tcp.monitor.jt808.protocol;


import com.zkkj.gps.gateway.jt808tcp.monitor.annotation.Property;
import com.zkkj.gps.gateway.jt808tcp.monitor.annotation.Type;
import com.zkkj.gps.gateway.jt808tcp.monitor.enums.DataType;
import com.zkkj.gps.gateway.jt808tcp.monitor.jt808.common.MessageId;
import com.zkkj.gps.gateway.jt808tcp.monitor.jt808.entity.PositionAttribute;
import com.zkkj.gps.gateway.jt808tcp.monitor.message.AbstractBody;

import java.util.List;

/**
 * 位置信息查询应答
 * @author suibozhuliu
 */
@Type({MessageId.位置信息查询应答, MessageId.车辆控制应答})
public class JT_0201 extends AbstractBody {

    private Integer serialNumber;
    private Integer warningMark;
    private Integer status;
    private Long latitude;
    private Long longitude;
    private Integer altitude;
    private Integer speed;
    private Integer direction;
    private String dateTime;

    private List<PositionAttribute> positionAttributes;

    @Property(index = 0, type = DataType.WORD, desc = "应答流水号")
    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Property(index = 2, type = DataType.DWORD, desc = "报警标志")
    public Integer getWarningMark() {
        return warningMark;
    }

    public void setWarningMark(Integer warningMark) {
        this.warningMark = warningMark;
    }

    @Property(index = 6, type = DataType.DWORD, desc = "状态")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Property(index = 10, type = DataType.DWORD, desc = "纬度")
    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    @Property(index = 14, type = DataType.DWORD, desc = "经度")
    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    @Property(index = 18, type = DataType.WORD, desc = "海拔")
    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    @Property(index = 20, type = DataType.WORD, desc = "速度")
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Property(index = 22, type = DataType.WORD, desc = "方向")
    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    @Property(index = 24, type = DataType.BCD8421, length = 6, desc = "时间")
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Property(index = 30, type = DataType.LIST, desc = "位置附加信息")
    public List<PositionAttribute> getPositionAttributes() {
        return positionAttributes;
    }

    public void setPositionAttributes(List<PositionAttribute> positionAttributes) {
        this.positionAttributes = positionAttributes;
    }
}