package com.elsonji.stocks.domain.models;

import java.util.List;

public class MyStockList {
    private List<MyStock> stocks;

    public MyStockList(List<MyStock> myStocks) {
        stocks = myStocks;
    }

    public void setStocks(List<MyStock> stocks) {
        this.stocks = stocks;
    }

    public List<MyStock> getStocks() {
        return stocks;
    }
}
