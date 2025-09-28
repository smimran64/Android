package com.example.myapplication.hotlineservice;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    private TextView splashText;

    private String message = "Welcome to Hot Line Service";
    private int index = 0;
    private long delay = 150;

    private Handler handler = new Handler(Looper.getMainLooper());

    private Runnable characterAdder = new Runnable() {

        @Override
        public void run() {
            if (index < message.length()) {
                splashText.setText(message.substring(0, index ++));
                handler.postDelayed(this, delay);
            } else {

                handler.postDelayed(() -> {
                    startActivity(new Intent(getApplicationContext(), Home.class));
                    finish();
                }, 3000);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        splashText = findViewById(R.id.splashText);

        handler.postDelayed(characterAdder, delay);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(characterAdder);
    }
}