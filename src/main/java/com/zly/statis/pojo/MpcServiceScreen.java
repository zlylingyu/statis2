package com.zly.statis.pojo;

import java.util.Date;

public class MpcServiceScreen {
    private Long id;

    private Integer accessDeviceNumber;

    private Integer newDeviceNumber;

    private Integer loginNumber;

    private Integer registeNumber;

    private Integer trend;

    private String srvId;

    private Date statisticsTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccessDeviceNumber() {
        return accessDeviceNumber;
    }

    public void setAccessDeviceNumber(Integer accessDeviceNumber) {
        this.accessDeviceNumber = accessDeviceNumber;
    }

    public Integer getNewDeviceNumber() {
        return newDeviceNumber;
    }

    public void setNewDeviceNumber(Integer newDeviceNumber) {
        this.newDeviceNumber = newDeviceNumber;
    }

    public Integer getLoginNumber() {
        return loginNumber;
    }

    public void setLoginNumber(Integer loginNumber) {
        this.loginNumber = loginNumber;
    }

    public Integer getRegisteNumber() {
        return registeNumber;
    }

    public void setRegisteNumber(Integer registeNumber) {
        this.registeNumber = registeNumber;
    }

    public Integer getTrend() {
        return trend;
    }

    public void setTrend(Integer trend) {
        this.trend = trend;
    }

    public String getSrvId() {
        return srvId;
    }

    public void setSrvId(String srvId) {
        this.srvId = srvId == null ? null : srvId.trim();
    }

    public Date getStatisticsTime() {
        return statisticsTime;
    }

    public void setStatisticsTime(Date statisticsTime) {
        this.statisticsTime = statisticsTime;
    }
}