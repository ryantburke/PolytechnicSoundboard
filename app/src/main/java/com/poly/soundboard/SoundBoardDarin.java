package com.poly.soundboard;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoundBoardDarin extends SoundBoardActivity {


    private Button btnAugg, btnBruh, btnDamage, btnDing, btnJeff, btnKobe, btnBaby, btnNoTime, btnOk, btnSqueak, btnWatchIt, btnWow;
    private Context context;

    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_darin);

        context = this;

        ivSwapper = findViewById(R.id.iv_swiper);

        btnAugg = findViewById(R.id.btn_augh);
        btnBaby = findViewById(R.id.btn_dababy);
        btnBruh = findViewById(R.id.btn_bruh);
        btnDamage =findViewById(R.id.btn_damage);
        btnDing = findViewById(R.id.btn_ding);
        btnJeff = findViewById(R.id.btn_jeff);
        btnKobe = findViewById(R.id.btn_kobe);
        btnNoTime = findViewById(R.id.btn_notime);
        btnOk = findViewById(R.id.btn_ok);
        btnSqueak = findViewById(R.id.btn_squeak);
        btnWatchIt = findViewById(R.id.btn_watch);
        btnWow = findViewById(R.id.btn_wow);

        btnAugg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_aughhhhh);
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

        btnBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_baby);
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

        btnBruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_bruh);
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

        btnDamage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_damage);
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

        btnDing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_ding);
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

        btnJeff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_jeff);
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

        btnKobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_kobe);
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

        btnNoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_notime);
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

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_ok);
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

        btnSqueak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_squeak);
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

        btnWatchIt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_watchit);
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

        btnWow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(context,R.raw.sample_darin_wow);
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