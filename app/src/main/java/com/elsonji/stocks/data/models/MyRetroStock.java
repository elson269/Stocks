package com.elsonji.stocks.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyRetroStock {
    @SerializedName("symbol")
    @Expose
    private String symbol;

    @SerializedName("companyName")
    @Expose
    private String companyName;

    @SerializedName("latestPrice")
    @Expose
    private Double latestPrice;

    @SerializedName("change")
    @Expose
    private Double change;

    @SerializedName("changePercent")
    @Expose
    private Double changePercent;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(Double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(Double changePercent) {
        this.changePercent = changePercent;
    }

}
