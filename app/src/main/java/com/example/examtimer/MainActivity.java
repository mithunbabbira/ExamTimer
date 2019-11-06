package com.example.examtimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1;
    TextView mnumber,done;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m1 = MediaPlayer.create(this,R.raw.three);

        mnumber = findViewById(R.id.mnumber);
        done = findViewById(R.id.done);
        


        new CountDownTimer(5000,1000){
            public void onTick(long millisecoundsUntilDone){
                mnumber.setText("Time:"+ String.valueOf(millisecoundsUntilDone/1000));

            }
            public void onFinish(){
                done.setText("Done!!");
                m1.start();

            }
        }.start();

    }
}
