package com.elsonji.stocks.data.repositories.stockdetailrepo;

import com.elsonji.stocks.data.mappers.stockdetailmapper.RetroStockDetailMapper;
import com.elsonji.stocks.data.models.retrostockdetail.RetroStockDetail;
import com.elsonji.stocks.domain.models.stockdetail.StockDetail;
import com.elsonji.stocks.domain.repositories.stockdetailrepo.StockDetailRepository;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class StockDetailRepositoryImpl implements StockDetailRepository {

    private StockDetailApiDataStore apiDataStore;
    private RetroStockDetailMapper mapper;

    public StockDetailRepositoryImpl(StockDetailApiDataStore apiDataStore,
                                     RetroStockDetailMapper mapper) {
        this.apiDataStore = apiDataStore;
        this.mapper = mapper;
    }

    @Override
    public Observable<StockDetail> getStockDetail(String symbolName) {
        return apiDataStore.getRetroStockDetail(symbolName).map(new Function<RetroStockDetail, StockDetail>() {
            @Override
            public StockDetail apply(RetroStockDetail retroStockDetail) throws Exception {
                return mapper.mapFrom(retroStockDetail);
            }
        });
    }
}
