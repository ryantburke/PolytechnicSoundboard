package com.poly.soundboard;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SoundBoardDuck extends SoundBoardActivity {

    private ImageButton btnPigg;
    private ImageButton btnCoww;
    private ImageButton btnSheep;
    private ImageButton btnChicken;
    private ImageButton btnHorse;
    private ImageButton btnDuck;
    private ImageButton btnTurkey;
    private ImageButton btnFish;
    private ImageButton btnDog;
    private ImageButton btnGoose;
    private ImageButton btnRooster;
    private ImageButton btnGoat;
    Context context = this;

    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_duck);

        context = this;
        ivSwapper = findViewById(R.id.iv_swiper);

        btnPigg = (ImageButton) findViewById(R.id.btn_pigg);
        btnCoww = (ImageButton) findViewById(R.id.btn_coww);
        btnSheep = (ImageButton) findViewById(R.id.btn_sheep);
        btnChicken = (ImageButton) findViewById(R.id.btn_chicken);
        btnHorse = (ImageButton) findViewById(R.id.btn_horse);
        btnDuck = (ImageButton) findViewById(R.id.btn_duck);
        btnTurkey = (ImageButton) findViewById(R.id.btn_turkey);
        btnFish = (ImageButton) findViewById(R.id.btn_fish);
        btnDog = (ImageButton) findViewById(R.id.btn_dog);
        btnGoose = (ImageButton) findViewById(R.id.btn_goose);
        btnRooster = (ImageButton) findViewById(R.id.btn_rooster);
        btnGoat = (ImageButton) findViewById(R.id.btn_goat);

        btnPigg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnPigg.setImageResource(R.drawable.btnimage_quack_pig_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_pigaaa);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnPigg.setImageResource(R.drawable.btnimage_quack_pig);
                    }
                });
            }
        });

        btnCoww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnCoww.setImageResource(R.drawable.btnimage_quack_cow_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_cow);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnCoww.setImageResource(R.drawable.btnimage_quack_cow);
                    }
                });
            }
        });

        btnSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnCoww.setImageResource(R.drawable.btnimage_quack_sheep_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_sheep);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnSheep.setImageResource(R.drawable.btnimage_quack_sheep);
                    }
                });
            }
        });


        btnChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnChicken.setImageResource(R.drawable.btnimage_quack_chicken_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_chicken);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnChicken.setImageResource(R.drawable.btnimage_quack_chicken);
                    }
                });
            }
        });

        btnHorse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHorse.setImageResource(R.drawable.btnimage_quack_horse_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_horse);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnHorse.setImageResource(R.drawable.btnimage_quack_horse);
                    }
                });
            }
        });

        btnDuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDuck.setImageResource(R.drawable.btnimage_quack_duck_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_duck);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnDuck.setImageResource(R.drawable.btnimage_quack_duck);
                    }
                });
            }
        });

        btnTurkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnTurkey.setImageResource(R.drawable.btnimage_quack_turkey);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_turkey);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnTurkey.setImageResource(R.drawable.btnimage_quack_turkey);
                    }
                });
            }
        });

        btnFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnFish.setImageResource(R.drawable.btnimage_quack_fish_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_fishnuke);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnFish.setImageResource(R.drawable.btnimage_quack_fish);
                    }
                });
            }
        });

        btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDog.setImageResource(R.drawable.btnimage_quack_dog_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_dog);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnPigg.setImageResource(R.drawable.btnimage_quack_dog);
                    }
                });
            }
        });

        btnGoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnGoose.setImageResource(R.drawable.btnimage_quack_goose_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_goouse);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnGoose.setImageResource(R.drawable.btnimage_quack_goose);
                    }
                });
            }
        });

        btnRooster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnRooster.setImageResource(R.drawable.btnimage_quack_rooster_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_rooster);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnRooster.setImageResource(R.drawable.btnimage_quack_rooster);
                    }
                });
            }
        });

        btnGoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnGoat.setImageResource(R.drawable.btnimage_quack_goat_clicked);
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_duck_goat);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        btnGoat.setImageResource(R.drawable.btnimage_quack_goat);
                    }
                });
            }
        });


    }
}

