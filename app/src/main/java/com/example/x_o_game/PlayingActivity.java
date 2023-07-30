package com.example.x_o_game;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
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
    String name1X,name2O;
    boolean flagX = true ;
    ArrayList<Object> xId = new ArrayList<>();
    ArrayList<Object> oId = new ArrayList<>();
    public void onClick(View btn) {
        chooseImage((ImageButton) btn);
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
        name1X=intent.getStringExtra("1_name");
        name2O=intent.getStringExtra("2_name");
        nameX.setText(name1X);
        nameO.setText(name2O);

    }


    private void chooseImage( ImageButton btn){
        if (flagX){
            btn.setImageResource(R.drawable.x);
            xId.add(btn.getId());
            flagX = false ;
            for (int i = 0 ; i < xId.size() ; i++){
                if (xId.size() == 3){

                    if (xId.contains(btn1.getId()) && xId.contains(btn2.getId()) && xId.contains(btn3.getId()) ){
                        onBackPressed(name1X);
                    }
                    else if (xId.contains(btn1.getId()) && xId.contains(btn4.getId()) && xId.contains(btn7.getId())) {
                        onBackPressed(name1X);
                    }
                    else if (xId.contains(btn2.getId()) && xId.contains(btn5.getId()) && xId.contains(btn8.getId()) ) {
                        onBackPressed(name1X);                    }
                    else if (xId.contains(btn4.getId()) && xId.contains(btn5.getId()) && xId.contains(btn6.getId()) ) {
                        onBackPressed(name1X);
                    }
                    else if (xId.contains(btn3.getId()) && xId.contains(btn6.getId()) && xId.contains(btn9.getId()) ) {
                        onBackPressed(name1X);
                    }

                    else if (xId.contains(btn7.getId()) && xId.contains(btn8.getId()) && xId.contains(btn9.getId()) ) {
                        onBackPressed(name1X);
                    }

                    else if (xId.contains(btn1.getId()) && xId.contains(btn5.getId()) && xId.contains(btn9.getId()) ) {
                        onBackPressed(name1X);
                    }

                    else if (xId.contains(btn3.getId()) && xId.contains(btn5.getId()) && xId.contains(btn7.getId())) {
                        onBackPressed(name1X);
                    }

                    else {
                        xId.clear();
                    }

                }
            }

        }else {
            btn.setImageResource(R.drawable.o);
            oId.add(btn.getId());
            for (int i = 0 ; i < oId.size() ; i++){
                if (oId.size() == 3){

                    if (oId.contains(btn1.getId()) && oId.contains(btn2.getId()) && oId.contains(btn3.getId())){
                        onBackPressed(name2O);
                    }
                    else if (oId.contains(btn1.getId()) && oId.contains(btn4.getId()) && oId.contains(btn7.getId()) ) {
                        onBackPressed(name2O);
                    }
                    else if (oId.contains(btn2.getId()) && oId.contains(btn5.getId()) && oId.contains(btn8.getId())) {
                        onBackPressed(name2O);
                    }
                    else if (oId.contains(btn4.getId()) && oId.contains(btn5.getId()) && oId.contains(btn6.getId())) {
                        onBackPressed(name2O);
                    }
                    else if (oId.contains(btn3.getId()) && oId.contains(btn6.getId()) && oId.contains(btn9.getId())) {
                        onBackPressed(name2O);
                    }

                    else if (oId.contains(btn7.getId()) && oId.contains(btn8.getId()) && oId.contains(btn9.getId())) {
                        onBackPressed(name2O);
                    }

                    else if (oId.contains(btn1.getId()) && oId.contains(btn5.getId()) && oId.contains(btn9.getId())) {
                        onBackPressed(name2O);
                    }

                    else if (oId.contains(btn3.getId()) && oId.contains(btn5.getId()) && oId.contains(btn7.getId())) {
                        onBackPressed(name2O);
                    }
                    else {
                        Log.i("userO" , "lose");
                        oId.clear();
                    }

                }
            }
            flagX = true ;
        }
        btn.setEnabled(false);
    }



    public void onBackPressed(String name) {
        AlertDialog.Builder builder = new AlertDialog.Builder(PlayingActivity.this);

        builder.setMessage(name + " Wins");

        builder.setTitle("Congratiolation");


        builder.setCancelable(false);

        builder.setPositiveButton("finish", (DialogInterface.OnClickListener) (dialog, which) -> {
            finish();
        });

        builder.setNegativeButton("Try Again", (DialogInterface.OnClickListener) (dialog, which) -> {
                 this.finish();
               Intent intent1 =new Intent(getApplicationContext(),PlayingActivity.class);
               startActivity(intent1);
        });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}