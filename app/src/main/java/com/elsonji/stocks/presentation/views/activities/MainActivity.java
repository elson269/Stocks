package com.elsonji.stocks.presentation.views.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.elsonji.stocks.R;
import com.elsonji.stocks.data.mappers.MyRetroStockMapper;
import com.elsonji.stocks.data.repositories.MyStockApiDataStore;
import com.elsonji.stocks.data.repositories.MyStockRepositoryImpl;
import com.elsonji.stocks.domain.interactors.GetMyStockInteractor;
import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.presentation.mappers.MyStockModelMapper;
import com.elsonji.stocks.presentation.models.MyStockModel;
import com.elsonji.stocks.presentation.presenters.MyStockPresenter;
import com.elsonji.stocks.presentation.views.MyStockListView;
import com.elsonji.stocks.presentation.views.adapters.MyStockAdapter;

import java.util.ArrayList;
import java.util.function.ToDoubleBiFunction;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements MyStockListView {
    @BindView(R.id.my_stock_list_recycler_view)
    RecyclerView mRecyclerView;
    MyStockAdapter mAdapter;
    MyStockModelMapper mMyStockModelMapper;
    MyRetroStockMapper mMyRetroStockMapper;
    MyStockRepositoryImpl mMyStockRepositoryImpl;
    GetMyStockInteractor mGetMyStockInteractor;
    MyStockPresenter mPresenter;
    MyStockApiDataStore mDataStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAdapter = new MyStockAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mPresenter.setMyStockListView(this);
        mPresenter.getMyStockList();

        loadMyStockList();
    }

    private void loadMyStockList() {
        //setItems(mGetMyStockInteractor.buildInteractorObservable("ohgi"));
    }

    private void setItems(Observable<ArrayList<MyStock>> itemObservable) {
        itemObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ArrayList<MyStock>>() {
                    @Override
                    public void accept(ArrayList<MyStock> myStocks) throws Exception {
                        mAdapter.setItems(myStocks);
                    }
                });
    }

    @Override
    public void renderMyStockListView(ArrayList<MyStockModel> myStockModelList) {

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
        return null;
    }
}
