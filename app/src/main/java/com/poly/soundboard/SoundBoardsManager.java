package com.poly.soundboard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

public class SoundBoardsManager {

    private static SoundBoardsManager instance;

    private ArrayList<ModelSoundBoard> soundboards;

    private int curIndex;

    private SoundBoardsManager() {
        curIndex = 0;
        soundboards = new ArrayList<ModelSoundBoard>();
        soundboards = new ArrayList<ModelSoundBoard>();
        soundboards.add(new ModelSoundBoard("Acoustic Guitar Board", "Esteban DLS", new SoundBoardGuitar()));
        soundboards.add(new ModelSoundBoard("Animals & Misc", "Enrique Martinez", new SoundBoardAnimalsMisc()));
        soundboards.add(new ModelSoundBoard("BreezyBoard", "Fabrizio Martinez", new SoundBoardFabrizio()));
        soundboards.add(new ModelSoundBoard("Connor's Amazing Soundboard", "Connor English", new SoundBoardConnor()));
        soundboards.add(new ModelSoundBoard("Deezy", "Dylan Ork", new SoundboardDeezy()));
        soundboards.add(new ModelSoundBoard("Duck", "Jose Gonzalez", new SoundBoardDuck()));
        soundboards.add(new ModelSoundBoard("Fairy Sounds", "Destiny Chacon", new SoundBoardFairySounds()));
        soundboards.add(new ModelSoundBoard("GarageBand", "Hannah Rodriguez", new SoundBoardGarageBand()));
        soundboards.add(new ModelSoundBoard("GoofyBoard", "Leo Lerma", new SoundBoardLeo()));
        soundboards.add(new ModelSoundBoard("The Greatest", "Nate Berumen", new SoundBoardNate()));
        soundboards.add(new ModelSoundBoard("Marsound", "Mario Rocha", new SoundBoardMarsound()));
        soundboards.add(new ModelSoundBoard("Meme", "Bryan Guzman", new SoundBoardMeme()));
        soundboards.add(new ModelSoundBoard("Natimals", "Natalie Guevara", new SoundBoardMarsound()));
        soundboards.add(new ModelSoundBoard("Party", "Jonathan Mek", new SoundBoardParty()));
        soundboards.add(new ModelSoundBoard("Sokit", "Darin Sok", new SoundBoardDarin()));
        soundboards.add(new ModelSoundBoard("Soundboard Lucas", "Lucas King Baltazar", new SoundBoardLucas()));
        soundboards.add(new ModelSoundBoard("WackAttack 2.0", "Naithan Rivera", new SoundBoardNaithan()));
    }

    public static SoundBoardsManager getInstance() {
        if (instance == null) {
            instance = new SoundBoardsManager();
        }
        return instance;
    }

    public ModelSoundBoard getSoundBoardModel(int index) {
        curIndex = index;
        return soundboards.get(index);
    }

    public Activity getActivity(int index) {
        curIndex = index;
        return soundboards.get(index).getActivity();
    }

    public Intent getIntentTo(Context context, int index) {
        curIndex = index;
        return new Intent(context,soundboards.get(index).getActivity().getClass());

    }

    public Intent getIntentToNext(Context context){
        curIndex = (++curIndex % soundboards.size() + soundboards.size()) % soundboards.size();
        return new Intent(context, soundboards.get(curIndex).getActivity().getClass());
    }

    public Intent getIntentToPrev(Context context){
        curIndex = (--curIndex % soundboards.size() + soundboards.size()) % soundboards.size();
        return new Intent(context, soundboards.get(curIndex).getActivity().getClass());
    }

    public ArrayList<ModelSoundBoard> getModels(){
        return soundboards;
    }

    public int getCurIndex(){
        return curIndex;
    }

    public void setCurIndex(int index){
        this.curIndex = index;
    }


}
