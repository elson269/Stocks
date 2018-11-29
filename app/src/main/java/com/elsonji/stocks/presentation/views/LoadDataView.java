package com.elsonji.stocks.presentation.views;

import android.content.Context;

public interface LoadDataView {
    void showLoading();
    void hideLoading();
    void showError(String errorMessage);
    Context getContext();
}
