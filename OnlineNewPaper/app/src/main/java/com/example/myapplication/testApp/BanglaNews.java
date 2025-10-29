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

      ImageButton btnBangladeshProtidin = findViewById(R.id.btnBangladeshProtidin);

      btnBangladeshProtidin.setOnClickListener(v ->

              {
                  String url ="https://www.bd-pratidin.com/";

                  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                  startActivity(intent);

              }

              );

      ImageButton btnBBCBangla = findViewById(R.id.btnBBCBangla);

      btnBBCBangla.setOnClickListener(v ->
              {
                  String url ="https://www.bbc.com/bengali";

                  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                  startActivity(intent);
              }


              );


        ImageButton btnAmardesh = findViewById(R.id.btnAmardesh);

        btnAmardesh.setOnClickListener(v ->
                {
                    String url ="https://www.dailyamardesh.com/";

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                    startActivity(intent);
                }


        );


        ImageButton btnIttefuqe = findViewById(R.id.btnIttefuque);

        btnIttefuqe.setOnClickListener(v ->
                {
                    String url ="https://www.ittefaq.com.bd/";

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                    startActivity(intent);
                }


        );



        ImageButton btnInkilab = findViewById(R.id.btnInqilab);

        btnInkilab.setOnClickListener(v ->
                {
                    String url ="https://dailyinqilab.com/";

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                    startActivity(intent);
                }


        );


        ImageButton btnManabJamin = findViewById(R.id.btnManabJamin);

        btnManabJamin.setOnClickListener(v ->
                {
                    String url ="https://mzamin.com/";

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                    startActivity(intent);
                }


        );






    }
}