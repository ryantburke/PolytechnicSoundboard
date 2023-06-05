package com.poly.soundboard;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

public class SoundBoardParty extends SoundBoardActivity {

    private Button btnRing;

    private Button btnWildGeese;

    private Button btnArcade;

    private Button btnDonkeyScream;

    private Button btnSword;

    private Button btnMonkey;

    private Button btnRobot;

    private Button btnThunder;

    private Button btnGuitar;

    private Button btnWhistle;

    private Button btnToy;

    private Button btnBird;

    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_jon);

        context = this;
        ivSwapper = findViewById(R.id.iv_swiper);

        btnRing = findViewById(R.id.btn_ring);
        btnWildGeese = findViewById(R.id.btn_wildgeese);
        btnArcade = findViewById(R.id.btn_arcade);
        btnDonkeyScream = findViewById(R.id.btn_donkeyscream);
        btnSword = findViewById(R.id.btn_sword);
        btnMonkey = findViewById(R.id.btn_monkey);
        btnRobot = findViewById(R.id.btn_robot);
        btnThunder = findViewById(R.id.btn_thunder);
        btnGuitar = findViewById(R.id.btn_guitar);
        btnWhistle = findViewById(R.id.btn_whistle);
        btnToy = findViewById(R.id.btn_toy);
        btnBird = findViewById(R.id.btn_bird);

        btnRing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRing();
            }

        });


        btnWildGeese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playWildGeese();
            }

        });

        btnArcade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playArcade();
            }

        });

        btnDonkeyScream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDonkeyScream();
            }

        });

        btnSword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSword();
            }

        });

        btnMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMonkey();
            }

        });

        btnRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRobot();
            }

        });

        btnThunder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playThunder();
            }

        });

        btnGuitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGuitar();
            }

        });

        btnWhistle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playWhistle();
            }

        });

        btnToy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playToy();
            }

        });

        btnBird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBird();
            }

        });
    }






        private void playRing() {
            MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_ring);
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

    private void playWildGeese() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_geese);
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

    private void playArcade() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_arcade);
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

    private void playDonkeyScream() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_donkey);
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

    private void playSword() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_sword);
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

    private void playMonkey() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_monkey);
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

    private void playRobot() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_alien);
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

    private void playThunder() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_thunder);
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

    private void playGuitar() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_guitar);
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

    private void playWhistle() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_whistle);
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

    private void playToy() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_toy);
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

    private void playBird() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_jon_bird);
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

