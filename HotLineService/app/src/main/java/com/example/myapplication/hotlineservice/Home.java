package com.example.myapplication.hotlineservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;


public class Home extends AppCompatActivity {

    Button btnFire, btnNational, btnAntiCorruption, btnHealthService, btnDisaster, btnConsumers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnFire = findViewById(R.id.btnFireService);
        btnNational = findViewById(R.id.btnNationalEmergency);
        btnAntiCorruption = findViewById(R.id.btnAntiCorruption);
        btnHealthService = findViewById(R.id.btnEmergencyHealth);
        btnDisaster = findViewById(R.id.btnDisaster);
        btnConsumers = findViewById(R.id.btnConsumer);

        // Fire Service
        btnFire.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dialNumber("102");
            }
        });

        // National Emergency
        btnNational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialNumber("999");
            }
        });

        // Anti Corruption
        btnAntiCorruption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialNumber("106");
            }
        });

        // Anti Corruption
        btnHealthService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialNumber("16263");
            }
        });


        btnDisaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialNumber("1090");
            }
        });


        btnConsumers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialNumber("16121");
            }
        });
    }

    private void dialNumber(String number) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        startActivity(intent);
    }
}