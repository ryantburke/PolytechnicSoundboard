package com.poly.soundboard;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;


public class SoundBoardLaughs extends SoundBoardActivity{

    Button btnDeepHahaha;
    Button btnHahahahaha;
    @Override
    public void initialize() {
        setContentView(R.layout.soundboard_laughs);
        ivSwapper = findViewById(R.id.iv_swiper);
        context = this;

        btnDeepHahaha = findViewById(R.id.btn_hahahaha);
        btnHahahahaha = findViewById(R.id.btn_deephahaha);


        btnHahahahaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHahahaha();
            }
        });

        btnDeepHahaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDeepHahaha();
            }
        });

    }

    private void playHahahaha(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_laughs_hahahaha);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playDeepHahaha(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_laughs_deephaha);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

}
