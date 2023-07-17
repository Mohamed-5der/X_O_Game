package com.example.x_o_game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {
TextView nameX,nameO;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        nameX =findViewById(R.id.txtNameX);
        nameO =findViewById(R.id.txtNameO);
        Intent intent=getIntent();
        String name1X=intent.getStringExtra("name1");
        String name2O=intent.getStringExtra("name2");
        nameX.setText(name1X);
        nameO.setText(name2O);


    }
}