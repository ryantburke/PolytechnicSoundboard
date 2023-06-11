package com.poly.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class SoundBoardActivity extends AppCompatActivity {


    protected ImageView ivSwapper;
    protected SoundBoardsManager soundBoardsManager;
    protected Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initialize();

        soundBoardsManager = SoundBoardsManager.getInstance();

        swapBoardOnGesture();

    }

    protected void initialize(){
        setContentView(R.layout.activity_main);
        ivSwapper = findViewById(R.id.iv_swiper);

    }

    @SuppressLint("ClickableViewAccessibility")
    private void swapBoardOnGesture(){

        Log.d("Current SoundBoard", ""+ soundBoardsManager.getCurIndex());

        ivSwapper.setOnTouchListener(new OnSwipeTouchListener(SoundBoardActivity.this) {
            public void onSwipeRight() {
                Log.d("swipe","right");
                startActivity(soundBoardsManager.getIntentToNext(context));
            }

            public void onSwipeLeft() {
                Log.d("swipe","left");
                startActivity(soundBoardsManager.getIntentToPrev(context));
            }

            public void onSwipeTop() {
                Log.d("swipe","up");
                startActivity(new Intent(context, MenuActivity.class));
            }

        });

    }

}