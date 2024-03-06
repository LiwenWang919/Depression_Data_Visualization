package com.wlw.community.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Hospital1)实体类lo
 *
 * @author makejava
 * @since 2022-03-13 20:45:04
 */
public class Hospital1 implements Serializable {
    private static final long serialVersionUID = 529818350744589083L;
    
    private Integer id;
    
    private String name;
    
    private String type;
    
    private String phone;
    
    private String grade;
    
    private String main;
    
    private String website;
    
    private String addr;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private String ip;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}

