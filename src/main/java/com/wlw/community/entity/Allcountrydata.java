package com.wlw.community.entity;

import java.io.Serializable;

/**
 * (Allcountrydata)实体类
 *
 * @author makejava
 * @since 2022-02-28 11:37:48
 */
public class Allcountrydata implements Serializable {
    private static final long serialVersionUID = -91629230987934593L;
    
    private Integer measure;
    
    private Integer location;
    
    private Integer sex;
    
    private Integer age;
    
    private Integer cause;
    
    private Integer metric;
    
    private Integer year;
    
    private Double val;
    
    private Double upper;
    
    private Double lower;
    
    private Integer id;


    public Integer getMeasure() {
        return measure;
    }

    public void setMeasure(Integer measure) {
        this.measure = measure;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCause() {
        return cause;
    }

    public void setCause(Integer cause) {
        this.cause = cause;
    }

    public Integer getMetric() {
        return metric;
    }

    public void setMetric(Integer metric) {
        this.metric = metric;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
    }

    public Double getUpper() {
        return upper;
    }

    public void setUpper(Double upper) {
        this.upper = upper;
    }

    public Double getLower() {
        return lower;
    }

    public void setLower(Double lower) {
        this.lower = lower;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

