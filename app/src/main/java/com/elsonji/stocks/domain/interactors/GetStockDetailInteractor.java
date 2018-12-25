package com.elsonji.stocks.domain.interactors;

import com.elsonji.stocks.domain.models.stockdetail.StockDetail;
import com.elsonji.stocks.domain.repositories.stockdetailrepo.StockDetailRepository;

import io.reactivex.Observable;

public class GetStockDetailInteractor extends Interactor<StockDetail, String> {
    private StockDetailRepository stockDetailRepository;

    public GetStockDetailInteractor(StockDetailRepository stockDetailRepository) {
        this.stockDetailRepository = stockDetailRepository;
    }

    @Override
    Observable<StockDetail> buildInteractorObservable(String stockSymbol) {
        return stockDetailRepository.getStockDetail(stockSymbol);
    }
}
