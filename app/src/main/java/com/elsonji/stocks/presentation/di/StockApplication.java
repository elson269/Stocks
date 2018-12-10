package com.elsonji.stocks.presentation.di;

import android.app.Application;

import com.elsonji.stocks.presentation.di.components.ActivityComponent;
import com.elsonji.stocks.presentation.di.components.AppComponent;
import com.elsonji.stocks.presentation.di.components.DaggerActivityComponent;
import com.elsonji.stocks.presentation.di.components.DaggerAppComponent;
import com.elsonji.stocks.presentation.di.modules.AppModule;

public class StockApplication extends Application {
    private static AppComponent component;
    private static ActivityComponent activityComponent;

    public static ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        activityComponent = DaggerActivityComponent.builder()
                .appComponent(component)
                .build();
    }
}
