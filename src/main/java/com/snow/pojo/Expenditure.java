package com.snow.pojo;

import java.util.Objects;

public class Expenditure {
    private Integer ID;
    private Double TotalMoney  ;
    private String Auditor  ;//y已修改数据库
    private String ShoppingList;//y已修改数据库
    private String Application ;//y已修改数据库
    private String SubmitTime  ;//y已修改数据库
    private String state  ;//y已修改数据库

    public Expenditure() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expenditure that = (Expenditure) o;
        return Objects.equals(TotalMoney, that.TotalMoney) && Objects.equals(ShoppingList, that.ShoppingList) && Objects.equals(Application, that.Application) && Objects.equals(SubmitTime, that.SubmitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TotalMoney, ShoppingList, Application, SubmitTime);
    }

    @Override
    public String toString() {
        return "\n\nExpenditure{" +
                ", ID=" + ID +'\n' +
                ", TotalMoney=" + TotalMoney +'\n' +
                ", Auditor='" + Auditor + '\n' +
                ", ShoppingList='" + ShoppingList +'\n' +
                ", Application='" + Application + '\n' +
                ", SubmitTime='" + SubmitTime + '\n' +
                ", state='" + state + '\n' +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Double getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        TotalMoney = totalMoney;
    }

    public String getAuditor() {
        return Auditor;
    }

    public void setAuditor(String auditor) {
        Auditor = auditor;
    }

    public String getShoppingList() {
        return ShoppingList;
    }

    public void setShoppingList(String shoppingList) {
        ShoppingList = shoppingList;
    }

    public String getApplication() {
        return Application;
    }

    public void setApplication(String application) {
        Application = application;
    }

    public String getSubmitTime() {
        return SubmitTime;
    }

    public void setSubmitTime(String submitTime) {
        SubmitTime = submitTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
