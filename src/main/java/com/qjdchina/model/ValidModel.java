package com.qjdchina.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/5/28
 **/
public class ValidModel {

    @NotBlank
    private String validString;

    public String getValidString() {
        return validString;
    }

    public void setValidString(String validString) {
        this.validString = validString;
    }
}
