package com.poly.soundboard;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class LoopMediaPlayer {
    public static final String TAG = LoopMediaPlayer.class.getSimpleName();
    private Context mContext = null;
    private int mCounter = 1;
    /* access modifiers changed from: private */
    public MediaPlayer mCurrentPlayer = null;
    /* access modifiers changed from: private */
    public MediaPlayer mNextPlayer = null;
    private int mResId = 0;
    private float volume;
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() {
        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.release();
            LoopMediaPlayer loopMediaPlayer = LoopMediaPlayer.this;
            MediaPlayer unused = loopMediaPlayer.mCurrentPlayer = loopMediaPlayer.mNextPlayer;
            LoopMediaPlayer.this.createNextMediaPlayer();
            Log.d(LoopMediaPlayer.TAG, String.format("Loop #%d", new Object[]{Integer.valueOf(LoopMediaPlayer.access$304(LoopMediaPlayer.this))}));
        }
    };

    static /* synthetic */ int access$304(LoopMediaPlayer x0) {
        int i = x0.mCounter + 1;
        x0.mCounter = i;
        return i;
    }

    public static LoopMediaPlayer create(Context context, int resId) {
        return new LoopMediaPlayer(context, resId);
    }

    private LoopMediaPlayer(Context context, int resId) {
        this.mContext = context;
        this.mResId = resId;
        MediaPlayer create = MediaPlayer.create(context, resId);
        this.mCurrentPlayer = create;
        create.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                mCurrentPlayer.start();
                mCurrentPlayer.setVolume(volume, volume);
            }
        });
        createNextMediaPlayer();
    }

    /* access modifiers changed from: private */
    public void createNextMediaPlayer() {
        MediaPlayer create = MediaPlayer.create(this.mContext, this.mResId);
        mNextPlayer = create;
        mNextPlayer.setVolume(volume, volume);
        mCurrentPlayer.setNextMediaPlayer(create);
        mCurrentPlayer.setVolume(volume, volume);
        mCurrentPlayer.setOnCompletionListener(this.onCompletionListener);
    }

    public boolean isPlaying() throws IllegalStateException {
        return this.mCurrentPlayer.isPlaying();
    }

    public void setVolume(float volume) {
        this.volume = volume;
        this.mCurrentPlayer.setVolume(volume, volume);
    }

    public void start() throws IllegalStateException {
        this.mCurrentPlayer.start();
    }

    public void stop() throws IllegalStateException {
        this.mCurrentPlayer.stop();
    }

    public void pause() throws IllegalStateException {
        this.mCurrentPlayer.pause();
    }

    public void release() {
        this.mCurrentPlayer.release();
        this.mNextPlayer.release();
    }


    public void reset() {
        this.mCurrentPlayer.reset();
    }
}
