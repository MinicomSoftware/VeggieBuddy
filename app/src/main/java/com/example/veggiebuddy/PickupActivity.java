package com.example.veggiebuddy;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PickupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);
    }

    public void finish(View view) {
        finish();
    }
}