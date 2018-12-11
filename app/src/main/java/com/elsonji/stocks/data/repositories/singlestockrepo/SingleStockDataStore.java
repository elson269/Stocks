package com.elsonji.stocks.data.repositories.singlestockrepo;

import com.elsonji.stocks.domain.models.MyStock;

import io.reactivex.Observable;

public interface SingleStockDataStore {
    Observable<MyStock> getSingleStock(String stockSymbol);
}
