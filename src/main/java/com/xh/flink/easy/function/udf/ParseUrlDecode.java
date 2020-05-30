package com.xh.flink.easy.function.udf;

import com.xh.flink.easy.function.utils.UrlUtils;
import org.apache.flink.table.functions.ScalarFunction;

/**
 * 获取url中指定key的value
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class ParseUrlDecode extends ScalarFunction {

    /**
     * 获取url中指定key的value
     *
     * @param url
     * @param charset
     * @return
     */
    public String eval(String url, String charset) {
        return UrlUtils.decodeUrl(url, charset);
    }
}
