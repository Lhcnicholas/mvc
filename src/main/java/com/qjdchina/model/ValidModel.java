package com.qjdchina.model;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/5/28
 **/
public class ValidModel {

    @NotBlank
    private String validString;

    private Date gmtPaid;

    public String getValidString() {
        return validString;
    }

    public void setValidString(String validString) {
        this.validString = validString;
    }

    public Date getGmtPaid() {
        return gmtPaid;
    }

    public void setGmtPaid(Date gmtPaid) {
        this.gmtPaid = gmtPaid;
    }
}
