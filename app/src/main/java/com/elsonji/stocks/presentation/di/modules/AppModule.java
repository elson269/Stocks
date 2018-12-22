package com.elsonji.stocks.presentation.di.modules;

import android.content.Context;

import com.elsonji.stocks.data.mappers.myretrostockmapper.MyRetroStockMapper;
import com.elsonji.stocks.data.repositories.mystockrepo.MyStockApiDataStore;
import com.elsonji.stocks.presentation.mappers.mystockmodelmapper.MyStockModelMapper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private Context context;
    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context providesContext() {
        return context;
    }

    @Provides
    @Singleton
    MyRetroStockMapper provideMyRetroStockMapper() {
        return new MyRetroStockMapper();
    }

    @Provides
    @Singleton
    MyStockModelMapper provideMyStockModelMapper() {
        return new MyStockModelMapper();
    }

    @Provides
    @Singleton
    MyStockApiDataStore provideMyStockApiDataStore() {
        return new MyStockApiDataStore();
    }
}
