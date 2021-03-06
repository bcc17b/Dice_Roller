package com.bcc17.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageDice = findViewById(R.id.image_view_dice);
        imageDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice(){
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber){
            case 1:
                imageDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDice.setImageResource(R.drawable.dice6);
                break;
        }
    }
}