package com.elsonji.stocks.domain.interactors;

import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.models.MyStockList;
import com.elsonji.stocks.domain.repositories.MyStockRepository;

import io.reactivex.Observable;

public class GetMyStockInteractor extends Interactor<MyStock, String>{

    private MyStockRepository myStockRepository;

    public GetMyStockInteractor(MyStockRepository myStockRepository) {
        this.myStockRepository = myStockRepository;
    }
    @Override
    Observable<MyStock> buildInteractorObservable(String stockSymbol) {
        return myStockRepository.getMyStock(stockSymbol);
    }
}
