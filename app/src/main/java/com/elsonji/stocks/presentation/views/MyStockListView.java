package com.elsonji.stocks.presentation.views;

import com.elsonji.stocks.presentation.models.MyStockModelList;

public interface MyStockListView extends LoadDataView {
    void renderMyStockListView(MyStockModelList myStockModelList);
}
