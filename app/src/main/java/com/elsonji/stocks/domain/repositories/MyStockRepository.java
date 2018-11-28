package com.elsonji.stocks.domain.repositories;

import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.models.MyStockList;

import io.reactivex.Observable;

public interface MyStockRepository {
    Observable<MyStock> getMyStock(String stockSymbol);
}
