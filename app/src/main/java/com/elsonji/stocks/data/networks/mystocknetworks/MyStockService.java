package com.elsonji.stocks.data.networks.mystocknetworks;

import com.elsonji.stocks.data.models.myretrostock.MyRetroStockList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MyStockService {
    @GET("stock/market/batch")
    Observable<MyRetroStockList> getMyStocks(@Query("symbols") String symbolString,
                                             @Query("types") String types);
}
