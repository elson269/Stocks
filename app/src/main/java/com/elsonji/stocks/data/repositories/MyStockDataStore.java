package com.elsonji.stocks.data.repositories;

import com.elsonji.stocks.data.models.MyRetroStock;

import io.reactivex.Observable;

public interface MyStockDataStore {
    Observable<MyRetroStock> getMyRetroStock(String stockSymbol);
}
