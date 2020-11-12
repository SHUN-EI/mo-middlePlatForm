package com.mo.middlePlatform.command;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by mo on 2020/11/11
 */
public class ProductCommand {

    private Long productCategoryId;

    private String name;

    private String title;

    private BigDecimal price;

    private Integer stockNums;

    private String picture;

    private List<Long> ids;

    private Integer verifyStatus;

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
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

    public Integer getStockNums() {
        return stockNums;
    }

    public void setStockNums(Integer stockNums) {
        this.stockNums = stockNums;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
