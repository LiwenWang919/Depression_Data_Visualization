package com.wlw.community.entity;

import java.io.Serializable;

/**
 * (Meta)实体类
 *
 * @author makejava
 * @since 2022-03-23 07:13:28
 */
public class Meta implements Serializable {
    private static final long serialVersionUID = -95450539752097394L;
    
    private Integer id;
    
    private String top;
    
    private String mid;
    
    private String sub;
    
    private Integer nforall;
    
    private Double unweightedforall;
    
    private Double weightedforall;
    
    private Integer nfor12;
    
    private Double unweightedfor12;
    
    private Double weightedfor12;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public Integer getNforall() {
        return nforall;
    }

    public void setNforall(Integer nforall) {
        this.nforall = nforall;
    }

    public Double getUnweightedforall() {
        return unweightedforall;
    }

    public void setUnweightedforall(Double unweightedforall) {
        this.unweightedforall = unweightedforall;
    }

    public Double getWeightedforall() {
        return weightedforall;
    }

    public void setWeightedforall(Double weightedforall) {
        this.weightedforall = weightedforall;
    }

    public Integer getNfor12() {
        return nfor12;
    }

    public void setNfor12(Integer nfor12) {
        this.nfor12 = nfor12;
    }

    public Double getUnweightedfor12() {
        return unweightedfor12;
    }

    public void setUnweightedfor12(Double unweightedfor12) {
        this.unweightedfor12 = unweightedfor12;
    }

    public Double getWeightedfor12() {
        return weightedfor12;
    }

    public void setWeightedfor12(Double weightedfor12) {
        this.weightedfor12 = weightedfor12;
    }


    @Override
    public String toString() {
        return "Meta{" +
                "id=" + id +
                ", top='" + top + '\'' +
                ", mid='" + mid + '\'' +
                ", sub='" + sub + '\'' +
                ", nforall=" + nforall +
                ", unweightedforall=" + unweightedforall +
                ", weightedforall=" + weightedforall +
                ", nfor12=" + nfor12 +
                ", unweightedfor12=" + unweightedfor12 +
                ", weightedfor12=" + weightedfor12 +
                '}';
    }
}

