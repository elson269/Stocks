package com.elsonji.stocks.data.repositories;

import com.elsonji.stocks.data.models.MyRetroStockList;
import com.elsonji.stocks.data.networks.ServiceGenerator;

import java.util.ArrayList;

import io.reactivex.Observable;

public class MyStockApiDataStore implements MyStockDataStore {
    @Override
    public Observable<MyRetroStockList> getMyRetroStocks(ArrayList<String> stockSymbolList) {

        return ServiceGenerator.getDataService().getMyStocks(convertToString(stockSymbolList));
    }

    private String convertToString(ArrayList<String> stockSymbolList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stockSymbolList.size(); i++) {
            stringBuilder.append(stockSymbolList.get(i));
            if (i != stockSymbolList.size()) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder.toString();
    }
}
