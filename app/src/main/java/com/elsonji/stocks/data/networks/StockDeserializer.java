package com.elsonji.stocks.data.networks;

import android.util.Log;

import com.elsonji.stocks.data.models.MyRetroStock;
import com.elsonji.stocks.data.models.MyRetroStockList;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public class StockDeserializer implements JsonDeserializer<MyRetroStockList> {

    @Override
    public MyRetroStockList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {

        Log.i("aaaaadfdfd", "ggggggg");
        Gson gson = new Gson();
        JsonElement value = json.getAsJsonObject();
        //StockResponse stockResponse = new StockResponse();
        MyRetroStockList myRetroStockList = new MyRetroStockList();
        if (value != null) {
            Iterable<Map.Entry<String, JsonElement>> entries = value.getAsJsonObject().entrySet();
            ArrayList<MyRetroStock> myRetroStocks = new ArrayList<>();
            for (Map.Entry<String, JsonElement> entry : entries) {
                myRetroStocks.add(gson.fromJson(entry.getValue(), MyRetroStock.class));
            }
            myRetroStockList.setMyRetroStockList(myRetroStocks);

        }
//        ArrayList<JsonObject> quoteElements = new ArrayList<>();
//
//
//        JsonObject jsonObject = json.getAsJsonObject();
//        Set<Map.Entry<String, JsonElement>> symbolSet = jsonObject.entrySet();
//
//        for (Map.Entry<String, JsonElement> entryItem : symbolSet) {
//            quoteElements.add(entryItem.getValue().getAsJsonObject());
//        }
//
//        for (JsonObject jsonObject1 : quoteElements) {
//            myRetroStocks.add(gson.fromJson(jsonObject1.getAsJsonObject("quote").toString(), MyRetroStock.class));
//        }
//
//        stockResponse.setMyRetroStocks(myRetroStocks);


        return myRetroStockList;
    }
}


