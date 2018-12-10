package com.elsonji.stocks.presentation.mappers;


import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.models.MyStockList;
import com.elsonji.stocks.presentation.models.MyStockModel;
import com.elsonji.stocks.presentation.models.MyStockModelList;

import java.util.ArrayList;

public class MyStockModelMapper {

    private MyStockModel mapFrom(MyStock myStock) {
        MyStockModel myStockModel = null;
        if (myStock != null) {
            myStockModel = new MyStockModel(myStock.getSymbol(), myStock.getCompanyName(),
                    myStock.getLatestPrice(), myStock.getChange(), myStock.getChangePercent());
        }
        return myStockModel;
    }


    public MyStockModelList convertToMyStockModelList(MyStockList myStockList) {
        MyStockModelList myStockModelList = new MyStockModelList();
        ArrayList<MyStockModel> myStockModels = new ArrayList<>();
        MyStockModel myStockModel;
        for (MyStock myStock : myStockList.getStocks()) {
            if (myStock != null) {
                myStockModel = mapFrom(myStock);
                myStockModels.add(myStockModel);
                myStockModelList.setMyStockModelList(myStockModels);
            }
        }
        return myStockModelList;
    }
}
