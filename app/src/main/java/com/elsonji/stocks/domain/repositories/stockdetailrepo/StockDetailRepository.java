package com.elsonji.stocks.domain.repositories.stockdetailrepo;

import com.elsonji.stocks.domain.models.stockdetail.StockDetail;

import io.reactivex.Observable;

public interface StockDetailRepository {
    Observable<StockDetail> getStockDetail(String symbolName);
}
