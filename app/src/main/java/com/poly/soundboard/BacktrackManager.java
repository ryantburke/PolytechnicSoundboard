package com.poly.soundboard;

import android.content.Context;

public class BacktrackManager {
    private static BacktrackManager instance;
    private LoopMediaPlayer mediaPlayer;
    private float volume;

    private BacktrackManager() {
        volume = 1;
    }

    public static BacktrackManager getInstance() {
        if (instance == null) {
            instance = new BacktrackManager();
        }
        return instance;
    }

    public void startMediaPlayer(Context context, int file) {
        if (this.mediaPlayer == null) {
            this.mediaPlayer = LoopMediaPlayer.create(context, file);
            mediaPlayer.setVolume(volume);
        }
    }

    public void stopMediaPlayer() {
        LoopMediaPlayer loopMediaPlayer = this.mediaPlayer;
        if (loopMediaPlayer != null) {
            loopMediaPlayer.stop();
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    public void setVolume(float volume) {
        this.volume = volume;
        mediaPlayer.setVolume(volume);
    }

    public float getVolume(){
        return volume;
    }
}