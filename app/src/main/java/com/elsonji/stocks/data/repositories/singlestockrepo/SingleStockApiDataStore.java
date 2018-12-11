package com.elsonji.stocks.data.repositories.singlestockrepo;

import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.repositories.SingleStockRepository;

import io.reactivex.Observable;

public class SingleStockApiDataStore implements SingleStockRepository {
    @Override
    public Observable<MyStock> getSingleStock(String symbolName) {
        return null;
    }
}
