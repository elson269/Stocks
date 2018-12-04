package com.elsonji.stocks.domain.repositories;

import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.models.MyStockList;

import java.util.ArrayList;

import io.reactivex.Observable;

public interface MyStockRepository {
    Observable<MyStockList> getMyStocks(ArrayList<String> stockSymbolList);
}
