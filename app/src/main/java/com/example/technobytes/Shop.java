package com.example.technobytes;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Shop extends AppCompatActivity {

    RecyclerView rvProduct;

    ImageView btnToCart;
    TextView hitbox, ostrich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        rvProduct = findViewById(R.id.rvProduct);
        btnToCart = findViewById(R.id.btnToCart);
        ostrich = findViewById(R.id.ostrich);

        ostrich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLaptop1();
            }
        });

        LayoutInflater inflater = LayoutInflater.from(this);
        View product = inflater.inflate(R.layout.shop_items_card, null);
        hitbox = product.findViewById(R.id.hitbox);

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

    public void toLaptop1() {
        Intent intent = new Intent(this, Laptop1.class);
        startActivity(intent);

    }


    public void AddtoCart(View view) {
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        View viewpopup = layoutInflater.inflate(R.layout.product_details, null);
        final PopupWindow popupWindow = new PopupWindow(viewpopup, 900, 1000);
        popupWindow.showAtLocation(view, Gravity.TOP, 0, 0);

        System.out.println("test");
    }
}