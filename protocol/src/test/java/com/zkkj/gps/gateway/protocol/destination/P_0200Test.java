package com.zkkj.gps.gateway.protocol.destination;

import com.zkkj.gps.gateway.protocol.BaseTest;
import org.junit.Test;

public class P_0200Test extends BaseTest {
	@Test
	public void decoderBody() throws Exception {
		/**
		 * 7e0200002c027036465375dc7d0200000000000000030218ddf406906d30000000020000190804220504010400079d1433262a4d30302c32392c957e
		 */
//		byte[] buf = {
//				// 手写字节码
//				0x7e,
//				0x02,0x00,
//				0x01,0x1a,
//				0x09,0x50,0x39,0x62,0x78,0x20,
//				(byte) 0xbe, (byte) 0xff,
//
//				0x00,0x00,0x00,0x00,
//				0x00,0x00,0x00,0x02,
//				0x02,0x09, (byte) 0xc0, (byte) 0xd8,
//				0x06,0x7d,0x01,0x64,0x28,
//				0x00,0x00,
//				0x00,0x00,
//				0x00,0x00,
//				0x19,0x04,0x23,0x16,0x03,0X10,
//
//				0x36, (byte) 0xc4, (byte) 0xbb,0x0a,0x2c,0x2d, (byte) 0xc4,0x42,0x22,
//				0x22,0x22,0x2b, (byte) 0xb0,0x62,0x34,0x44,0x5f, (byte) 0xfd,0x78,
//				0x2b, (byte) 0xb0,0x6f, (byte) 0xb9, (byte) 0x9f, (byte) 0x97, (byte) 0x99,0x3d,0x12,0x34,
//				(byte) 0xd5, (byte) 0xfe, (byte) 0xeb,0x01, (byte) 0xfe,0x23,0x01, (byte) 0xfe,0x12,0x01,
//				(byte) 0xfe,0x02,0x01, (byte) 0xfe,0x01,0x03,0x01,0x03,0x00,0x00,
//				0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,
//				0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,
//				0x00,0x00,0x04,0x00,0x00,0x00,0x00,0x00,0x00,0x00,
//				0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x0a,0x00,
//				0x00,0x00,0x00,0x00,0x00,0x00,0x64,0x00,0x00,0x00,
//				0x30, (byte) 0x9d,0x00,0x20,0x30, (byte) 0x9d,0x00,0x20,0x4d, (byte) 0xd9,
//				0x01,0x08,0x30, (byte) 0x9d,0x00,0x20, (byte) 0xa4, (byte) 0x9d,0x00,0x20,
//				(byte) 0xf4, (byte) 0x9c,0x00,0x20,0x38, (byte) 0x9d,0x00,0x20, (byte) 0xa4, (byte) 0x9d,
//				0x00,0x20, (byte) 0xf4, (byte) 0x9c,0x00,0x20,0x30,0x00,0x00,0x00,
//				0x00,0x00,0x00,0x00,0x30,0x00,0x00,0x00,0x00,0x00,
//				0x00,0x00, (byte) 0xaf, (byte) 0xf2,0x00,0x08, (byte) 0xa0, (byte) 0x9d,0x00,0x20,
//				0x72, (byte) 0x9d,0x00,0x20,0x38, (byte) 0x9d,0x00,0x20,0x00,0x00,
//				0x00,0x00,0x02,0x00,0x00,0x00,0x00,0x00,0x00,0x00,
//				0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,
//				0x00,0x00,0x14,0x00,0x00,0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff,
//
//              0x33,
//				0x36,0x2a,0x4d,0x30,0x30,0x2c,0x34,0x35,0x2c,0x31,
//				0x31,0x34,0x32,0x31,0x30,0x30,0x38,0x30,0x30,0x30,
//				0x38,0x32,0x32,0x30,0x26,0x30,0x30,0x30,0x30,0x30,
//				0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x26,0x31,0x32,
//				0x33,0x34,0x35,0x36,0x37,0x38,0x39,0x30,0x31,0x32,
//				0x33,0x34,0x35,0x36,0x23,
//
//				(byte) 0xfb,
//				0x7e
//		};


//		byte[] buf = {
//				0x7e,
//
//				0x02,0x00,
//				0x00,0x54,
//				0x09,0x50,0x39,0x62,0x78,0x20,
//				(byte) 0xc1, (byte) 0xa8,
//
//				0x00,0x00,0x00,0x00,
//				0x00,0x00,0x00,0x02,
//				0x02,0x09, (byte) 0xc0, (byte) 0xd8,
//				0x06,0x7d,0x01,0x64,0x28,
//				0x00,0x00,
//				0x00,0x00,
//				0x00,0x00,
//				0x19,0x04,0x23,0x19,0x04,0x38,
//
//				0x33,0x36,
//				0x2a,0x4d,0x30,0x30,0x2c,0x34,0x35,0x2c,0x31,0x31,
//				0x34,0x32,0x32,0x30,0x30,0x38,0x30,0x30,0x30,0x38,
//				0x32,0x32,0x30,0x26,0x30,0x30,0x30,0x30,0x30,0x30,
//				0x30,0x30,0x30,0x30,0x30,0x30,0x26, 0x31,0x32,0x33,
//				0x34,0x35,0x36,0x37,0x38,0x39,0x30,0x31,0x32,0x33,
//				0x34,0x35,0x36,0x23,
//
//				0x2a,
//				0x7e
//		};

//		byte[] buf = {
//				0X7e,
//				0x02,0x00,
//				0x00,0x54,
//				0x09,0x50,0x39,0x62,0x78,0x20,
//				(byte) 0xca, (byte) 0xaf,
//
//				0x00,0x00,0x00,0x00,
//				0x00,0x00,0x00,0x02,
//				0x02,0x09, (byte) 0xbc, (byte) 0xc4,
//				0x06,0x7d,0x01,0x64,0x40,
//				0x00,0x00,
//				0x00,0x00,
//				0x00,0x00,
//				0x19,0x04,0x24,0x11,0x15,0x21,
//
//				0x33,0x36,0x2a,0x4d,0x30,0x30,0x2c,0x34,0x35,0x2c,0x31,0x31,0x34,0x32,0x31,0x30,0x30,0x38,0x30,0x30,0x30,0x38,0x32,0x32,0x30,
//				0x26,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,0x30,
//				0x26,0x31,0x32,0x33,0x34,0x35,
//				0x36,0x37,0x38,0x39,0x30,0x31,0x32,0x33,0x34,0x35,0x36,0x23,0x2a,0x7e
//		};

		byte[] buf = {
				0x7e,
				0x02, 0x00,
				0x00, 0x5f,
				0x09, 0x50, 0x39, 0x62, 0x17, 0x73,
				0x00, 0x10,

				0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x01,
				0x02, 0x09, (byte) 0xc0, (byte) 0xa0,
				0x06, 0x7d, 0x01, 0x6b, 0x48,
				0x00, 0x00,
				0x00, 0x00,
				0x00, 0x00,
				0x01, 0x01, 0x01, 0x00, 0x00, 0x01,

				0x33,
				0x36,
				0x2a,
				0x4d, 0x30, 0x30,
				0x2c,
				0x34, 0x35,
				0x2c,
				0x31, 0x31, 0x33, 0x38, 0x36, 0x30, 0x30,
				0x38, 0x30, 0x30, 0x30, 0x38, 0x32, 0x32, 0x30,
				0x26,
				0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30,
				0x26,
				0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38, 0x39, 0x30, 0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x23,

				1, 4, 0x0, 0x0, 0x0, 0x69,

				0x36, (byte) 0xc4, (byte) 0xbb, 0x0a, 0x2c, 0x2d, (byte) 0xc4, 0x42, 0x22,
				0x22, 0x22, 0x2b, (byte) 0xb0, 0x62, 0x34, 0x44, 0x5f, (byte) 0xfd, 0x78,
				0x2b, (byte) 0xb0, 0x6f, (byte) 0xb9, (byte) 0x9f, (byte) 0x97, (byte) 0x99, 0x3d, 0x12, 0x34,
				(byte) 0xd5, (byte) 0xfe, (byte) 0xeb, 0x01, (byte) 0xfe, 0x23, 0x01, (byte) 0xfe, 0x12, 0x01,
				(byte) 0xfe, 0x02, 0x01, (byte) 0xfe, 0x01, 0x03, 0x01, 0x03, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0a, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x64, 0x00, 0x00, 0x00,
				0x30, (byte) 0x9d, 0x00, 0x20, 0x30, (byte) 0x9d, 0x00, 0x20, 0x4d, (byte) 0xd9,
				0x01, 0x08, 0x30, (byte) 0x9d, 0x00, 0x20, (byte) 0xa4, (byte) 0x9d, 0x00, 0x20,
				(byte) 0xf4, (byte) 0x9c, 0x00, 0x20, 0x38, (byte) 0x9d, 0x00, 0x20, (byte) 0xa4, (byte) 0x9d,
				0x00, 0x20, (byte) 0xf4, (byte) 0x9c, 0x00, 0x20, 0x30, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x30, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, (byte) 0xaf, (byte) 0xf2, 0x00, 0x08, (byte) 0xa0, (byte) 0x9d, 0x00, 0x20,
				0x72, (byte) 0x9d, 0x00, 0x20, 0x38, (byte) 0x9d, 0x00, 0x20, 0x00, 0x00,
				0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x14, 0x00, 0x00, 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff,

				0x35,
				0X09,
				0x01, (byte) 0xcc,
				0x36,
				0x00, 0x00,
				(byte) 0xb5, 0x3a,
				(byte) 0x90, (byte) 0xf3,
				0x49,
				0x7e
		};
//		P_0200 p_0200 = new P_0200(buf);
//		System.out.println(p_0200);
	}
}