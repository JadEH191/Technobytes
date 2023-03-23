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

        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide5));

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