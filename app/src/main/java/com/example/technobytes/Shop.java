package com.example.technobytes;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Shop extends AppCompatActivity {

    RecyclerView rvProduct;

    ImageView btnToCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        rvProduct = findViewById(R.id.rvProduct);
        btnToCart = findViewById(R.id.btnToCart);

        List<Items> items = new ArrayList<Items>();

        items.add(new Items("Ostrich Laptop", "test Description", "P 10,000", R.drawable.slide2));
        items.add(new Items("Mountain Laptop", "test Description", "P 8,000", R.drawable.slide3));
        items.add(new Items("Small Mountain Laptop", "test Description", "P 11,000", R.drawable.slide4));
        items.add(new Items("Xbox Controller", "test Description", "P 2,000", R.drawable.slide5));
        items.add(new Items("Test name", "test Description", "P 15,000", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "P 9,000", R.drawable.slide2));
        items.add(new Items("Owl Laptop", "test Description", "P 7,000", R.drawable.slide9));

        rvProduct.setLayoutManager(new LinearLayoutManager(this));
        rvProduct.setAdapter(new Adapter(getApplicationContext(), items));

        btnToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toMyCart();
            }
        });
    }

    public void toMyCart() {
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }
}