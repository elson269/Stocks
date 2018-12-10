package com.elsonji.stocks.domain.models;

public class MyStock {
    private String symbol;
    private String companyName;
    private Double latestPrice;
    private Double change;
    private Double changePercent;

    public MyStock(String symbol, String companyName, Double latestPrice, Double change, Double changePercent) {
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

    public void setLatestPrice(Double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public Double getLatestPrice() {
        return latestPrice;
    }


    public void setChange(Double change) {
        this.change = change;
    }

    public Double getChange() {
        return change;
    }

    public void setChangePercent(Double changePercent) {
        this.changePercent = changePercent;
    }

    public Double getChangePercent() {
        return changePercent;
    }

}
