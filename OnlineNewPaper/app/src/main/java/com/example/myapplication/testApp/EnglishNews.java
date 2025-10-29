package com.example.myapplication.testApp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EnglishNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_english_news);

        ImageButton btnDailyStar = findViewById(R.id.btnDailyStar);


        btnDailyStar.setOnClickListener(v -> {

            String url = "https://www.thedailystar.net/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        ImageButton btnDailySun = findViewById(R.id.btnDailySun);


        btnDailySun.setOnClickListener(v -> {

            String url = "https://www.daily-sun.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });


        ImageButton btnDhakaTribune = findViewById(R.id.btnDhakaTribune);


        btnDhakaTribune.setOnClickListener(v -> {

            String url = "https://www.dhakatribune.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });


        ImageButton btnDailyObserver = findViewById(R.id.btnDailyObserver);


        btnDailyObserver.setOnClickListener(v -> {

            String url = "https://www.observerbd.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });


        ImageButton btnNewAge = findViewById(R.id.btnNewAge);


        btnNewAge.setOnClickListener(v -> {

            String url = "https://www.newagebd.net/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });


        ImageButton btnBBCNews = findViewById(R.id.btnBBC);


        btnBBCNews.setOnClickListener(v -> {

            String url = "https://www.bbc.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        ImageButton btnAljazeera = findViewById(R.id.btnAljazeera);


        btnAljazeera.setOnClickListener(v -> {

            String url = "https://www.aljazeera.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });




    }
}