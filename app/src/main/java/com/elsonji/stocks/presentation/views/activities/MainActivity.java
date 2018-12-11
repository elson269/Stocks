package com.elsonji.stocks.presentation.views.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.elsonji.stocks.R;
import com.elsonji.stocks.data.mappers.MyRetroStockMapper;
import com.elsonji.stocks.data.repositories.mystockrepo.MyStockApiDataStore;
import com.elsonji.stocks.data.repositories.mystockrepo.MyStockRepositoryImpl;
import com.elsonji.stocks.domain.interactors.GetMyStockInteractor;
import com.elsonji.stocks.domain.models.MyStockList;
import com.elsonji.stocks.presentation.di.StockApplication;
import com.elsonji.stocks.presentation.mappers.MyStockModelMapper;
import com.elsonji.stocks.presentation.models.MyStockModelList;
import com.elsonji.stocks.presentation.presenters.MyStockPresenter;
import com.elsonji.stocks.presentation.views.MyStockListView;
import com.elsonji.stocks.presentation.views.adapters.MyStockAdapter;

import java.util.ArrayList;
import java.util.Arrays;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements MyStockListView {
    @BindView(R.id.my_stock_list_recycler_view)

    RecyclerView mRecyclerView;
    @Inject
    MyStockAdapter mAdapter;
    @Inject
    MyStockModelMapper mMyStockModelMapper;
    @Inject
    MyRetroStockMapper mMyRetroStockMapper;
    @Inject
    MyStockRepositoryImpl mMyStockRepositoryImpl;
    @Inject
    GetMyStockInteractor mGetMyStockInteractor;
    @Inject
    MyStockPresenter mPresenter;
    @Inject
    MyStockApiDataStore mDataStore;

    ArrayList<String> mStockSymbolList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        StockApplication.getActivityComponent().inject(this);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] stockList = {"OHGI", "AAPL"};
        mStockSymbolList = new ArrayList<>(Arrays.asList(stockList));

        mPresenter.setMyStockListView(this);
        mPresenter.getMyStockList();

        loadMyStockList(mStockSymbolList);
    }

    private void loadMyStockList(ArrayList<String> stockSymbolList) {
        setItems(mGetMyStockInteractor.buildInteractorObservable(stockSymbolList));
    }

    private void setItems(Observable<MyStockList> itemObservable) {


        itemObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MyStockList>() {
                    @Override
                    public void accept(MyStockList myStocks) throws Exception {
                        mAdapter.setItems(myStocks);
                    }
                });
    }

    @Override
    public void renderMyStockListView(MyStockModelList myStockModelList) {
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String errorMessage) {

    }

    @Override
    public Context getContext() {
        return this;
    }


}
