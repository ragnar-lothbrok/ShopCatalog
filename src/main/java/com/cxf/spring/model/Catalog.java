package com.cxf.spring.model;

import java.io.Serializable;

public class Catalog implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long catalogId;
    private String catalogName;
    private String catalogDesc;
    private float price;

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogDesc() {
        return catalogDesc;
    }

    public void setCatalogDesc(String catalogDesc) {
        this.catalogDesc = catalogDesc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
