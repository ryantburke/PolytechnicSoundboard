package com.poly.soundboard;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;


public class SoundBoardCries extends SoundBoardActivity {


    @Override
    public void initialize() {
        super.setContentView(R.layout.soundboard_cries);
        ivSwapper = findViewById(R.id.iv_swiper);
        context = this;

        Button btnSoftCry = super.findViewById(R.id.btn_soft_cry);
        Button btnLoudCry = super.findViewById(R.id.btn_loud_cry);


        btnSoftCry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSoftCry();
            }
        });

        btnLoudCry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playLoudCry();
            }
        });
    }

    private void playSoftCry(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_cries_soft_cry);
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

    private void playLoudCry(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_cries_loud_cry);
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
