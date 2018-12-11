package com.elsonji.stocks.data.networks.singlestocknetworks;

import com.elsonji.stocks.domain.models.MyStock;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SingleStockService {
    @GET("stock/{symbol}/batch")
    Observable<MyStock> getSingleStockBySymbol(@Path("symbol") String symbol, @Query("types") String types);
}
