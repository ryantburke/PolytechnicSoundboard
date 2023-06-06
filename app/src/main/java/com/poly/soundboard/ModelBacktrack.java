package com.poly.soundboard;

import java.io.Serializable;

public class ModelBacktrack implements Serializable {
    private String author;
    private int mediaFile;
    private String name;

    public ModelBacktrack(String name2, String author2) {
        this.name = name2;
        this.author = author2;
    }

    public ModelBacktrack(String name2, String author2, int mediaFile2) {
        this.mediaFile = mediaFile2;
        this.name = name2;
        this.author = author2;
    }

    public int getMediaFile() {
        return this.mediaFile;
    }

    public String getTitle() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }
}
