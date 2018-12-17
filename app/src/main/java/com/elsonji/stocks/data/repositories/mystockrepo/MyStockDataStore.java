package com.elsonji.stocks.data.repositories.mystockrepo;

import com.elsonji.stocks.data.models.myretrostock.MyRetroStockList;

import java.util.ArrayList;

import io.reactivex.Observable;

public interface MyStockDataStore {
    Observable<MyRetroStockList> getMyRetroStocks(ArrayList<String> stockSymbolList);
}
