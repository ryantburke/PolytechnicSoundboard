package com.poly.soundboard;

import android.app.Activity;
import java.io.Serializable;

public class ModelSoundBoard implements Serializable {
    private Activity activity;
    private String author;
    private String name;

    public ModelSoundBoard(String name2, String author2) {
        this.name = name2;
        this.author = author2;
    }

    public ModelSoundBoard(String name2, String author2, Activity activity2) {
        this.activity = activity2;
        this.name = name2;
        this.author = author2;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public String getTitle() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }
}
