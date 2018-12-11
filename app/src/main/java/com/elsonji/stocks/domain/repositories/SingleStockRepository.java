package com.elsonji.stocks.domain.repositories;

import com.elsonji.stocks.domain.models.MyStock;

import io.reactivex.Observable;

public interface SingleStockRepository {
    Observable<MyStock> getSingleStock(String symbolName);
}
