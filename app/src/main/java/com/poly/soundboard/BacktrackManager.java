package com.poly.soundboard;

import android.content.Context;

public class BacktrackManager {
    private static BacktrackManager instance;
    private LoopMediaPlayer mediaPlayer;

    private BacktrackManager() {
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
}