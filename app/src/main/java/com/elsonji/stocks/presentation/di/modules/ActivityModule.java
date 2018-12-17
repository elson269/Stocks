package com.elsonji.stocks.presentation.di.modules;

import android.content.Context;

import com.elsonji.stocks.data.mappers.MyRetroStockMapper;
import com.elsonji.stocks.data.repositories.mystockrepo.MyStockApiDataStore;
import com.elsonji.stocks.data.repositories.mystockrepo.MyStockRepositoryImpl;
import com.elsonji.stocks.domain.interactors.GetMyStockInteractor;
import com.elsonji.stocks.domain.models.mystock.MyStock;
import com.elsonji.stocks.presentation.di.scopes.PerActivity;
import com.elsonji.stocks.presentation.mappers.MyStockModelMapper;
import com.elsonji.stocks.presentation.presenters.MyStockPresenter;
import com.elsonji.stocks.presentation.views.adapters.MyStockAdapter;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    @PerActivity
    @Provides
    MyStockPresenter provideMyStockPresenter(GetMyStockInteractor interactor, MyStockModelMapper mapper) {
        return new MyStockPresenter(interactor, mapper);
    }

    @PerActivity
    @Provides
    GetMyStockInteractor provideGetMyStockInteractor(MyStockRepositoryImpl myStockRepository) {
        return new GetMyStockInteractor(myStockRepository);
    }

    @PerActivity
    @Provides
    MyStockRepositoryImpl provideMyStockRepositoryImpl(MyStockApiDataStore store, MyRetroStockMapper mapper) {
        return new MyStockRepositoryImpl(store, mapper);
    }

    @PerActivity
    @Provides
    MyStockAdapter provideMyStockAdapter(Context context) {
        return new MyStockAdapter(context);
    }

    @PerActivity
    @Provides
    ArrayList<MyStock> provideMyStockList() {
        return new ArrayList<>();
    }
}
