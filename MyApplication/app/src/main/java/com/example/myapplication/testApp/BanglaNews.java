package com.example.myapplication.testApp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class BanglaNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bangla_news);



        ImageButton btnProthomAlo = findViewById(R.id.btnProthomAlo);


        btnProthomAlo.setOnClickListener(v -> {

            String url = "https://www.prothomalo.com";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

//      ImageButton btnBangladeshProtidin = findViewById(R.id.btnBangladeshProtidin);
//
//      btnBangladeshProtidin.setOnClickListener();

    }
}