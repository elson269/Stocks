package com.elsonji.stocks.data.repositories.mystockrepo;

import com.elsonji.stocks.data.models.myretrostock.MyRetroStockList;
import com.elsonji.stocks.data.networks.mystocknetworks.ServiceGenerator;

import java.util.ArrayList;

import io.reactivex.Observable;

public class MyStockApiDataStore implements MyStockDataStore {
    @Override
    public Observable<MyRetroStockList> getMyRetroStocks(ArrayList<String> stockSymbolList) {
        return ServiceGenerator.getDataService().getMyStocks(convertToString(stockSymbolList), "quote");
    }

    private String convertToString(ArrayList<String> stockSymbolList) {
        StringBuilder stringBuilder = new StringBuilder();
        if (stockSymbolList != null) {
            for (int i = 0; i < stockSymbolList.size(); i++) {
                stringBuilder.append(stockSymbolList.get(i));
                if (i != stockSymbolList.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            return stringBuilder.toString();
        } else {
            return null;
        }
    }
}
