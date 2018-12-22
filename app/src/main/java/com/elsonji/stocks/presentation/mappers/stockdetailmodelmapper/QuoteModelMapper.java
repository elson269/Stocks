package com.elsonji.stocks.presentation.mappers.stockdetailmodelmapper;

import com.elsonji.stocks.domain.models.stockdetail.Quote;
import com.elsonji.stocks.presentation.models.stockdetailmodel.QuoteModel;

public class QuoteModelMapper {
    public static QuoteModel mapFrom(Quote quote) {
        QuoteModel quoteModel = null;
        if (quote != null) {
            quoteModel = new QuoteModel(quote.getSymbol(),
                    quote.getCompanyName(),
                    quote.getPrimaryExchange(),
                    quote.getSector(),
                    quote.getCalculationPrice(),
                    quote.getOpen(),
                    quote.getOpenTime(),
                    quote.getClose(),
                    quote.getCloseTime(),
                    quote.getHigh(),
                    quote.getLow(),
                    quote.getLatestPrice(),
                    quote.getLatestSource(),
                    quote.getLatestTime(),
                    quote.getLatestUpdate(),
                    quote.getLatestVolume(),
                    quote.getIexRealtimePrice(),
                    quote.getIexRealtimeSize(),
                    quote.getIexLastUpdated(),
                    quote.getDelayedPrice(),
                    quote.getDelayedPriceTime(),
                    quote.getExtendedPrice(),
                    quote.getExtendedChange(),
                    quote.getExtendedChangePercent(),
                    quote.getExtendedPriceTime(),
                    quote.getPreviousClose(),
                    quote.getChange(),
                    quote.getChangePercent(),
                    quote.getIexMarketPercent(),
                    quote.getIexVolume(),
                    quote.getAvgTotalVolume(),
                    quote.getIexBidPrice(),
                    quote.getIexBidSize(),
                    quote.getIexAskPrice(),
                    quote.getIexAskSize(),
                    quote.getMarketCap(),
                    quote.getPeRatio(),
                    quote.getWeek52High(),
                    quote.getWeek52Low(),
                    quote.getYtdChange());
        }
        return quoteModel;
    }
}
