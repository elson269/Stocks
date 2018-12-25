package com.elsonji.stocks.presentation.views;

import com.elsonji.stocks.presentation.models.stockdetailmodel.StockDetailModel;

public interface StockDetailView extends LoadDataView {
    void renderStockDetailView(StockDetailModel stockDetailModel);
}
