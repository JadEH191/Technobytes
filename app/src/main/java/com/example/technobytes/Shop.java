package com.example.technobytes;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Shop extends AppCompatActivity {

    RecyclerView rvProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        rvProduct = findViewById(R.id.rvProduct);

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
        items.add(new Items("Test name", "test Description", "test Price", R.drawable.slide2));

        rvProduct.setLayoutManager(new LinearLayoutManager(this));
        rvProduct.setAdapter(new Adapter(getApplicationContext(), items));
    }
}