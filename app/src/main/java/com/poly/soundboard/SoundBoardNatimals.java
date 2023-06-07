package com.poly.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardNatimals extends SoundBoardActivity {
    private Button btnDog;
    private Button btnRain;
    private Button btnBee;
    private Button btnCow;
    private Button btnSheep;
    private Button btnGuitar;
    private Button btnBus;
    private Button btnBike;
    private Button btnTram;
    private Button btnGame;
    private Button btnSiren;
    private Button btnBell;

    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_natimals);

        context = this;
        ivSwapper = findViewById(R.id.iv_swiper);

        btnDog = findViewById(R.id.btn_dog);
        btnRain = findViewById(R.id.btn_rain);
        btnBee = findViewById(R.id.btn_bee);
        btnCow = findViewById(R.id.btn_cow);
        btnSheep = findViewById(R.id.btn_sheep);
        btnGuitar = findViewById(R.id.btn_guitar);
        btnBus = findViewById(R.id.btn_bus);
        btnBike = findViewById(R.id.btn_bike);
        btnTram = findViewById(R.id.btn_tram);
        btnGame = findViewById(R.id.btn_game);
        btnSiren = findViewById(R.id.btn_siren);
        btnBell = findViewById(R.id.btn_bell);

        btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDog();
            }
        });

        btnRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRain();
            }
        });
        btnBee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBee();
            }
        });

        btnCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playCow();
            }
        });

        btnSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSheep();
            }
        });

        btnGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGuitar();
            }
        });

        btnBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBus();
            }
        });
        btnBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBike();
            }
        });

        btnTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playTram();
            }
        });

        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame();
            }
        });

        btnSiren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSiren();
            }
        });

        btnBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBell();
            }
        });



    }

    private void playDog(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_dog);
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

    private void playRain(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_rain);
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

    private void playBee(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_bumblebee);
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

    private void playCow(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_cow);
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

    private void playSheep(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_sheep);
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

    private void playGuitar(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_guitar);
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

    private void playBus(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_bus);
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

    private void playBike(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_motorcycle);
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

    private void playTram(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_tram);
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

    private void playGame(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_videogame);
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

    private void playSiren(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_siren);
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

    private void playBell(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_bells);
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