package com.elsonji.stocks.domain.repositories;

import com.elsonji.stocks.domain.models.MyStock;

import io.reactivex.Observable;

public interface StockDetailRepository {
    Observable<MyStock> getSingleStock(String symbolName);
}
