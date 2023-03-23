package com.example.technobytes;

import android.content.Intent;
import android.media.Image;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {


    TextView tvProductName, tvProductDescription, tvProductPrice, hitbox;
    ImageView ivProductImage, btnCart;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tvProductName = itemView.findViewById(R.id.tvProductName);
        tvProductDescription = itemView.findViewById(R.id.tvProductDescription);
        ivProductImage = itemView.findViewById(R.id.ivProductImage);
        tvProductPrice = itemView.findViewById(R.id.tvProductPrice);
        btnCart = itemView.findViewById(R.id.btnCart);
        hitbox = itemView.findViewById(R.id.hitbox);

        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("test");
            }
        });

        hitbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getProductName = tvProductName.getText().toString();
                System.out.println(tvProductName.getText().toString());


                if(getProductName.equals("Ostrich Laptop")) {

                }
            }
        });

    }
}
