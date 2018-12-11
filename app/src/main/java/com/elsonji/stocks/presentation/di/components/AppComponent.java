package com.elsonji.stocks.presentation.di.components;

import android.content.Context;

import com.elsonji.stocks.data.mappers.MyRetroStockMapper;
import com.elsonji.stocks.data.repositories.mystockrepo.MyStockApiDataStore;
import com.elsonji.stocks.presentation.di.modules.AppModule;
import com.elsonji.stocks.presentation.mappers.MyStockModelMapper;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context context();
    MyStockModelMapper myStockModelMapper();
    MyRetroStockMapper myRetroStockMapper();
    MyStockApiDataStore myStockApiDataStore();
}
