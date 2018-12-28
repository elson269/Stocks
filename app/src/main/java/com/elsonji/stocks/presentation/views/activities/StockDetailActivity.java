package com.elsonji.stocks.presentation.views.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.elsonji.stocks.R;
import com.elsonji.stocks.data.mappers.stockdetailmapper.RetroStockDetailMapper;
import com.elsonji.stocks.data.repositories.stockdetailrepo.StockDetailApiDataStore;
import com.elsonji.stocks.data.repositories.stockdetailrepo.StockDetailRepositoryImpl;
import com.elsonji.stocks.domain.interactors.GetStockDetailInteractor;
import com.elsonji.stocks.presentation.mappers.stockdetailmodelmapper.StockDetailModelMapper;
import com.elsonji.stocks.presentation.presenters.stockdetailpersenter.StockDetailPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StockDetailActivity extends AppCompatActivity {

    @BindView(R.id.symbolTextView)
    TextView symbolTV;
    @BindView(R.id.latestPriceTextView)
    TextView latestPriceTextView;
    @BindView(R.id.changeTextView)
    TextView changeTextView;
    @BindView(R.id.changePercentTextView)
    TextView changePercentTextView;
    @BindView(R.id.latestSourceTextView)
    TextView lastestSourceTextView;
    @BindView(R.id.latestUpdateTextView)
    TextView latestUpdateTextView;
    @BindView(R.id.latestTimeTextView)
    TextView latestTimeTextView;
    @BindView(R.id.primaryExchangeTextView)
    TextView primaryExchangeTextView;

    StockDetailModelMapper stockDetailModelMapper;
    RetroStockDetailMapper retroStockDetailMapper;
    GetStockDetailInteractor getStockDetailInteractor;
    StockDetailRepositoryImpl stockDetailRepository;
    StockDetailPresenter presenter;
    StockDetailApiDataStore detailApiDataStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_detail);
        ButterKnife.bind(this);
    }
}
