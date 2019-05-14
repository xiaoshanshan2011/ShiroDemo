package com.shan.shirodemo.dto;

public class ProductOrderDto {
    private String orderid;

    private Long ordercode;

    private String sysuserid;

    private String userid;

    private Integer status;

    private Long createtime;

    private Long updatetime;

    private Double delivermoney;

    private Double totalmoney;

    private Boolean payfrom;

    private Boolean ispay;

    private String username;

    private Long userphone;

    private Boolean isrefund;

    private Long receivetime;

    private Long deliverytime;

    private String expressname;

    private String productlist;

    private String useraddress;

    private String orderremarks;

    private String expressno;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Long getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(Long ordercode) {
        this.ordercode = ordercode;
    }

    public String getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(String sysuserid) {
        this.sysuserid = sysuserid == null ? null : sysuserid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public Double getDelivermoney() {
        return delivermoney;
    }

    public void setDelivermoney(Double delivermoney) {
        this.delivermoney = delivermoney;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Boolean getPayfrom() {
        return payfrom;
    }

    public void setPayfrom(Boolean payfrom) {
        this.payfrom = payfrom;
    }

    public Boolean getIspay() {
        return ispay;
    }

    public void setIspay(Boolean ispay) {
        this.ispay = ispay;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getUserphone() {
        return userphone;
    }

    public void setUserphone(Long userphone) {
        this.userphone = userphone;
    }

    public Boolean getIsrefund() {
        return isrefund;
    }

    public void setIsrefund(Boolean isrefund) {
        this.isrefund = isrefund;
    }

    public Long getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Long receivetime) {
        this.receivetime = receivetime;
    }

    public Long getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Long deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getExpressname() {
        return expressname;
    }

    public void setExpressname(String expressname) {
        this.expressname = expressname == null ? null : expressname.trim();
    }

    public String getProductlist() {
        return productlist;
    }

    public void setProductlist(String productlist) {
        this.productlist = productlist == null ? null : productlist.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks == null ? null : orderremarks.trim();
    }

    public String getExpressno() {
        return expressno;
    }

    public void setExpressno(String expressno) {
        this.expressno = expressno == null ? null : expressno.trim();
    }
}