package com.elsonji.stocks.domain.interactors;

import com.elsonji.stocks.domain.models.MyStockList;
import com.elsonji.stocks.domain.repositories.MyStockRepository;

import io.reactivex.Observable;

public class GetMyStocksInteractor extends Interactor<MyStockList, Void>{

    private MyStockRepository myStockRepository;

    public GetMyStocksInteractor(MyStockRepository myStockRepository) {
        this.myStockRepository = myStockRepository;
    }
    @Override
    Observable<MyStockList> buildInteractorObservable(Void aVoid) {
        return myStockRepository.getMyStocks();
    }
}
