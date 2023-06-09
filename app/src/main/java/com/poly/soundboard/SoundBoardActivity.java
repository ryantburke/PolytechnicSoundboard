package com.poly.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;


import java.util.ArrayList;

public class SoundBoardActivity extends AppCompatActivity {

    private int layoutSelector = 0;
    protected ImageView ivSwapper;

    private ArrayList<SoundBoardActivity> soundBoards = new ArrayList<SoundBoardActivity>();
    private int currentSoundboardIndex = 0;

    private SoundBoardActivity currentSoundboard;
    protected Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initialize();

        //add soundboards
        soundBoards.add(new SoundBoardAnimalsMisc());
        soundBoards.add(new SoundBoardFabrizio());
        soundBoards.add(new SoundBoardConnor());
        soundBoards.add(new SoundboardDeezy());
        soundBoards.add(new SoundBoardFairySounds());
        soundBoards.add(new SoundBoardGarageBand());
        soundBoards.add(new SoundBoardLeo());
        soundBoards.add(new SoundBoardNate());
        soundBoards.add(new SoundBoardMarsound());
        soundBoards.add(new SoundBoardMeme());
        soundBoards.add(new SoundBoardMarsound());
        soundBoards.add(new SoundBoardParty());
        soundBoards.add(new SoundBoardDarin());
        soundBoards.add(new SoundBoardLucas());
        soundBoards.add(new SoundBoardNaithan());

        currentSoundboard = soundBoards.get(currentSoundboardIndex);

        for(int i=0; i<soundBoards.size(); i++){
            if (soundBoards.get(i).getClass().isInstance(this)){
                currentSoundboardIndex = i;
                break;
            }
        }


        Log.d("added activity",""+soundBoards.get(0).getClass());
        Log.d("added activity",""+soundBoards.get(1).getClass());
        Log.d("added activity",""+soundBoards.get(2).getClass());

        swapBoardOnGesture();

    }

    protected void initialize(){
        setContentView(R.layout.activity_main);
        ivSwapper = findViewById(R.id.iv_swiper);

    }

    @SuppressLint("ClickableViewAccessibility")
    private void swapBoardOnGesture(){

        Log.d("Current SoundBoard", ""+currentSoundboardIndex);

        ivSwapper.setOnTouchListener(new OnSwipeTouchListener(SoundBoardActivity.this) {
            public void onSwipeRight() {
                currentSoundboardIndex++;
                currentSoundboard = soundBoards.get((currentSoundboardIndex % soundBoards.size() + soundBoards.size()) % soundBoards.size());
                Log.d("Swipe","right");
                Log.d("Index",""+currentSoundboardIndex);
                Log.d("Index%",""+currentSoundboardIndex % soundBoards.size() );
                Intent intent = new Intent(context,currentSoundboard.getClass());
                startActivity(intent);

                swapBoardOnGesture();
            }

            public void onSwipeLeft() {
                currentSoundboardIndex--;

                currentSoundboard = soundBoards.get((currentSoundboardIndex % soundBoards.size() + soundBoards.size()) % soundBoards.size());

                Log.d("Swipe","left");
                Log.d("Index",""+currentSoundboardIndex);
                Log.d("Index%",""+currentSoundboardIndex % soundBoards.size() );

                Intent intent = new Intent(context,currentSoundboard.getClass());
                startActivity(intent);

                swapBoardOnGesture();
            }

            public void onSwipeTop(){
                Intent intent = new Intent(context,SoundBoardZMenu.class);
                startActivity(intent);
            }

        });

    }

}