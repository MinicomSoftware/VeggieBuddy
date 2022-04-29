package com.example.veggiebuddy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Recipe extends AppCompatActivity {

    private TextView swappingMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

         /*
        Going to be part of every activity
         */
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

        ImageView buttonback = findViewById(R.id.buttonback);

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), HomeScreen.class);
                startActivity(intent);
            }
        });

        Button addtocart = findViewById(R.id.addtocart);

        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addtocart.setEnabled(false);
                addtocart.setText("Added to the Cart!");
            }
        });

        WebView youtubeWebView = findViewById(R.id.youtube);

        youtubeWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });

        WebSettings webSettings = youtubeWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        youtubeWebView.loadUrl("https://www.youtube.com/embed/PrJH8QFmtFE");


        //sub functionality:
        Button subbutton1 = findViewById(R.id.subbutton1);
        TextView editable1 = findViewById(R.id.editable1);

        Button subbutton2 = findViewById(R.id.subbutton2);
        TextView editable2 = findViewById(R.id.editable2);

        Button subbutton3 = findViewById(R.id.subbutton3);
        TextView editable3 = findViewById(R.id.editable3);

        Button subbutton4 = findViewById(R.id.subbutton4);
        TextView editable4 = findViewById(R.id.editable4);

        //popup
        ConstraintLayout layout = findViewById(R.id.popup);
        TextView submessage = findViewById(R.id.submessage);

        subbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.VISIBLE);
                swappingMessage = editable1;
                submessage.setText("Swap " + editable1.getText() + " with?");
                setSwapBtnMessages();
            }
        });

        subbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.VISIBLE);
                swappingMessage = editable2;
                submessage.setText("Swap " + editable2.getText() + " with?");
                setSwapBtnMessages();
            }
        });
        subbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.VISIBLE);
                swappingMessage = editable3;
                submessage.setText("Swap " + editable3.getText() + " with?");
                setSwapBtnMessages();
            }
        });
        subbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.VISIBLE);
                swappingMessage = editable4;
                submessage.setText("Swap " + editable4.getText() + " with?");
                setSwapBtnMessages();
            }
        });

        //sub items fuctionalty:
        Button subItem1 = findViewById(R.id.subItem1);
        Button subItem2 = findViewById(R.id.subItem2);
        Button subItem3 = findViewById(R.id.subItem3);
        Button canclebtn = findViewById(R.id.canclebtn);

        subItem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.INVISIBLE);
                swappingMessage.setText(subItem1.getText());
            }
        });
        subItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.INVISIBLE);
                swappingMessage.setText(subItem2.getText());
            }
        });

        subItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.INVISIBLE);
                swappingMessage.setText(subItem3.getText());
            }
        });

        canclebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.INVISIBLE);

            }
        });
    }

    private void setSwapBtnMessages() {

        Random rnd = new Random();
        int ran1 = rnd.nextInt(Client.SUB_ITEMS.length);
        int ran2 = rnd.nextInt(Client.SUB_ITEMS.length);
        int ran3 = rnd.nextInt(Client.SUB_ITEMS.length);

        Button subItem1 = findViewById(R.id.subItem1);
        Button subItem2 = findViewById(R.id.subItem2);
        Button subItem3 = findViewById(R.id.subItem3);

        subItem1.setText(Client.SUB_ITEMS[ran1]);
        subItem2.setText(Client.SUB_ITEMS[ran2]);
        subItem3.setText(Client.SUB_ITEMS[ran3]);
    }

}