package com.elsonji.stocks.data.networks;

import com.elsonji.stocks.data.models.MyRetroStock;

import java.util.ArrayList;

class StockResponse {
    private ArrayList<MyRetroStock> myRetroStocks = null;

    public void setMyRetroStocks(ArrayList<MyRetroStock> myRetroStocks) {
        this.myRetroStocks = myRetroStocks;
    }

    public ArrayList<MyRetroStock> getMyRetroStocks() {
        return myRetroStocks;
    }
}
