package com.elsonji.stocks.data.networks.mystocknetworks;

import com.elsonji.stocks.data.models.MyRetroStockList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api.iextrading.com/1.0/";

    public static Retrofit getRetrofitInstance() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(MyRetroStockList.class, new StockDeserializer())
                .create();

        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    //This converts the response JSON into GSON and then into the POJO objects.
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    //This verifies we are using RxJava2 for this API call.
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
