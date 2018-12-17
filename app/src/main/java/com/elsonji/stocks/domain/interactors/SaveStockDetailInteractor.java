package com.elsonji.stocks.domain.interactors;

import com.elsonji.stocks.domain.models.mystock.MyStock;

import io.reactivex.Observable;

public class SaveStockDetailInteractor extends Interactor<MyStock, Void> {
    @Override
    Observable<MyStock> buildInteractorObservable(Void aVoid) {
        return null;
    }
}
