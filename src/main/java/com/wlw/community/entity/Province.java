package com.wlw.community.entity;

import java.io.Serializable;

/**
 * (Province)实体类
 *
 * @author makejava
 * @since 2022-02-28 11:44:51
 */
public class Province implements Serializable {
    private static final long serialVersionUID = 325651245687875116L;
    
    private String province;
    
    private Integer year;
    
    private Integer sum;
    
    private Double percent;
    
    private Integer id;


    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{"+
                "\""+"name"+"\""+":" + province + ','+
                "\""+"value"+"\""+":" + percent +
                "}";
    }
}

