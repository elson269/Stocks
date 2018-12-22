package com.elsonji.stocks.data.mappers.stockdetailmapper;

import com.elsonji.stocks.data.models.retrostockdetail.RetroNews;
import com.elsonji.stocks.domain.models.stockdetail.News;

public class RetroNewsMapper {

    public News mapFrom(RetroNews retroNews) {
        News news = null;
        if (retroNews != null) {
            news = new News(retroNews.getDatetime(),
                    retroNews.getHeadline(),
                    retroNews.getSource(),
                    retroNews.getUrl(),
                    retroNews.getSummary(),
                    retroNews.getRelated(),
                    retroNews.getImage());
        }
        return news;
    }
}
