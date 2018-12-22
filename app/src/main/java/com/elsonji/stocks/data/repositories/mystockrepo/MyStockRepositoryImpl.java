package com.elsonji.stocks.data.repositories.mystockrepo;

import com.elsonji.stocks.data.mappers.myretrostockmapper.MyRetroStockMapper;
import com.elsonji.stocks.data.models.myretrostock.MyRetroStockList;
import com.elsonji.stocks.domain.models.mystock.MyStockList;
import com.elsonji.stocks.domain.repositories.mystockrepo.MyStockRepository;

import java.util.ArrayList;

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
    public Observable<MyStockList> getMyStocks(ArrayList<String> stockSymbolList) {
        return myStockApiDataStore.getMyRetroStocks(stockSymbolList).map(new Function<MyRetroStockList, MyStockList>() {
            @Override
            public MyStockList apply(MyRetroStockList myRetroStockList) throws Exception {
                return mapper.convertToMyStockList(myRetroStockList);
            }
        });
    }
}
