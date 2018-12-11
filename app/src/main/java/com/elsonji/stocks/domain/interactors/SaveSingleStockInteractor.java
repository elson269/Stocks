package com.elsonji.stocks.domain.interactors;

import com.elsonji.stocks.domain.models.MyStock;

import io.reactivex.Observable;

public class SaveSingleStockInteractor extends Interactor<MyStock, Void> {
    @Override
    Observable<MyStock> buildInteractorObservable(Void aVoid) {
        return null;
    }
}
