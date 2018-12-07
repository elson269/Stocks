package com.elsonji.stocks.presentation.models;

public class MyStockModel {
    private String symbol;
    private String companyName;
    private String latestPrice;
    private String change;
    private String changePercent;

    public MyStockModel(String symbol, String companyName, String latestPrice, String change, String changePercent) {
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

    public void setLatestPrice(String latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getLatestPrice() {
        return latestPrice;
    }


    public void setChange(String change) {
        this.change = change;
    }

    public String getChange() {
        return change;
    }

    public void setChangePercent(String changePercent) {
        this.changePercent = changePercent;
    }

    public String getChangePercent() {
        return changePercent;
    }
}
