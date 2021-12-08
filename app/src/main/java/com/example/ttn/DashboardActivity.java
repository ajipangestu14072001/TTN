package com.example.ttn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {
CardView login, regis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        login = findViewById(R.id.cardlogin);
        regis = findViewById(R.id.cardregis);
        login.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            startActivity(intent);
        });

        regis.setOnClickListener(v ->{
            Intent intent = new Intent(DashboardActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}