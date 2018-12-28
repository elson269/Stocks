package com.elsonji.stocks.presentation.views.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.elsonji.stocks.R;
import com.elsonji.stocks.data.mappers.stockdetailmapper.RetroStockDetailMapper;
import com.elsonji.stocks.data.repositories.stockdetailrepo.StockDetailApiDataStore;
import com.elsonji.stocks.data.repositories.stockdetailrepo.StockDetailRepositoryImpl;
import com.elsonji.stocks.domain.interactors.GetStockDetailInteractor;
import com.elsonji.stocks.domain.models.stockdetail.StockDetail;
import com.elsonji.stocks.presentation.mappers.stockdetailmodelmapper.StockDetailModelMapper;
import com.elsonji.stocks.presentation.presenters.stockdetailpersenter.StockDetailPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

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
    TextView latestSourceTextView;
    @BindView(R.id.latestUpdateTextView)
    TextView latestUpdateTextView;
    @BindView(R.id.latestTimeTextView)
    TextView latestTimeTextView;
    @BindView(R.id.primaryExchangeTextView)
    TextView primaryExchangeTextView;
    @BindView(R.id.prevCloseTV)
    TextView pervCloseTextView;
    @BindView(R.id.openTV)
    TextView openTextView;
    @BindView(R.id.lowTV)
    TextView lowTextView;
    @BindView(R.id.highTV)
    TextView highTextView;
    @BindView(R.id.wk52LowTV)
    TextView wk52LowTextView;
    @BindView(R.id.wk52HighTV)
    TextView wk52HighTextView;
    @BindView(R.id.marketCapTV)
    TextView marketCapTextView;
    @BindView(R.id.volumeTV)
    TextView volumeTextView;
    @BindView(R.id.averageVolumeTV)
    TextView averageVolumeTextView;
    @BindView(R.id.peRatioTV)
    TextView peRatioTextView;
    @BindView(R.id.ytdChangeTV)
    TextView ytdChangeTextView;

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

        stockDetailModelMapper = new StockDetailModelMapper();
        retroStockDetailMapper = new RetroStockDetailMapper();
        detailApiDataStore = new StockDetailApiDataStore();
        stockDetailRepository = new StockDetailRepositoryImpl(detailApiDataStore, retroStockDetailMapper);
        getStockDetailInteractor = new GetStockDetailInteractor(stockDetailRepository);
        presenter = new StockDetailPresenter(getStockDetailInteractor, stockDetailModelMapper);

        loadStockDetails("aapl");

    }

    private void loadStockDetails(String stockSymbol) {
        setStockValue(getStockDetailInteractor.buildInteractorObservable(stockSymbol));
    }

    private void setStockValue(Observable<StockDetail> stockDetailObservable) {
        stockDetailObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<StockDetail>() {
                    @Override
                    public void accept(StockDetail stockDetail) throws Exception {


                    }
                });
    }
}
