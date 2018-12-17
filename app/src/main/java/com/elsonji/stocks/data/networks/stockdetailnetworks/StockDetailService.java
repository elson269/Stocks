package com.elsonji.stocks.data.networks.stockdetailnetworks;

import com.elsonji.stocks.data.models.retrostockdetail.RetroStockDetail;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StockDetailService {
    @GET("stock/{symbol}/batch")
    Observable<RetroStockDetail> getStockDetailBySymbol(@Path("symbol") String symbol, @Query("types") String types);
}
