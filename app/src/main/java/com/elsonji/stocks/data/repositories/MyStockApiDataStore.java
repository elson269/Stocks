package com.elsonji.stocks.data.repositories;

import com.elsonji.stocks.data.models.MyRetroStockList;
import com.elsonji.stocks.data.networks.ServiceGenerator;

import java.util.ArrayList;

import io.reactivex.Observable;

public class MyStockApiDataStore implements MyStockDataStore {
    @Override
    public Observable<MyRetroStockList> getMyRetroStocks(ArrayList<String> stockSymbolList) {
        return ServiceGenerator.getDataService().getMyStocks(stockSymbolList);
    }
}
