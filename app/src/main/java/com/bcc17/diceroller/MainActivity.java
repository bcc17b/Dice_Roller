package com.bcc17.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageDice;
    private Random rng = new Random();
    MediaPlayer ring;
    MediaPlayer win;
    MediaPlayer fail;
    TextView txt;
    Button show;

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
        ring= MediaPlayer.create(this, R.raw.diceroll);
        win= MediaPlayer.create(this, R.raw.winner);
        fail= MediaPlayer.create(this,R.raw.lost);
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        txt = (TextView)findViewById(R.id.bad_luck);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView)findViewById(R.id.good_luck);
        txt.setVisibility(View.INVISIBLE);


        switch (randomNumber) {
            case 1:
                imageDice.setImageResource(R.drawable.d1);
                fail.start();
                txt = (TextView)findViewById(R.id.bad_luck);
                txt.setVisibility(View.VISIBLE);
                break;
            case 2:
                imageDice.setImageResource(R.drawable.d2);
                ring.start();
                break;
            case 3:
                imageDice.setImageResource(R.drawable.d3);
                ring.start();
                break;
            case 4:
                imageDice.setImageResource(R.drawable.d4);
                ring.start();
                break;
            case 5:
                imageDice.setImageResource(R.drawable.d5);
                ring.start();
                break;
            case 6:
                imageDice.setImageResource(R.drawable.d6);
                ring.start();
                break;
            case 7:
                imageDice.setImageResource(R.drawable.d7);
                ring.start();
                break;
            case 8:
                imageDice.setImageResource(R.drawable.d8);
                ring.start();
                break;
            case 9:
                imageDice.setImageResource(R.drawable.d9);
                ring.start();
                break;
            case 10:
                imageDice.setImageResource(R.drawable.d10);
                ring.start();
                break;
            case 11:
                imageDice.setImageResource(R.drawable.d11);
                ring.start();
                break;
            case 12:
                imageDice.setImageResource(R.drawable.d12);
                ring.start();
                break;
            case 13:
                imageDice.setImageResource(R.drawable.d13);
                ring.start();
                break;
            case 14:
                imageDice.setImageResource(R.drawable.d14);
                ring.start();
                break;
            case 15:
                imageDice.setImageResource(R.drawable.d15);
                ring.start();
                break;
            case 16:
                imageDice.setImageResource(R.drawable.d16);
                ring.start();
                break;
            case 17:
                imageDice.setImageResource(R.drawable.d17);
                ring.start();
                break;
            case 18:
                imageDice.setImageResource(R.drawable.d18);
                ring.start();
                break;
            case 19:
                imageDice.setImageResource(R.drawable.d19);
                ring.start();
                break;
            case 20:
                imageDice.setImageResource(R.drawable.d_20);
                win.start();
                txt = (TextView)findViewById(R.id.good_luck);
                txt.setVisibility(View.VISIBLE);
                break;
        }
    }
}