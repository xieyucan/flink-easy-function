package com.xh.flink.easy.function.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class LogUtils {

    /**
     * 拆分日志并编码指定字段
     *
     * @param log      待拆分日志
     * @param splitKey 拆分关键字
     * @param charset  编码字符集
     * @param index    获取内容索引下标
     * @return
     */
    public static String splitLogDecode(String log, String splitKey, String charset, int index) {
        String[] split = splitLog(log, splitKey, false, true, charset);
        if (ValidateUtils.isBlank(split))
            return "";

        if (index >= split.length)
            return "";

        return split[index];
    }

    /**
     * 拆分日志并解码指定字段
     *
     * @param log      待拆分日志
     * @param splitKey 拆分关键字
     * @param charset  编码字符集
     * @param index    获取内容索引下标
     * @return
     */
    public static String splitLogEncode(String log, String splitKey, String charset, int index) {
        String[] split = splitLog(log, splitKey, true, false, charset);
        if (ValidateUtils.isBlank(split))
            return "";

        if (index >= split.length)
            return "";

        return split[index];
    }

    /**
     * 拆分日志
     *
     * @param log      待拆分日志
     * @param splitKey 拆分关键字
     * @param encode   是否编码
     * @param decode   是否解码
     * @param charset  编解码格式
     * @param index    获取内容索引下标
     * @return
     */
    public static String splitLog(String log, String splitKey, boolean encode, boolean decode, String charset, int index) {
        String[] split = splitLog(log, splitKey, encode, decode, charset);
        if (ValidateUtils.isBlank(split))
            return "";

        if (index >= split.length)
            return "";

        return split[index];
    }

    /**
     * 日志拆分后编解码
     *
     * @param log      待拆分日志
     * @param splitKey 拆分关键字
     * @param encode   是否编码
     * @param decode   是否解码
     * @param charset  编解码字符集
     * @return
     */
    public static String[] splitLog(String log, String splitKey, boolean encode, boolean decode, String charset) {
        if (ValidateUtils.isBlank(log))
            return null;

        String[] split = log.split(splitKey);
        if (ValidateUtils.isBlank(split))
            return null;

        if (encode) {
            for (int i = 0; i < split.length; i++) {
                try {
                    split[i] = URLEncoder.encode(split[i], charset);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }

        if (decode) {
            for (int i = 0; i < split.length; i++) {
                try {
                    split[i] = URLDecoder.decode(split[i], charset);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }

        return split;
    }
}
