package com.elsonji.stocks.domain.repositories.mystockrepo;

import com.elsonji.stocks.domain.models.mystock.MyStockList;

import java.util.ArrayList;

import io.reactivex.Observable;

public interface MyStockRepository {
    Observable<MyStockList> getMyStocks(ArrayList<String> stockSymbolList);
}
