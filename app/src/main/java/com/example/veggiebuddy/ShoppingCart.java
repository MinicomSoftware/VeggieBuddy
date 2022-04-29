package com.example.veggiebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShoppingCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(ShoppingCart.this, PickupActivity.class);
        startActivity(intent);
    }
}