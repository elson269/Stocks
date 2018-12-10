package com.elsonji.stocks.data.networks;

import android.nfc.Tag;
import android.util.Log;

import com.elsonji.stocks.data.models.MyRetroStock;
import com.elsonji.stocks.data.models.MyRetroStockList;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public class StockDeserializer implements JsonDeserializer<MyRetroStockList> {

    @Override
    public MyRetroStockList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        Gson gson = new Gson();
        JsonObject value = json.getAsJsonObject();
        MyRetroStockList myRetroStockList = new MyRetroStockList();
        if (value != null) {


            Iterable<Map.Entry<String, JsonElement>> entries = value.entrySet();
            ArrayList<MyRetroStock> myRetroStocks = new ArrayList<>();
            for (Map.Entry<String, JsonElement> entry : entries) {
                myRetroStocks.add(gson.fromJson(entry.getValue().getAsJsonObject().get("quote").getAsJsonObject().toString(), MyRetroStock.class));
            }
            myRetroStockList.setMyRetroStockList(myRetroStocks);

        }
        return myRetroStockList;
    }
}


