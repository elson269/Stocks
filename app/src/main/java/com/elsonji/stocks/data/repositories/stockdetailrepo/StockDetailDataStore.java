package com.elsonji.stocks.data.repositories.stockdetailrepo;

import com.elsonji.stocks.data.models.retrostockdetail.RetroStockDetail;

import io.reactivex.Observable;

public interface StockDetailDataStore {
    Observable<RetroStockDetail> getRetroStockDetail(String stockSymbol);
}
