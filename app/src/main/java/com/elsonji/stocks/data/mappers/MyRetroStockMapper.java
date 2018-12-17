package com.elsonji.stocks.data.mappers;

import com.elsonji.stocks.data.models.myretrostock.MyRetroStock;
import com.elsonji.stocks.data.models.myretrostock.MyRetroStockList;
import com.elsonji.stocks.domain.models.mystock.MyStock;
import com.elsonji.stocks.domain.models.mystock.MyStockList;

import java.util.ArrayList;

public class MyRetroStockMapper {

    private MyStock mapFrom(MyRetroStock myRetroStock) {
        MyStock myStock = null;
        if (myRetroStock != null) {
            myStock = new MyStock(myRetroStock.getSymbol(), myRetroStock.getCompanyName(),
                    myRetroStock.getLatestPrice(), myRetroStock.getChange(), myRetroStock.getChangePercent());
        }
        return myStock;
    }

    public MyStockList convertToMyStockList(MyRetroStockList myRetroStockList) {
        MyStockList myStockList = new MyStockList();
        ArrayList<MyStock> myStocks = new ArrayList<>();
        MyStock myStock;
          for (MyRetroStock myRetroStock : myRetroStockList.getMyRetroStockList()) {
                if (myRetroStock != null) {
                    myStock = mapFrom(myRetroStock);
                    myStocks.add(myStock);
                    myStockList.setStocks(myStocks);
                }
            }
            return myStockList;
    }
}
