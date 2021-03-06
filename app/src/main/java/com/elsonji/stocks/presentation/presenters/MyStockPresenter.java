package com.elsonji.stocks.presentation.presenters;

import com.elsonji.stocks.domain.interactors.GetMyStockInteractor;
import com.elsonji.stocks.domain.models.mystock.MyStockList;
import com.elsonji.stocks.presentation.mappers.mystockmodelmapper.MyStockModelMapper;
import com.elsonji.stocks.presentation.models.mystockmodel.MyStockModelList;
import com.elsonji.stocks.presentation.views.MyStockListView;

import io.reactivex.observers.DisposableObserver;

public class MyStockPresenter implements Presenter {
    private GetMyStockInteractor getMyStockInteractor;
    private MyStockModelMapper mapper;
    private MyStockListView myStockListView;

    public MyStockPresenter(GetMyStockInteractor getMyStockInteractor, MyStockModelMapper mapper) {
        this.getMyStockInteractor = getMyStockInteractor;
        this.mapper = mapper;
    }

    public void setMyStockListView(MyStockListView listView) {
        myStockListView = listView;
    }

    public void getMyStockList() {
        getMyStockInteractor.execute(new DisposableObserver<MyStockList>() {
            @Override
            public void onNext(MyStockList myStocklist) {
                MyStockModelList myStockModelList = mapper.convertToMyStockModelList(myStocklist);
                myStockListView.renderMyStockListView(myStockModelList);
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
        getMyStockInteractor.dispose();
        myStockListView = null;
    }

}
