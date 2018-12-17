package com.elsonji.stocks.domain.interactors;

import com.elsonji.stocks.domain.models.mystock.MyStock;
import com.elsonji.stocks.domain.repositories.stockdetailrepo.StockDetailRepository;

import io.reactivex.Observable;

public class GetStockDetailInteractor extends Interactor<MyStock, String> {
    private StockDetailRepository singleStockRepository;

    public GetStockDetailInteractor(StockDetailRepository singleStockRepository) {
        this.singleStockRepository = singleStockRepository;
    }

    @Override
    Observable<MyStock> buildInteractorObservable(String stockSymbol) {
        return singleStockRepository.getSingleStock(stockSymbol);
    }
}
