package com.elsonji.stocks.data.networks;

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
import java.util.Set;

public class StockDeserializer implements JsonDeserializer {
    @Override
    public StockResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        StockResponse stockResponse = new StockResponse();
        ArrayList<JsonObject> quoteElements = new ArrayList<>();
        ArrayList<MyRetroStock> myRetroStocks = new ArrayList<>();
        Gson gson = new Gson();

        JsonObject jsonObject = json.getAsJsonObject();
        Set<Map.Entry<String, JsonElement>> symbolSet = jsonObject.entrySet();

        for (Map.Entry<String, JsonElement> entryItem : symbolSet) {
            quoteElements.add(entryItem.getValue().getAsJsonObject());
        }

        for (JsonObject jsonObject1 : quoteElements) {
            myRetroStocks.add(gson.fromJson(jsonObject1.get("quote").getAsJsonObject().toString(),
                    MyRetroStock.class));
        }
        stockResponse.myRetroStocks = myRetroStocks;

        return stockResponse;
    }
}


