package com.poly.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoundBoardConnor extends SoundBoardActivity {

    private Button btnFire;
    private Button btnLaugh;
    private Button btnMonkeyLaugh;
    private Button btnDroneSound;
    private Button btnCricketChirp;
    private Button btnDogBarking;
    private Button btnFastCar;
    private Button btnTapeRewind;
    private Button btnTerrorTransition;

    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_connor);

        context = this;

        ivSwapper =findViewById(R.id.iv_swiper);

        btnFire = findViewById(R.id.btn_fire);
        btnLaugh = findViewById(R.id.btn_laugh);
        btnMonkeyLaugh = findViewById(R.id.btn_monkeylaugh);
        btnDroneSound = findViewById(R.id.btn_crepydrone);
        btnCricketChirp = findViewById(R.id.btn_cricketchrip);
        btnDogBarking = findViewById(R.id.btn_dog);
        btnFastCar = findViewById(R.id.btn_car);
        btnTapeRewind = findViewById(R.id.btn_rewind);
        btnTerrorTransition = findViewById(R.id.btn_terror);


        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playFire();
            }
        });
        btnLaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playLaugh();
            }
        });
        btnMonkeyLaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMonkeyLaugh();
            }
        });

        btnDroneSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDroneSound();
            }
        });

        btnCricketChirp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playCricketChirp();
            }
        });


        btnDogBarking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDogBarking();
            }
        });

        btnFastCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playFastCar();
            }
        });

        btnTapeRewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playTapeRewind();
            }
        });

        btnTerrorTransition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playTerrorTransition();
            }
        });


    }

    private void playFire(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_fire);
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



    private void playLaugh(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_laughing);
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


    private void playMonkeyLaugh(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_monkey);
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


    private void playDroneSound(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_drone);
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

    private void playCricketChirp(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_cricket);
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


    private void playDogBarking(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_dog);
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

    private void playFastCar(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_car);
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

    private void playTapeRewind(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_rewind);
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

    private void playTerrorTransition(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_connor_terror);
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