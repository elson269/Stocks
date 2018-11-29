package com.elsonji.stocks.presentation.mappers;


import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.presentation.models.MyStockModel;

public class MyStockModelMapper {

    public MyStockModel mapFrom(MyStock myStock) {
        MyStockModel myStockModel = null;
        if (myStock != null) {
            myStockModel = new MyStockModel(myStock.getSymbol(), myStock.getCompanyName(),
                    myStock.getLatestPrice(), myStock.getChange(), myStock.getChangePercent());
        }
        return myStockModel;
    }
}
