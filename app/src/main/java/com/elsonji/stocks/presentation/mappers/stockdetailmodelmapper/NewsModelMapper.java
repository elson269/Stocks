package com.elsonji.stocks.presentation.mappers.stockdetailmodelmapper;

import com.elsonji.stocks.domain.models.stockdetail.News;
import com.elsonji.stocks.presentation.models.stockdetailmodel.NewsModel;

public class NewsModelMapper {
    public static NewsModel mapFrom(News news) {
        NewsModel newsModel = null;
        if (news != null) {
            newsModel = new NewsModel(news.getDatetime(),
                    news.getHeadline(),
                    news.getSource(),
                    news.getUrl(),
                    news.getSummary(),
                    news.getRelated(),
                    news.getImage());
        }
        return newsModel;
    }

}
