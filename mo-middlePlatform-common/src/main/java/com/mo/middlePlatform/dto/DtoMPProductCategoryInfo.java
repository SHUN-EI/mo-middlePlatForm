package com.mo.middlePlatform.dto;

import com.mo.middlePlatform.entity.MPProductCategory;

import java.util.Date;

/**
 * Created by mo on 2020/11/10
 */
public class DtoMPProductCategoryInfo {

    private Long id;
    //商品上级分类编号:0表示一级分类
    private Long parentId;

    private String name;
    //商品类别等级,分类级别: 0->1级;1->2级
    private Integer level;

    private String description;

    private Date createTime;

    private Date updateTime;

    public DtoMPProductCategoryInfo() {
    }

    public DtoMPProductCategoryInfo(MPProductCategory productCategory) {
        this.id = productCategory.getId();
        this.parentId = productCategory.getParentId();
        this.name = productCategory.getName();
        this.level = productCategory.getLevel();
        this.description = productCategory.getDescription();
        this.createTime = productCategory.getCreateTime();
        this.updateTime = productCategory.getUpdateTime();
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
