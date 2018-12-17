package com.elsonji.stocks.data.repositories.stockdetailrepo;

import com.elsonji.stocks.data.models.retrostockdetail.RetroStockDetail;
import com.elsonji.stocks.data.networks.stockdetailnetworks.ServiceGenerator;

import io.reactivex.Observable;

public class StockDetailApiDataStore implements StockDetailDataStore {
    @Override
    public Observable<RetroStockDetail> getRetroStockDetail(String symbolName) {
        return ServiceGenerator.getDataService().getStockDetailBySymbol(symbolName, "quote,news");
    }
}
