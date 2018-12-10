package com.elsonji.stocks.domain.models;

import java.util.ArrayList;

public class MyStockList {
    private ArrayList<MyStock> stocks;

    public void setStocks(ArrayList<MyStock> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<MyStock> getStocks() {
        return stocks;
    }
}
