package com.elsonji.stocks.presentation.mappers.stockdetailmodelmapper;

import com.elsonji.stocks.domain.models.stockdetail.News;
import com.elsonji.stocks.domain.models.stockdetail.StockDetail;
import com.elsonji.stocks.presentation.models.stockdetailmodel.NewsModel;
import com.elsonji.stocks.presentation.models.stockdetailmodel.StockDetailModel;

import java.util.ArrayList;
import java.util.List;

public class StockDetailModelMapper {

    public StockDetailModel mapFrom(StockDetail stockDetail) {
        StockDetailModel stockDetailModel = null;
        if (stockDetail != null) {
            stockDetailModel = new StockDetailModel(QuoteModelMapper.mapFrom(stockDetail.getQuote()),
                    convertToNewsModelList(stockDetail.getNews()));
        }
        return stockDetailModel;
    }

    private List<NewsModel> convertToNewsModelList(List<News> newsList) {
        List<NewsModel> newsModelList = new ArrayList<>();
        NewsModel newsModel;
        for (News news : newsList) {
            if (news != null) {
                newsModel = NewsModelMapper.mapFrom(news);
                newsModelList.add(newsModel);
            }
        }
        return newsModelList;
    }
}
