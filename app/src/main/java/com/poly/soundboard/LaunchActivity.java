package com.poly.soundboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LaunchActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */

    private ImageView ivSwapper;
    private Context context;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        context = this;
        ((Button) findViewById(R.id.btn_launch)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_start_instructions);

                setContentView(R.layout.activity_start_instructions);
                ivSwapper = findViewById(R.id.iv_swiper);
                swapBoardOnGesture();

            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void swapBoardOnGesture(){

        ivSwapper.setOnTouchListener(new OnSwipeTouchListener(context) {
            public void onSwipeRight() {
                Intent intent = new Intent(context,SoundBoardAnimalsMisc.class);
                startActivity(intent);
            }

            public void onSwipeLeft() {
                Intent intent = new Intent(context,SoundBoardNaithan.class);
                startActivity(intent);
            }

            public void onSwipeTop(){
                Intent intent = new Intent(context, MenuActivity.class);
                startActivity(intent);
            }

        });

    }
}
