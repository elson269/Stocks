package com.elsonji.stocks.presentation.models.stockdetailmodel;

import java.util.List;

public class StockDetailModel {
    private QuoteModel quoteModel;
    private List<NewsModel> newsModelList;

    public StockDetailModel(QuoteModel quoteModel, List<NewsModel> newsModels) {
        this.quoteModel = quoteModel;
        this.newsModelList = newsModels;
    }

    public QuoteModel getQuote() {
        return quoteModel;
    }

    public void setQuote(QuoteModel quoteModel) {
        this.quoteModel = quoteModel;
    }

    public List<NewsModel> getNews() {
        return newsModelList;
    }

    public void setNews(List<NewsModel> news) {
        this.newsModelList = news;
    }
}
