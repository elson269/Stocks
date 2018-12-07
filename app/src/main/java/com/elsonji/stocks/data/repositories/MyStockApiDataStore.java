package com.elsonji.stocks.data.repositories;

import android.util.Log;

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
        String url = "stock/market/batch?symbols=";
        String url2 = "&types=quote";
        if (stockSymbolList != null) {
            for (int i = 0; i < stockSymbolList.size(); i++) {
                stringBuilder.append(stockSymbolList.get(i));
                if (i != stockSymbolList.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            return url + stringBuilder.toString() + url2;
        } else {
            return null;
        }
    }
}
