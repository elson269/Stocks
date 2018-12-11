package com.elsonji.stocks.domain.interactors;

import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.repositories.SingleStockRepository;

import io.reactivex.Observable;

public class GetSingleStockInteractor extends Interactor<MyStock, String> {
    private SingleStockRepository singleStockRepository;

    public GetSingleStockInteractor(SingleStockRepository singleStockRepository) {
        this.singleStockRepository = singleStockRepository;
    }

    @Override
    Observable<MyStock> buildInteractorObservable(String stockSymbol) {
        return singleStockRepository.getSingleStock(stockSymbol);
    }
}
