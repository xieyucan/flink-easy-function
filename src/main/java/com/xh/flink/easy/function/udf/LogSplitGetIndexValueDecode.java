package com.xh.flink.easy.function.udf;

import com.xh.flink.easy.function.utils.LogUtils;
import org.apache.flink.table.functions.ScalarFunction;

/**
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class LogSplitGetIndexValueDecode extends ScalarFunction {

    /**
     * 获取指定索引值并解码
     *
     * @param log      待拆分日志
     * @param splitKey 拆分key
     * @param charset  解码字符串
     * @return
     */
    public String eval(String log, String splitKey, String charset, int index) {
        String value = LogUtils.splitLogDecode(log, splitKey, charset, index);
        return value;
    }
}
