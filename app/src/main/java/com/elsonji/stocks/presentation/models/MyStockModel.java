package com.elsonji.stocks.presentation.models;

public class MyStockModel {
    private String symbol;
    private String companyName;
    private double latestPrice;
    private double change;
    private double changePercent;

    public MyStockModel(String symbol, String companyName, double latestPrice, double change, double changePercent) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.latestPrice = latestPrice;
        this.change = change;
        this.changePercent = changePercent;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setLatestPrice(double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public double getLatestPrice() {
        return latestPrice;
    }


    public void setChange(double change) {
        this.change = change;
    }

    public double getChange() {
        return change;
    }

    public void setChangePercent(double changePercent) {
        this.changePercent = changePercent;
    }

    public double getChangePercent() {
        return changePercent;
    }
}
