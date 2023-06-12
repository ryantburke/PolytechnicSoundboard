package com.poly.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class SoundBoardActivity extends AppCompatActivity {


    protected ImageView ivSwapper;
    protected SoundBoardsManager soundBoardsManager;
    protected Context context = this;

    protected View overlayView;
    protected View tutorialLayout;
    protected SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initialize();

        showTutorialIfNeeded();

        soundBoardsManager = SoundBoardsManager.getInstance();

        swapBoardOnGesture();

    }

    protected void initialize(){
        setContentView(R.layout.activity_main);
        ivSwapper = findViewById(R.id.iv_swiper);

    }

    private void showTutorialIfNeeded() {

        prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        boolean hasSwipedHorizontal = prefs.getBoolean("hasSwipedHorizontal",false);
        boolean hasSwipedUp = prefs.getBoolean("hasSwipedUp",false);

        overlayView = findViewById(R.id.overlay);
        tutorialLayout = findViewById(R.id.layout_tutorial);

        if (!hasSwipedHorizontal || !hasSwipedUp) {
            overlayView.setVisibility(View.VISIBLE);
            tutorialLayout.setVisibility(View.VISIBLE);

            if (hasSwipedHorizontal) {
                findViewById(R.id.tv_swipe_left).setVisibility(View.INVISIBLE);
                findViewById(R.id.tv_swipe_right).setVisibility(View.INVISIBLE);
                findViewById(R.id.iv_swipe_left).setVisibility(View.INVISIBLE);
                findViewById(R.id.iv_swipe_right).setVisibility(View.INVISIBLE);
            }
            overlayView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    overlayView.setVisibility(View.GONE);
                    tutorialLayout.setVisibility(View.GONE);
                }
            });
        }

    }

    @SuppressLint("ClickableViewAccessibility")
    private void swapBoardOnGesture(){

        Log.d("Current SoundBoard", ""+ soundBoardsManager.getCurIndex());

        ivSwapper.setOnTouchListener(new OnSwipeTouchListener(SoundBoardActivity.this) {
            public void onSwipeRight() {
                Log.d("swipe","right");
                prefs.edit().putBoolean("hasSwipedHorizontal",true).apply();
                startActivity(soundBoardsManager.getIntentToNext(context));
            }

            public void onSwipeLeft() {
                Log.d("swipe","left");
                prefs.edit().putBoolean("hasSwipedHorizontal",true).apply();
                startActivity(soundBoardsManager.getIntentToPrev(context));
            }

            public void onSwipeTop() {
                Log.d("swipe","up");
                prefs.edit().putBoolean("hasSwipedUp",true).apply();

                startActivity(new Intent(context, MenuActivity.class));
            }

        });

    }

}