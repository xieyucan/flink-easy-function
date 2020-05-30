package com.xh.flink.easy.function.utils;

import org.apache.flink.shaded.guava18.com.google.common.base.Splitter;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class UrlUtils {

    /**
     * url解码
     *
     * @param url
     * @param charset
     * @return
     */
    public static String decodeUrl(String url, String charset) {
        if (ValidateUtils.isBlank(url))
            return null;

        try {
            return URLDecoder.decode(url, charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * url编码
     *
     * @param url
     * @param charset
     * @return
     */
    public static String encodeUrl(String url, String charset) {
        if (ValidateUtils.isBlank(url))
            return null;

        try {
            return URLEncoder.encode(url, charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取url中key对应的value
     *
     * @param url
     * @param key
     * @return
     */
    public static String getUrlValueByKey(String url, String key) {
        if (ValidateUtils.isBlank(url))
            return null;

        if (ValidateUtils.isBlank(key))
            return null;

        String value = parseUrl(url).get(key);
        return null == value ? "" : value;
    }

    /**
     * 获取url中所有的key
     *
     * @param url
     * @return
     */
    public static List<String> getUrlKey(String url) {
        if (ValidateUtils.isBlank(url))
            return null;

        List<String> urlKeyList = new ArrayList();
        Iterator<String> iterator = parseUrl(url).keySet().iterator();
        while (iterator.hasNext()) {
            urlKeyList.add(iterator.next());
        }

        return urlKeyList;
    }

    /**
     * 获取url中给所有的value
     *
     * @param url
     * @return
     */
    public static List<String> getUrlValue(String url) {
        if (ValidateUtils.isBlank(url))
            return null;

        return parseUrl(url).values().stream().collect(Collectors.toList());
    }

    /**
     * 获取url请求参数
     *
     * @param url
     * @return
     */
    public static Map<String, String> parseUrl(String url) {
        if (ValidateUtils.isBlank(url))
            return null;
        return Splitter.on("&").withKeyValueSeparator("=").split(url.substring(url.indexOf("?") + 1));
    }
}
