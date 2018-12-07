package com.elsonji.stocks.data.networks;

import com.elsonji.stocks.data.models.MyRetroStockList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface MyStockService {
    @GET
    Observable<MyRetroStockList> getMyStocks(@Url String url);
}
