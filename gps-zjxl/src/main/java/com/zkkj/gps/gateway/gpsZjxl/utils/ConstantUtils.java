package com.zkkj.gps.gateway.gpsZjxl.utils;

/**
 * author : cyc
 * Date : 2020/3/10
 */
public class ConstantUtils {

    /**
     * 车牌号的正则表达式(包含新能源车辆)去除军用车牌
     */
    public static final String PLATE_NUMBER = "([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领]{1}[A-Z]{1}(([0-9]{5}[DF])|([DF]([A-HJ-NP-Z0-9])[0-9]{4})))|([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领]{1}[A-Z]{1}[A-HJ-NP-Z0-9]{4}[A-HJ-NP-Z0-9挂学警港澳]{1})";

}
