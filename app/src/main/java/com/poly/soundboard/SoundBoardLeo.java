package com.poly.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoundBoardLeo extends SoundBoardActivity {

    private Button btnBurke, btnCrickets, btnDarren, btnDoorbell, btnDuck, btnFabrizio, btnGong, btnPunch, btnPunch2, btnShatter, btnSpring, btnToy;

    @Override
    protected void initialize() {
        setContentView(R.layout.soundboard_leo);

        context = this;

        ivSwapper = findViewById(R.id.iv_swiper);

        btnBurke = findViewById(R.id.btn_burke);
        btnFabrizio = findViewById(R.id.btn_fabrizio);
        btnCrickets = findViewById(R.id.btn_cricket);
        btnDarren = findViewById(R.id.btn_darren);
        btnDoorbell = findViewById(R.id.btn_doorbell);
        btnDuck = findViewById(R.id.btn_duck);
        btnGong = findViewById(R.id.btn_gong);
        btnPunch = findViewById(R.id.btn_punch);
        btnPunch2 = findViewById(R.id.btn_punch2);
        btnShatter = findViewById(R.id.btn_shatter);
        btnSpring = findViewById(R.id.btn_spring);
        btnToy = findViewById(R.id.btn_toy);

        btnBurke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playBurke();
            }
        });

        btnCrickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playCrickets();
            }
        });

        btnDarren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDarren();
            }
        });

        btnDoorbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDoorbell();
            }
        });

        btnDuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDuck();
            }
        });

        btnGong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playGong();
            }
        });

        btnPunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playPunch();
            }
        });

        btnPunch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playPunch2();
            }
        });

        btnShatter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playShatter();
            }
        });

        btnSpring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSpring();
            }
        });

        btnToy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playToy();
            }
        });

        btnFabrizio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playFabrizio();
            }
        });


    }


    private void playBurke() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_burke);
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

    private void playCrickets() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_crickets);
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

    private void playDarren() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_darren);
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

    private void playDoorbell() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_doorbell);
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

    private void playDuck() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_duck);
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

    private void playGong() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_gong);
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

    private void playPunch() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_punch);
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

    private void playPunch2() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_punch2);
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

    private void playShatter() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_shatter);
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

    private void playSpring() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_spring);
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
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_toy);
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

    private void playFabrizio() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_leo_fabrizio);
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