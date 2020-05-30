package com.xh.flink.easy.function.udtf;

import com.xh.flink.easy.function.udtf.template.DataField;

import java.util.List;

/**
 * 数据模板
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class DataTemplate {

    private List<DataField> dataFieldList = null;

    public DataTemplate() {
    }

    public DataTemplate(List<DataField> dataFieldList) {
        this.dataFieldList = dataFieldList;
    }

    public List<DataField> getDataFieldList() {
        return dataFieldList;
    }

    public void setDataFieldList(List<DataField> dataFieldList) {
        this.dataFieldList = dataFieldList;
    }
}