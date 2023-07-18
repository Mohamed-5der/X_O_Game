package com.example.x_o_game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayingActivity extends AppCompatActivity {
    TextView nameX,nameO;
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    boolean flagX = true ;
    boolean userX;
    ArrayList<ImageButton> asswersX=new ArrayList<>();
    ArrayList<ImageButton> asswersY=new ArrayList<>();


    public void onClick(View btn) {
        chooseImage((ImageButton) btn);
        btn.getTag();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        nameX =findViewById(R.id.txtNameX);
        nameO =findViewById(R.id.txtNameO);
        btn1=findViewById(R.id.btn);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        Intent intent=getIntent();
        String name1X=intent.getStringExtra("1_name");
        String name2O=intent.getStringExtra("2_name");
        nameX.setText(name1X);
        nameO.setText(name2O);
    }


    private void chooseImage( ImageButton btn){
        if (flagX){
            btn.setImageResource(R.drawable.x);
            asswersX.add(btn);
            flagX = false ;
        }else {
            btn.setImageResource(R.drawable.o);
            asswersY.add(btn);
            flagX = true ;
        }
        btn.setEnabled(false);
        userX = !flagX ;

        if (userX) {

            if (!btn1.isEnabled() && !btn2.isEnabled() && !btn3.isEnabled() && !userX){
                Log.i("User" , "User X Win");
            }
            else  if (!btn4.isEnabled() && !btn5.isEnabled() && !btn6.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn7.isEnabled() && !btn8.isEnabled() && !btn9.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn1.isEnabled() && !btn4.isEnabled() && !btn7.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn2.isEnabled() && !btn5.isEnabled() && !btn8.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn3.isEnabled() && !btn6.isEnabled() && !btn9.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn1.isEnabled() && !btn5.isEnabled() && !btn9.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn3.isEnabled() && !btn5.isEnabled() && !btn7.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }
        }
        // user O
        else  {

            if (!btn1.isEnabled() && !btn2.isEnabled() && !btn3.isEnabled() && !userX){
                Log.i("User" , "User X Win");
            }
            else  if (!btn4.isEnabled() && !btn5.isEnabled() && !btn6.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn7.isEnabled() && !btn8.isEnabled() && !btn9.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn1.isEnabled() && !btn4.isEnabled() && !btn7.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn2.isEnabled() && !btn5.isEnabled() && !btn8.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn3.isEnabled() && !btn6.isEnabled() && !btn9.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn1.isEnabled() && !btn5.isEnabled() && !btn9.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

            else  if (!btn3.isEnabled() && !btn5.isEnabled() && !btn7.isEnabled() && !userX) {
                Log.i("User" , "User X Win");
            }

        }


    }



}