package com.xh.flink.easy.function.utils;

import java.util.List;
import java.util.Map;

/**
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class ValidateUtils {

    /**
     * 忽略空格字符
     *
     * @param value
     * @return
     */
    public static boolean isBlank(String value) {
        return null == value || 0 == value.replaceAll("\\s", "").length();
    }

    /**
     * 忽略空数组
     *
     * @param valueArrays
     * @return
     */
    public static boolean isBlank(String[] valueArrays) {
        return null == valueArrays || 0 == valueArrays.length;
    }

    /**
     * 忽略空内容
     *
     * @param list
     * @return
     */
    public static boolean isBlank(List list) {
        return null == list || list.isEmpty();
    }

    /**
     * 忽略空内容
     *
     * @param map
     * @return
     */
    public static boolean isBlank(Map map) {
        return null == map || map.isEmpty();
    }

    /**
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        return null == value;
    }

    /**
     * @param valueArray
     * @return
     */
    public static boolean isEmpty(String[] valueArray) {
        return null == valueArray;
    }

    /**
     * @param list
     * @return
     */
    public static boolean isEmpty(List list) {
        return null == list;
    }

    /**
     * @param map
     * @return
     */
    public static boolean isEmpty(Map map) {
        return null == map;
    }

    /**
     * @param value
     * @return
     */
    public static boolean isNotBlank(String value) {
        return null != value && value.replaceAll("\\s", "").length() > 0;
    }

    /**
     * @param valueArray
     * @return
     */
    public static boolean isNotBlank(String[] valueArray) {
        return null != valueArray && 0 != valueArray.length;
    }

    /**
     * @param list
     * @return
     */
    public static boolean isNotBlank(List list) {
        return null != list && !list.isEmpty();
    }

    /**
     * @param map
     * @return
     */
    public static boolean isNotBlank(Map map) {
        return null != map && !map.isEmpty();
    }

    /**
     * @param value
     * @return
     */
    public static boolean isNotEmpty(String value) {
        return null != value && value.length() > 0;
    }

    /**
     * @param valueArray
     * @return
     */
    public static boolean isNotEmpty(String[] valueArray) {
        return null != valueArray && valueArray.length != 0;
    }

    /**
     * @param list
     * @return
     */
    public static boolean isNotEmpty(List list) {
        return null != list;
    }

    /**
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map map) {
        return null != map;
    }

}
