package com.elsonji.stocks.data.mappers.stockdetailmapper;

import com.elsonji.stocks.data.models.retrostockdetail.RetroStockDetail;
import com.elsonji.stocks.domain.models.stockdetail.StockDetail;

public class RetroStockDetailMapper {

    public StockDetail mapFrom(RetroStockDetail retroStockDetail) {
        StockDetail stockDetail = null;
        if (retroStockDetail != null) {
            stockDetail = new StockDetail();
        }
        return stockDetail;
    }
}
