package com.zly.statis.pojo;

import java.util.Date;

public class MpcManageScreen {
    private Long id;

    private Integer gmvWealth;

    private Integer grossProfit;

    private Integer rechargeAmount;

    private Integer remainingAmount;

    private Integer advertCost;

    private Integer trend;

    private String srvId;

    private Date statisticsTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGmvWealth() {
        return gmvWealth;
    }

    public void setGmvWealth(Integer gmvWealth) {
        this.gmvWealth = gmvWealth;
    }

    public Integer getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(Integer grossProfit) {
        this.grossProfit = grossProfit;
    }

    public Integer getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Integer rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Integer getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Integer remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Integer getAdvertCost() {
        return advertCost;
    }

    public void setAdvertCost(Integer advertCost) {
        this.advertCost = advertCost;
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