package com.elsonji.stocks.data.repositories;

import com.elsonji.stocks.data.models.MyRetroStock;
import com.elsonji.stocks.data.networks.ServiceGenerator;

import io.reactivex.Observable;

public class MyStockApiDataStore implements MyStockDataStore {
    @Override
    public Observable<MyRetroStock> getMyRetroStock(String stockSymbol) {
        return ServiceGenerator.getDataService().getMyStock(stockSymbol);
    }
}
