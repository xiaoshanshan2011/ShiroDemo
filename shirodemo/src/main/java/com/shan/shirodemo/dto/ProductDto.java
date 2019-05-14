package com.shan.shirodemo.dto;

public class ProductDto {
    private String productid;

    private String sysuserid;

    private Long updatetime;

    private Integer productcapacity;

    private String unit;

    private String picture;

    private String aislename;

    private Long createtime;

    private Integer type;

    private Double purchaseprice;

    private Double shellprice;

    private Boolean status;

    private Boolean ismerchantcreate;

    private String merchantid;

    private String details;

    private String images;

    private String specifications;

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(String sysuserid) {
        this.sysuserid = sysuserid == null ? null : sysuserid.trim();
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getProductcapacity() {
        return productcapacity;
    }

    public void setProductcapacity(Integer productcapacity) {
        this.productcapacity = productcapacity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getAislename() {
        return aislename;
    }

    public void setAislename(String aislename) {
        this.aislename = aislename == null ? null : aislename.trim();
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Double purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Double getShellprice() {
        return shellprice;
    }

    public void setShellprice(Double shellprice) {
        this.shellprice = shellprice;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getIsmerchantcreate() {
        return ismerchantcreate;
    }

    public void setIsmerchantcreate(Boolean ismerchantcreate) {
        this.ismerchantcreate = ismerchantcreate;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }
}