package com.example.x_o_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PlayersActivity extends AppCompatActivity {
EditText firstName ,secondName;
Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        firstName=findViewById(R.id.et_name1);
        secondName=findViewById(R.id.et_name2);
        play=findViewById(R.id.btnPlay);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1X=firstName.getText().toString();
                String name2O=secondName.getText().toString();
                if(name1X.isEmpty() && name2O.isEmpty()){
                Toast.makeText(PlayersActivity.this, "Please enter First Name and second Name", Toast.LENGTH_SHORT).show();

                }
                    Intent intent = new Intent(PlayersActivity.this, PlayingActivity.class);
                    intent.putExtra("1_name", name1X);
                    intent.putExtra("2_name", name2O);
                    startActivity(intent);

            }
        });
    }
}