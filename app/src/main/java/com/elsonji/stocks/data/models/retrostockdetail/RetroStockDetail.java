package com.elsonji.stocks.data.models.retrostockdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RetroStockDetail {
    @SerializedName("quote")
    @Expose
    private Quote quote;
    @SerializedName("news")
    @Expose
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
