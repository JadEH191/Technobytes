package com.example.technobytes;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView tvProductName, tvProductDescription, tvProductPrice;
    ImageView ivProductImage;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tvProductName = itemView.findViewById(R.id.tvProductName);
        tvProductDescription = itemView.findViewById(R.id.tvProductDescription);
        ivProductImage = itemView.findViewById(R.id.ivProductImage);
        tvProductPrice = itemView.findViewById(R.id.tvProductPrice);
    }
}
