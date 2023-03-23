package com.example.technobytes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    List<Items> items;

    public Adapter(Context context, List<Items> items) {
        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.shop_items_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvProductName.setText(items.get(position).getName());
        holder.tvProductDescription.setText(items.get(position).getDescription());
        holder.tvProductPrice.setText(items.get(position).getPrice());
        holder.ivProductImage.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
