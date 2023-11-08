package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;

    Button start,pause,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music=MediaPlayer.create(this,R.raw.sound);
        start=findViewById(R.id.start);
        stop=findViewById(R.id.stop);
        pause=findViewById(R.id.pause);

        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                music.start();
                pause.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        music.pause();
                        stop.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                music.stop();
                            }
                        });
                    }
                });
            }
        });
    }
}