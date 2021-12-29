package com.zly.statis.pojo;

import java.util.Date;

public class MpcDataScreen {
    private Long id;

    private Integer newUserNumber;

    private Integer activeUserNumber;

    private Integer gmvWealth;

    private Integer newUserCost;

    private Integer currentEmployeesNumber;

    private Integer newEmployeesNumber;

    private Date statisticsTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNewUserNumber() {
        return newUserNumber;
    }

    public void setNewUserNumber(Integer newUserNumber) {
        this.newUserNumber = newUserNumber;
    }

    public Integer getActiveUserNumber() {
        return activeUserNumber;
    }

    public void setActiveUserNumber(Integer activeUserNumber) {
        this.activeUserNumber = activeUserNumber;
    }

    public Integer getGmvWealth() {
        return gmvWealth;
    }

    public void setGmvWealth(Integer gmvWealth) {
        this.gmvWealth = gmvWealth;
    }

    public Integer getNewUserCost() {
        return newUserCost;
    }

    public void setNewUserCost(Integer newUserCost) {
        this.newUserCost = newUserCost;
    }

    public Integer getCurrentEmployeesNumber() {
        return currentEmployeesNumber;
    }

    public void setCurrentEmployeesNumber(Integer currentEmployeesNumber) {
        this.currentEmployeesNumber = currentEmployeesNumber;
    }

    public Integer getNewEmployeesNumber() {
        return newEmployeesNumber;
    }

    public void setNewEmployeesNumber(Integer newEmployeesNumber) {
        this.newEmployeesNumber = newEmployeesNumber;
    }

    public Date getStatisticsTime() {
        return statisticsTime;
    }

    public void setStatisticsTime(Date statisticsTime) {
        this.statisticsTime = statisticsTime;
    }
}