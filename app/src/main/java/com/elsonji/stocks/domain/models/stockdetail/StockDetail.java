package com.elsonji.stocks.domain.models.stockdetail;

import java.util.List;

public class StockDetail {

    private Quote quote;
    private List<News> newsList = null;

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public List<News> getNews() {
        return newsList;
    }

    public void setNews(List<News> newsList) {
        this.newsList = newsList;
    }
}
