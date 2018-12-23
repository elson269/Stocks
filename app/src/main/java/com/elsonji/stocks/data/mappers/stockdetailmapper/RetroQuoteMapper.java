package com.elsonji.stocks.data.mappers.stockdetailmapper;

import com.elsonji.stocks.data.models.retrostockdetail.RetroQuote;
import com.elsonji.stocks.domain.models.stockdetail.Quote;

public class RetroQuoteMapper {
    public static Quote mapFrom(RetroQuote retroQuote) {
        Quote quote = null;
        if (retroQuote != null) {
            quote = new Quote(retroQuote.getSymbol(),
                    retroQuote.getCompanyName(),
                    retroQuote.getPrimaryExchange(),
                    retroQuote.getSector(),
                    retroQuote.getCalculationPrice(),
                    retroQuote.getOpen(),
                    retroQuote.getOpenTime(),
                    retroQuote.getClose(),
                    retroQuote.getCloseTime(),
                    retroQuote.getHigh(),
                    retroQuote.getLow(),
                    retroQuote.getLatestPrice(),
                    retroQuote.getLatestSource(),
                    retroQuote.getLatestTime(),
                    retroQuote.getLatestUpdate(),
                    retroQuote.getLatestVolume(),
                    retroQuote.getIexRealtimePrice(),
                    retroQuote.getIexRealtimeSize(),
                    retroQuote.getIexLastUpdated(),
                    retroQuote.getDelayedPrice(),
                    retroQuote.getDelayedPriceTime(),
                    retroQuote.getExtendedPrice(),
                    retroQuote.getExtendedChange(),
                    retroQuote.getExtendedChangePercent(),
                    retroQuote.getExtendedPriceTime(),
                    retroQuote.getPreviousClose(),
                    retroQuote.getChange(),
                    retroQuote.getChangePercent(),
                    retroQuote.getIexMarketPercent(),
                    retroQuote.getIexVolume(),
                    retroQuote.getAvgTotalVolume(),
                    retroQuote.getIexBidPrice(),
                    retroQuote.getIexBidSize(),
                    retroQuote.getIexAskPrice(),
                    retroQuote.getIexAskSize(),
                    retroQuote.getMarketCap(),
                    retroQuote.getPeRatio(),
                    retroQuote.getWeek52High(),
                    retroQuote.getWeek52Low(),
                    retroQuote.getYtdChange());
        }
        return quote;
    }
}
