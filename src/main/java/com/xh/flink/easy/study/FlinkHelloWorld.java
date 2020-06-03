package com.xh.flink.easy.study;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

/**
 * Created by xiehui1956(@)gmail.com on 2020/6/2
 */
public class FlinkHelloWorld {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment environment = StreamExecutionEnvironment.getExecutionEnvironment();
        environment.socketTextStream("localhost", 9999)
                .flatMap(new FlatMapFunction<String, String>() {
                    @Override
                    public void flatMap(String value, Collector<String> out) throws Exception {
                        out.collect(value + " Hello World!");
                    }
                }).print();

        environment.execute("Hello World");

    }
}
