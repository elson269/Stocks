package com.elsonji.stocks.data.models.retrostockdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RetroStockDetail {
    @SerializedName("quote")
    @Expose
    private RetroQuote quote;
    @SerializedName("news")
    @Expose
    private List<RetroNews> news = null;

    public RetroQuote getQuote() {
        return quote;
    }

    public void setQuote(RetroQuote retroQuote) {
        this.quote = retroQuote;
    }

    public List<RetroNews> getNews() {
        return news;
    }

    public void setNews(List<RetroNews> retroNews) {
        this.news = retroNews;
    }
}
