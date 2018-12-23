package com.elsonji.stocks.data.mappers.stockdetailmapper;

import com.elsonji.stocks.data.models.retrostockdetail.RetroNews;
import com.elsonji.stocks.data.models.retrostockdetail.RetroStockDetail;
import com.elsonji.stocks.domain.models.stockdetail.News;
import com.elsonji.stocks.domain.models.stockdetail.StockDetail;

import java.util.ArrayList;
import java.util.List;

public class RetroStockDetailMapper {

    public StockDetail mapFrom(RetroStockDetail retroStockDetail) {
        StockDetail stockDetail = null;
        if (retroStockDetail != null) {
            stockDetail = new StockDetail(RetroQuoteMapper.mapFrom(retroStockDetail.getQuote()),
                    convertToNewsList(retroStockDetail.getNews()));
        }
        return stockDetail;
    }

    private List<News> convertToNewsList(List<RetroNews> retroNewsList) {
        List<News> newsList = new ArrayList<>();
        News news;
        for (RetroNews retroNews : retroNewsList) {
            if (retroNews != null) {
                news = RetroNewsMapper.mapFrom(retroNews);
                newsList.add(news);
            }
        }
        return newsList;
    }
}
