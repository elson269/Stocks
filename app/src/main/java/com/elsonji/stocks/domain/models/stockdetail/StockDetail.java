package com.elsonji.stocks.domain.models.stockdetail;

import java.util.List;

public class StockDetail {

    private Quote quote;
    private List<News> news = null;

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
