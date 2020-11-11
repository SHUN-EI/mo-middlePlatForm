package com.mo.middlePlatform.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mo on 2020/11/11
 */
public class MPProduct {

    private Long id;

    private Long productCategoryId;

    private String name;

    private String title;

    private BigDecimal price;

    private Date verifyTime;
    //审核状态：0->未审核；1->审核通过
    private Integer verifyStatus;

    private Integer stockNums;

    private Integer saleNums;

    private String picture;
    //删除状态：0->未删除；1->已删除
    private Integer deleteStatus;

    private Date createTime;

    private Date updateTime;


    public MPProduct() {
    }

    public MPProduct(Long id, Long productCategoryId, String name, String title, BigDecimal price, Date verifyTime, Integer verifyStatus, Integer stockNums, Integer saleNums, String picture, Integer deleteStatus, Date createTime, Date updateTime) {
        this.id = id;
        this.productCategoryId = productCategoryId;
        this.name = name;
        this.title = title;
        this.price = price;
        this.verifyTime = verifyTime;
        this.verifyStatus = verifyStatus;
        this.stockNums = stockNums;
        this.saleNums = saleNums;
        this.picture = picture;
        this.deleteStatus = deleteStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getStockNums() {
        return stockNums;
    }

    public void setStockNums(Integer stockNums) {
        this.stockNums = stockNums;
    }

    public Integer getSaleNums() {
        return saleNums;
    }

    public void setSaleNums(Integer saleNums) {
        this.saleNums = saleNums;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
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
