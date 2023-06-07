package com.poly.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoundBoardLucas extends SoundBoardActivity {

    private Button btnWind;

    private Button btnGameOver;

    private Button btnMonkey;

    private Button btnFart;

    private Button btnClown;

    private Button btnGroan;

    private Button btnCricket;

    private Button btnHorn;

    private Button btnError;

    private Button btnGoose;

    private Button btnSad;

    private Button btnSneez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundboard_lucas);

        context = this;
        ivSwapper = findViewById(R.id.iv_swiper);

        btnWind = findViewById(R.id.btn_wind);

        btnGameOver = findViewById(R.id.btn_gameover);

        btnMonkey = findViewById(R.id.btn_monkey);

        btnFart = findViewById(R.id.btn_fart);

        btnClown = findViewById(R.id.btn_clown);

        btnGroan = findViewById(R.id.btn_groan);

        btnCricket = findViewById(R.id.btn_cricket);

        btnHorn = findViewById(R.id.btn_horn);

        btnError = findViewById(R.id.btn_error);

        btnGoose = findViewById(R.id.btn_goose);

        btnSad = findViewById(R.id.btn_sad);

        btnSneez = findViewById(R.id.btn_sneez);

        btnWind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playWind();
            }
        });

        btnGameOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGameOver();
            }
        });

        btnMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMonkey();
            }
        });

        btnFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFart();
            }
        });

        btnClown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playClown();
            }
        });

        btnGroan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGroan();
            }
        });

        btnCricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playCricket();
            }
        });

        btnHorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHorn();
            }
        });

        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playError();
            }
        });

        btnGoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGoose();
            }
        });

        btnSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSad();
            }
        });

        btnSneez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSneez();
            }
        });
    }

        private void playWind() {
            MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_wind);
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

    private void playGameOver() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_gameover);
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
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_monkey);
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

    private void playFart() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_fart);
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

    private void playClown() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_clown);
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

    private void playGroan() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_groan);
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

    private void playCricket() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_cricket);
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

    private void playHorn() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_horn);
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

    private void playError() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_error);
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

    private void playGoose() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_goose);
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

    private void playSad() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_sad);
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

    private void playSneez() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.sample_lucas_sneeze);
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
