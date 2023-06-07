package com.poly.soundboard;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoundBoardFabrizio extends SoundBoardActivity {


    private Button btnBlueman, btnBongo, btnbru, btncannot, btncat, btncenna, btnclaps, btndog, btngirlvoice, btnrollout, btnsad, btnstomp ;
    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_fabrizio);

        context = this;
        ivSwapper = findViewById(R.id.iv_swiper);

        btnBlueman = findViewById(R.id.bnt_blueman);
        btnBongo = findViewById(R.id.btn_bongo);
        btnbru = findViewById(R.id.btn_bru);
        btncannot = findViewById(R.id.bnt_cannot);
        btncat = findViewById(R.id.btn_cat);
        btncenna = findViewById(R.id.btn_cenna);
        btnclaps = findViewById(R.id.bnt_claps);
        btndog = findViewById(R.id.btn_dog);
        btngirlvoice = findViewById(R.id.btn_girlvoice);
        btnrollout = findViewById(R.id.btn_rollout);
        btnsad = findViewById(R.id.btn_verysad);
        btnstomp = findViewById(R.id.btn_stomp);

        btnBlueman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_fabrizio_blueman);
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
        });

        btnBongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_bongocat);
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
        });

        btnbru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_bru);
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
        });

        btncannot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_cannot);
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
        });
        btncat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_cat);
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
        });
        btncenna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_cenna);
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
        });
        btnclaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_claps);
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
        });
        btndog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_dog);
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
        });
        btngirlvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_girlvoice);
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
        });
        btnrollout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_rollout);
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
        });
        btnsad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_sad);
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
        });
        btnstomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context, R.raw.sample_fabrizio_stomp);
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
        });
    }
}