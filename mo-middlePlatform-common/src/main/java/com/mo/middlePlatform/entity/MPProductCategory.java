package com.mo.middlePlatform.entity;

import javafx.scene.chart.PieChart;

import java.util.Date;

/**
 * Created by mo on 2020/11/10
 */
public class MPProductCategory {

    private Long id;
    //商品上级分类编号:0表示一级分类
    private Long parentId;

    private String name;
    //商品类别等级,分类级别: 0->1级;1->2级
    private Integer level;

    private String description;

    private Date createTime;

    private Date updateTime;

    public MPProductCategory() {
    }

    public MPProductCategory(Long id, Long parentId, String name, Integer level, String description, Date createTime, Date updateTime) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}