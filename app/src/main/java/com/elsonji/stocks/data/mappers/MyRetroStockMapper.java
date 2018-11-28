package com.elsonji.stocks.data.mappers;

import com.elsonji.stocks.data.models.MyRetroStock;
import com.elsonji.stocks.domain.models.MyStock;

public class MyRetroStockMapper {

    public MyStock mapFrom(MyRetroStock myRetroStock) {
        MyStock myStock = null;
        if (myRetroStock != null) {
            myStock = new MyStock(myRetroStock.getSymbol(), myRetroStock.getCompanyName(),
                    myRetroStock.getLatestPrice(), myRetroStock.getChange(), myRetroStock.getChangePercent());
        }
        return myStock;
    }
}
