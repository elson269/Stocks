package com.elsonji.stocks.presentation.views.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.elsonji.stocks.R;
import com.elsonji.stocks.domain.models.MyStock;
import com.elsonji.stocks.domain.models.MyStockList;
import com.elsonji.stocks.presentation.di.StockApplication;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyStockAdapter extends RecyclerView.Adapter<MyStockAdapter.MyStockViewHolder> {
    private Context mContext;

    @Inject
    ArrayList<MyStock> mMyStockList;

    public MyStockAdapter(Context context) {
        mContext = context;
        StockApplication.getActivityComponent().inject(this);
    }

    @NonNull
    @Override
    public MyStockViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        ConstraintLayout itemView = (ConstraintLayout) LayoutInflater.from(mContext)
                .inflate(R.layout.my_stock_item, viewGroup, false);
        return new MyStockViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyStockViewHolder holder, int position) {
        holder.stockSymbolTV.setText(mMyStockList.get(position).getSymbol());
        holder.companyNameTV.setText(mMyStockList.get(position).getCompanyName());
        holder.latestPriceTV.setText(String.valueOf(mMyStockList.get(position).getLatestPrice()));
        holder.changeTV.setText(String.valueOf(mMyStockList.get(position).getChange()));
        holder.changePercentTV.setText(String.valueOf(mMyStockList.get(position).getChangePercent()));
    }

    @Override
    public int getItemCount() {
        if (mMyStockList != null) {
            return mMyStockList.size();
        } else {
            return 0;
        }
    }

    public class MyStockViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.stock_symbol_tv)
        TextView stockSymbolTV;
        @BindView(R.id.company_name_tv)
        TextView companyNameTV;
        @BindView(R.id.latest_price_tv)
        TextView latestPriceTV;
        @BindView(R.id.change_tv)
        TextView changeTV;
        @BindView(R.id.change_percent_tv)
        TextView changePercentTV;

        public MyStockViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public void setItems(MyStockList myStockList) {
        mMyStockList.clear();
        if (myStockList != null) {
            mMyStockList.addAll(myStockList.getStocks());
            notifyDataSetChanged();
        }
    }
}
