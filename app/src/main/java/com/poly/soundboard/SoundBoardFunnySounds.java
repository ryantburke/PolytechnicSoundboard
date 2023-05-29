package com.poly.soundboard;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;



public class SoundBoardFunnySounds extends SoundBoardActivity {

    @Override
    public void initialize() {
        setContentView(R.layout.soundboard_funny_sounds);
        ivSwapper = findViewById(R.id.iv_swiper);
        context = this;

        Button btnHello = findViewById(R.id.btn_hello);
        Button btnHi = findViewById(R.id.btn_hi);


        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHello();
            }
        });

        btnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHi();
            }
        });
    }



    private void playHello(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_funnysounds_hello);
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

    private void playHi(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_funnysounds_hi);
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
