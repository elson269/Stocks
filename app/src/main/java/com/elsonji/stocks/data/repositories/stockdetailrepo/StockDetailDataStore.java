package com.elsonji.stocks.data.repositories.stockdetailrepo;

import com.elsonji.stocks.domain.models.MyStock;

import io.reactivex.Observable;

public interface StockDetailDataStore {
    Observable<MyStock> getSingleStock(String stockSymbol);
}
