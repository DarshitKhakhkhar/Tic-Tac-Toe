package com.example.tictactoecskvsmi;

import static java.lang.System.exit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class WinActivity extends AppCompatActivity {

    TextView name;
    ImageView winimg;
    Button resetbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        name=findViewById(R.id.name);
        winimg=findViewById(R.id.winimg);
        resetbtn=findViewById(R.id.resetbtn);


        int num=getIntent().getExtras().getInt("winner");

        if (num==1){
            name.setText("Winner Is Csk");
            winimg.setImageResource(R.drawable.csklogo);
        }
        if (num==0){
            name.setText("Winner Is Mi");
            winimg.setImageResource(R.drawable.milogo);
        }

        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WinActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}