package com.example.tictactoecskvsmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);

                    Intent i = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();

                }catch (Exception e){
                    e.printStackTrace();

                }

            }
        };
        thread.start();    }
}