package com.elsonji.stocks.data.repositories;

import com.elsonji.stocks.data.mappers.MyRetroStockMapper;
import com.elsonji.stocks.data.models.MyRetroStock;
import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.repositories.MyStockRepository;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class MyStockRepositoryImpl implements MyStockRepository {
    private MyStockApiDataStore myStockApiDataStore;
    private MyRetroStockMapper mapper;

    public MyStockRepositoryImpl(MyStockApiDataStore dataStore, MyRetroStockMapper mapper) {
        myStockApiDataStore = dataStore;
        this.mapper = mapper;
    }
    @Override
    public Observable<MyStock> getMyStock(String stockSymbol) {
        return myStockApiDataStore.getMyRetroStock(stockSymbol).map(new Function<MyRetroStock, MyStock>() {
            @Override
            public MyStock apply(MyRetroStock myRetroStock) throws Exception {
                return mapper.mapFrom(myRetroStock);
            }
        });
    }
}
