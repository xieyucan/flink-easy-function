package com.xh.flink.easy.function.udf;

import com.xh.flink.easy.function.utils.UrlUtils;
import org.apache.flink.table.functions.ScalarFunction;

/**
 * 获取url中指定key的value
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class ParseUrlGetValueByKey extends ScalarFunction {

    /**
     * 获取url中指定key的value
     *
     * @param url
     * @param key
     * @return
     */
    public String eval(String url, String key) {
        return UrlUtils.getUrlValueByKey(url, key);
    }
}
