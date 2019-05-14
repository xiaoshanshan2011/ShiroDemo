package com.shan.shirodemo.dto;

public class WineCapacityDto {
    private String capacityid;

    private Integer capacity;

    private Long createtime;

    private Long updatetime;

    public String getCapacityid() {
        return capacityid;
    }

    public void setCapacityid(String capacityid) {
        this.capacityid = capacityid == null ? null : capacityid.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
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
}