package com.xh.flink.easy.function.udtf.template;

/**
 * 数据字段
 * Created by xiehui1956(@)gmail.com on 2020/5/29
 */
public class DataField {

    /**
     * 字段名
     */
    private String fieldName;

    /**
     * 描述
     */
    private String fieldDescription;

    /**
     * 是否抽取
     */
    private boolean isExtract;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public boolean isExtract() {
        return isExtract;
    }

    public void setExtract(boolean extract) {
        isExtract = extract;
    }

    public String getFieldDescription() {
        return fieldDescription;
    }

    public void setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
    }
}
