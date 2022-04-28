package com.example.veggiebuddy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        Going to be part of every activity
         */
        setContentView(R.layout.activity_home_screen);
        ActionBar actionBar = getSupportActionBar();        //hides the top bar
        actionBar.hide();
        ImageView profile = findViewById(R.id.profile);
        ImageView home = findViewById(R.id.home);
        ImageView cart = findViewById(R.id.cart);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Profile.class);
                startActivity(intent);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), HomeScreen.class);
                startActivity(intent);
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), ShoppingCart.class);
                startActivity(intent);
            }
        });
        /*
        End of material to always include in every activity
         */


        ImageView clickableimg1 = findViewById(R.id.clickableimg);
        ImageView clickableimg2 = findViewById(R.id.clickableimg2);

        ImageView trendimg3 = findViewById(R.id.trendimg3);
        ImageView trendimg1 = findViewById(R.id.trendimg1);
        ImageView trendimg2 = findViewById(R.id.trendimg2);
        ImageView imagefqwf = findViewById(R.id.imagefqwf);
        ImageView secondtrendimg1 = findViewById(R.id.secondtrendimg1);
        ImageView secondtrendimg2 = findViewById(R.id.secondtrendimg2);
        ImageView imagefqwfweew = findViewById(R.id.imagefqwfweew);
        ImageView thirdtrendimg1 = findViewById(R.id.thirdtrendimg1);
        ImageView thirdtrendimg2 = findViewById(R.id.thirdtrendimg2);


        trendimg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        trendimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        trendimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        imagefqwf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        secondtrendimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        secondtrendimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        imagefqwfweew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        thirdtrendimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        thirdtrendimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });

        clickableimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });
        clickableimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });

        SearchView search = findViewById(R.id.search);
        search.setQueryHint("Search by name or ingredient!");
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Search.class);
                startActivity(intent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });


    }
}