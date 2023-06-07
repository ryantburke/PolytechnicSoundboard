package com.poly.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SoundBoardFairySounds extends SoundBoardActivity {


    private Button btnMagical, btnWaterSpell, btnBellBless, btnGlitter, btnTeleportaiton, btnHorrorBell, btnPotion, btnVideoGame, btnBellOfPromise, btnSpinning, btnLongSpell, btnBubbles;

    protected void initialize() {
        setContentView(R.layout.soundboard_fairysounds);

        context = this;
        ivSwapper = findViewById(R.id.iv_swiper);
        //buttons
        btnMagical = findViewById(R.id.btn_magical);
        btnWaterSpell = findViewById(R.id.btn_water_spell);
        btnBellBless = findViewById(R.id.btn_bell_bless);
        btnGlitter = findViewById(R.id.btn_fairy_glitter);
        btnTeleportaiton = findViewById(R.id.btn_teleportation);
        btnHorrorBell = findViewById(R.id.btn_horror_fairy);
        btnPotion = findViewById(R.id.btn_potion);
        btnVideoGame = findViewById(R.id.btn_video_game);
        btnBellOfPromise = findViewById(R.id.btn_bell_of_promise);
        btnSpinning = findViewById(R.id.btn_spinning);
        btnLongSpell = findViewById(R.id.btn_long_spell);
        btnBubbles = findViewById(R.id.btn_bubbles);

        btnMagical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMagical();
            }
        });
        btnWaterSpell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playWaterSpell();
            }
        });
        btnBellBless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBellBless();
            }
        });
        btnGlitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGlitter();
            }
        });
        btnTeleportaiton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playTeleportation();
            }
        });
        btnHorrorBell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHorrorBell();
            }
        });
        btnPotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPotion();
            }
        });
        btnVideoGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playVideoGame();
            }
        });
        btnBellOfPromise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBellOfPromise();
            }
        });
        btnSpinning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSpinning();
            }
        });
        btnLongSpell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playLongSpell();
            }
        });
        btnBubbles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBubbles();
            }
        });


        }
        private void playMagical() {
            MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_magical_button);
            mp.start();
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                    mp = null;
                }
            });
        }
    private void playWaterSpell() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_water_spell);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }

    private void playBellBless() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_bell_bless);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
    private void playGlitter() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_glitter);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }

    private void playTeleportation() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_teleport);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
    private void playHorrorBell() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_horror_bell);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
    private void playPotion() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_potion_music);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
    private void playVideoGame() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_video_game_magic);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
    private void playBellOfPromise() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_bell_of_promise);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
    private void playSpinning() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_spinning_magic);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
    private void playLongSpell() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_casting_long_fairy_spell);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }
    private void playBubbles() {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sample_fairysounds_magic_bubbles);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
                mp = null;
            }
        });
    }




}




