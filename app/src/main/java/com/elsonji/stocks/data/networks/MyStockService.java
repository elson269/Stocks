package com.elsonji.stocks.data.networks;

import com.elsonji.stocks.data.models.MyRetroStockList;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MyStockService {
    @GET("stock/{symbol}/batch?types=quote")
    Observable<MyRetroStockList> getMyStocks(@Path("symbol") ArrayList<String> stockSymbolList );
}
