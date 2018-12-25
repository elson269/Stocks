package com.elsonji.stocks.presentation.presenters.stockdetailpersenter;

import com.elsonji.stocks.domain.interactors.GetStockDetailInteractor;
import com.elsonji.stocks.domain.models.stockdetail.StockDetail;
import com.elsonji.stocks.presentation.mappers.stockdetailmodelmapper.StockDetailModelMapper;
import com.elsonji.stocks.presentation.models.stockdetailmodel.StockDetailModel;
import com.elsonji.stocks.presentation.presenters.Presenter;
import com.elsonji.stocks.presentation.views.StockDetailView;

import io.reactivex.observers.DisposableObserver;

public class StockDetailPresenter implements Presenter {
    private GetStockDetailInteractor interactor;
    private StockDetailModelMapper mapper;
    private StockDetailView view;

    public StockDetailPresenter(GetStockDetailInteractor interactor, StockDetailModelMapper mapper) {
        this.interactor = interactor;
        this.mapper = mapper;
    }

    public void setStockDetailView(StockDetailView view) {
        this.view = view;
    }

    public void getStockDetail() {
        interactor.execute(new DisposableObserver<StockDetail>() {
            @Override
            public void onNext(StockDetail stockDetail) {
                StockDetailModel stockDetailModel = mapper.mapFrom(stockDetail);
                view.renderStockDetailView(stockDetailModel);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        }, null);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {
        interactor.dispose();
        view = null;
    }
}
