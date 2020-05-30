package com.xh.flink.easy.function;

import com.xh.flink.easy.function.utils.UrlUtils;
import com.xh.flink.easy.function.utils.ValidateUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class MyClass {

    @Test
    public void testVal() {
        String key1 = null;
        String key2 = "";
        String key3 = " ";
        String key4 = "1";
        List key5 = null;
        List key6 = new ArrayList();
        List key7 = new ArrayList();
        key7.add(1);
        Map key8 = null;
        Map key9 = new HashMap();
        key9.put(1, 1);

        System.out.println(ValidateUtils.isBlank(key1));
        System.out.println(ValidateUtils.isBlank(key2));
        System.out.println(ValidateUtils.isBlank(key3));
        System.out.println(ValidateUtils.isBlank(key4));
        System.out.println(ValidateUtils.isBlank(key5));
        System.out.println(ValidateUtils.isBlank(key6));
        System.out.println(ValidateUtils.isBlank(key7));
        System.out.println(ValidateUtils.isBlank(key8));
        System.out.println(ValidateUtils.isBlank(key9));

        System.out.println(ValidateUtils.isNotBlank(key1));
        System.out.println(ValidateUtils.isNotBlank(key2));
        System.out.println(ValidateUtils.isNotBlank(key3));
        System.out.println(ValidateUtils.isNotBlank(key4));
        System.out.println(ValidateUtils.isNotBlank(key5));
        System.out.println(ValidateUtils.isNotBlank(key6));
        System.out.println(ValidateUtils.isNotBlank(key7));
        System.out.println(ValidateUtils.isNotBlank(key8));
        System.out.println(ValidateUtils.isNotBlank(key9));

        System.out.println(ValidateUtils.isEmpty(key1));
        System.out.println(ValidateUtils.isEmpty(key2));
        System.out.println(ValidateUtils.isEmpty(key3));
        System.out.println(ValidateUtils.isEmpty(key4));
        System.out.println(ValidateUtils.isEmpty(key5));
        System.out.println(ValidateUtils.isEmpty(key6));
        System.out.println(ValidateUtils.isEmpty(key7));
        System.out.println(ValidateUtils.isEmpty(key8));
        System.out.println(ValidateUtils.isEmpty(key9));

        System.out.println(ValidateUtils.isNotEmpty(key1));
        System.out.println(ValidateUtils.isNotEmpty(key2));
        System.out.println(ValidateUtils.isNotEmpty(key3));
        System.out.println(ValidateUtils.isNotEmpty(key4));
        System.out.println(ValidateUtils.isNotEmpty(key5));
        System.out.println(ValidateUtils.isNotEmpty(key6));
        System.out.println(ValidateUtils.isNotEmpty(key7));
        System.out.println(ValidateUtils.isNotEmpty(key8));
        System.out.println(ValidateUtils.isNotEmpty(key9));

    }

    @Test
    public void testUrl() {
        String url = "http://www.google.com?username=张三&age=2";
        for (Map.Entry<String, String> entry : UrlUtils.parseUrl(url).entrySet()) {
            System.out.println("key = " + entry.getKey() + " ; value = " + entry.getValue());
        }
        System.out.println("---");
        for (String item : UrlUtils.getUrlKey(url)) {
            System.out.println(item);
        }
        System.out.println("---");
        for (String item : UrlUtils.getUrlValue(url)) {
            System.out.println(item);
        }
        System.out.println("---");
        System.out.println(UrlUtils.getUrlValueByKey(url, "age"));
    }
}
