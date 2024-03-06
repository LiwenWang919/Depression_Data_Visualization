package com.wlw.community.entity;

import java.io.Serializable;

/**
 * (Medicine)实体类
 *
 * @author makejava
 * @since 2022-03-31 11:06:11
 */
public class Medicine implements Serializable {
    private static final long serialVersionUID = -96007707427083217L;
    
    private Integer id;
    
    private String name;
    
    private String major;
    
    private String component;
    
    private String company;


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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", component='" + component + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

