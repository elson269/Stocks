package com.elsonji.stocks.data.networks.stockdetailnetworks;

public class ServiceGenerator {
    private static StockDetailService myStockService;

    public static StockDetailService getDataService() {
        if (myStockService == null) {
            myStockService = RetrofitClientInstance.getRetrofitInstance().create(StockDetailService.class);
        }
        return myStockService;
    }
}
