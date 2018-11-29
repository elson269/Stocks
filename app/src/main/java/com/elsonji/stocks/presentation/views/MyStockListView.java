package com.elsonji.stocks.presentation.views;

import com.elsonji.stocks.presentation.models.MyStockModel;

import java.util.ArrayList;

public interface MyStockListView extends LoadDataView {
    void renderMyStockListView(ArrayList<MyStockModel> myStockModelList);
}
