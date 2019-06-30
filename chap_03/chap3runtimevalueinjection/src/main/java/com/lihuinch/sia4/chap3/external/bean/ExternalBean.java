package com.lihuinch.sia4.chap3.external.bean;

import lombok.Data;

/**
 * @author lihuinch
 * @date 2019/5/7 12:42
 */
@Data
public class ExternalBean {
    private String value;

    public ExternalBean() {
    }

    public ExternalBean(String value) {
        this.value = value;
    }
}
