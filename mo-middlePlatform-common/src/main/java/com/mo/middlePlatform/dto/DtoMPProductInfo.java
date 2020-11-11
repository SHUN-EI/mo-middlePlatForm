package com.mo.middlePlatform.dto;

import com.mo.middlePlatform.entity.MPProduct;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by mo on 2020/11/11
 */
public class DtoMPProductInfo {

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

    public DtoMPProductInfo() {
    }

    public DtoMPProductInfo(MPProduct product) {
        this.id = product.getId();
        this.productCategoryId = product.getProductCategoryId();
        this.name = product.getName();
        this.title = product.getTitle();
        this.price = product.getPrice();
        this.verifyTime = product.getVerifyTime();
        this.verifyStatus = product.getVerifyStatus();
        this.stockNums = product.getStockNums();
        this.saleNums = product.getSaleNums();
        this.picture = product.getPicture();
        this.deleteStatus = product.getDeleteStatus();
        this.createTime = product.getCreateTime();
        this.updateTime = product.getUpdateTime();
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
