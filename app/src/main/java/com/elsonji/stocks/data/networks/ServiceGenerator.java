package com.elsonji.stocks.data.networks;

public class ServiceGenerator {
    private static MyStockService myStockService;
    public static MyStockService getDataService() {
        if (myStockService == null) {
            myStockService = RetrofitClientInstance.getRetrofitInstance().create(MyStockService.class);
        }
        return myStockService;
    }
}
