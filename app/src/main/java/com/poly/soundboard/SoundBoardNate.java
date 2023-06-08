package com.poly.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoundBoardNate extends SoundBoardActivity {

    private Button  alarm;
    MediaPlayer mp;
    private Button  birds;

    private Button  dogbark;
    private Button  gasp;
    private Button  laser;
    private Button  laugh;
    private Button  rain;
    private Button  retrogame;
    private Button  rocket;
    private Button  sadtrombone;
    private Button  sneeze;
    private Button  swoosh;




    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_nate);

        context = this;
        ivSwapper = findViewById(R.id.iv_swiper);

        alarm = findViewById(R.id.button);
        birds = findViewById(R.id.button2);
        dogbark = findViewById(R.id.button3);
        gasp = findViewById(R.id.button4);
        laser = findViewById(R.id.button5);
        laugh = findViewById(R.id.button6);
        rain = findViewById(R.id.button7);
        retrogame = findViewById(R.id.button8);
        rocket = findViewById(R.id.button9);
        sadtrombone = findViewById(R.id.button10);
        sneeze = findViewById(R.id.button11);
        swoosh = findViewById(R.id.button12);

        alarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_alarm);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });
        birds.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_birds);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });


        dogbark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_dogbark);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });

        gasp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_girlgasp);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });

        laser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_laser);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });

        laugh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_laugh);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });

        rain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_rain);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });

        retrogame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_retrogame);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });

        rocket.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_rocket);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });
                // Code here executes on main thread after user presses button
            }


        });

        sadtrombone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this,R.raw.sample_nate_sadtrombone);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.stop();
                        mp.release();
                        mp = null;
                    }
                });


                // Code here executes on main thread after user presses button
            }




        });

        sneeze.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(SoundBoardNate.this, R.raw.sample_nate_sneeze);
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

                swoosh.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        mp = MediaPlayer.create(SoundBoardNate.this, R.raw.sample_nate_swoosh);
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