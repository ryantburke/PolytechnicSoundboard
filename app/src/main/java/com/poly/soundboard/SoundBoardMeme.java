package com.poly.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoundBoardMeme extends SoundBoardActivity {

     private Button btnWlaugh, btnWeave, btnYeahboy,btnTrombone,btnMscream,btnWhip,btnBruh,btnWoah,btnMygod,btnOhhh,btnJeff,btnLscream;
     
    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_meme);

        context = this;
        ivSwapper = findViewById(R.id.iv_swiper);

        btnWlaugh = findViewById(R.id.btn_wlaugh);
        btnWeave = findViewById(R.id.btn_weave);
        btnYeahboy = findViewById(R.id.btn_yeahboy);
        btnTrombone = findViewById(R.id.btn_trombone);
        btnMscream = findViewById(R.id.btn_mscream);
        btnWhip = findViewById(R.id.btn_whip);
        btnBruh = findViewById(R.id.btn_bruh);
        btnWoah = findViewById(R.id.btn_woah);
        btnMygod = findViewById(R.id.btn_mygod);
        btnOhhh = findViewById(R.id.btn_ohhh);
        btnJeff = findViewById(R.id.btn_jeff);
        btnLscream = findViewById(R.id.btn_lscream);

        btnWlaugh.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {

                 playWlaugh();
            }
        });

        btnWeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playWeave();
            }
        });

        btnYeahboy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playYeahboy();
            }
        });

        btnTrombone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playTrombone();
            }
        });

        btnMscream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playMscream();
            }
        });

        btnWhip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playWhip();
            }
        });

        btnBruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playBruh();
            }
        });

        btnWoah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playWoah();
            }
        });

        btnMygod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playMygod();
            }
        });

        btnOhhh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playOhhh();
            }
        });

        btnJeff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playJeff();
            }
        });

        btnLscream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playLscream();
            }
        });

    }

    private void playWlaugh() {
         MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_wlaugh);
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

    private void playWeave() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_weave);
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

    private void playYeahboy() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_yeahboy);
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
    private void playTrombone() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_trombone);
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

    private void playMscream() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_mscream);
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

    private void playWhip() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_whip);
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

    private void playBruh() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_bruh);
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

    private void playWoah() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_woah);
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

    private void playMygod() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_mygod);
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

    private void playOhhh() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_ooh);
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

    private void playJeff() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_jeff);
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

    private void playLscream() {
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_memes_lscream);
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