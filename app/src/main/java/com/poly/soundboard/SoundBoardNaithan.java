package com.poly.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardNaithan extends SoundBoardActivity {

    //buttons
    private Button btnBleep, btnWoops, btnArcadeGameover, btnAlienTalk, btnFalling;

    private Button btnSciFiBleep, btnSneeze, btnHorrorChaos, btnSurprise, btnExplosion, btnInterface, btnOpenCan;


    @Override
    public void initialize() {
        super.setContentView(R.layout.soundboard_naithan);
        ivSwapper = findViewById(R.id.iv_swiper);
        context = this;

        //inititalize buttons
        btnBleep = findViewById(R.id.btn_bleep);
        btnWoops = findViewById(R.id.btn_woops);
        btnArcadeGameover = findViewById(R.id.btn_gameover);
        btnAlienTalk = findViewById(R.id.btn_alientalk);
        btnFalling = findViewById(R.id.btn_falling);
        btnSciFiBleep = findViewById(R.id.btn_scifibleep);
        btnSneeze = findViewById(R.id.btn_sneeze);
        btnHorrorChaos = findViewById(R.id.btn_horrorchaos);
        btnSurprise = findViewById(R.id.btn_surprise);
        btnExplosion = findViewById(R.id.btn_explosion);
        btnInterface = findViewById(R.id.btn_interface);
        btnOpenCan = findViewById(R.id.btn_opencan);


        btnBleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBleep();
            }
        });

        btnWoops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playWoops();
            }
        });

        btnArcadeGameover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playArcade();
            }
        });
        btnAlienTalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAlientalk();
            }
        });
        btnFalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFalling();
            }
        });
        btnSciFiBleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playScifibleep();
            }
        });
        btnSneeze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSneeze();
            }
        });
        btnHorrorChaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHorrorchaos();
            }
        });
        btnSurprise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSurprise();
            }
        });
        btnExplosion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playExplosion();
            }
        });
        btnInterface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playInterface();
            }
        });
        btnOpenCan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playOpenCan();
            }
        });

    }

    private void playWoops(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_woops);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playBleep(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_bleep);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playArcade(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_arcadegameover);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playAlientalk(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_alientalk);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }

    private void playFalling(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_fallingeco);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playScifibleep(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_scifibleep);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playSneeze(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_sneeze);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playHorrorchaos(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_horrorchaos);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playSurprise(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_surprise);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playExplosion(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_explosion);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playInterface(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_interface);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
    private void playOpenCan(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_naithan_open_the_can);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp=null;
            }
        });
    }
}