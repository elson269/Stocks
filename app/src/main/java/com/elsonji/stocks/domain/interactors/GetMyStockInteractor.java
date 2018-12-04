package com.elsonji.stocks.domain.interactors;

import com.elsonji.stocks.domain.models.MyStockList;
import com.elsonji.stocks.domain.repositories.MyStockRepository;

import java.util.ArrayList;

import io.reactivex.Observable;

public class GetMyStockInteractor extends Interactor<MyStockList, ArrayList<String>> {

    private MyStockRepository myStockRepository;

    public GetMyStockInteractor(MyStockRepository myStockRepository) {
        this.myStockRepository = myStockRepository;
    }

    @Override
    public Observable<MyStockList> buildInteractorObservable(ArrayList<String> stockSymbolList) {
        return myStockRepository.getMyStocks(stockSymbolList);
    }
}
