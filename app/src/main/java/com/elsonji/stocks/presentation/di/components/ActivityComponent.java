package com.elsonji.stocks.presentation.di.components;

import com.elsonji.stocks.presentation.di.modules.ActivityModule;
import com.elsonji.stocks.presentation.di.scopes.PerActivity;
import com.elsonji.stocks.presentation.views.activities.MainActivity;
import com.elsonji.stocks.presentation.views.adapters.MyStockAdapter;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
    void inject(MyStockAdapter myStockAdapter);
}
