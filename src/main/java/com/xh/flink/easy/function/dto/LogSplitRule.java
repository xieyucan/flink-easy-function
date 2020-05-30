package com.xh.flink.easy.function.dto;

/**
 * 日志切割规则
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class LogSplitRule {

    private String splitKey;

    private String charset;

    private boolean encode = false;

    private boolean decode = false;
}
