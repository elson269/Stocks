package com.elsonji.stocks.data.repositories.stockdetailrepo;

import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.repositories.StockDetailRepository;

import io.reactivex.Observable;

public class StockDetailApiDataStore implements StockDetailRepository {
    @Override
    public Observable<MyStock> getSingleStock(String symbolName) {
        return null;
    }
}
