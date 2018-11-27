package com.elsonji.stocks.data.networks;

import com.elsonji.stocks.data.models.MyRetroStock;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyStockService {
    @GET("stock/{symbol}/batch?types=quote")
    Observable<MyRetroStock> getMyStock();
}
