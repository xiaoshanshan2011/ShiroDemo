package com.shanghao.publib;

/**
 * @Author: chenjunshan
 * @Date: 18-12-30 下午2:52
 */
public enum AreaEnum {
    PROVINCE(1, "省"),
    CITY(2, "市"),
    COUNTY(3, "区"),
    ;
    private Integer id;
    private String typeName;

    AreaEnum(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }}
