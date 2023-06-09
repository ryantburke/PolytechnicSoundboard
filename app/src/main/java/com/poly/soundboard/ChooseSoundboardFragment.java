package com.poly.soundboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.poly.soundboard.RecyclerViewAdapterSoundBoard;
import java.util.ArrayList;

public class ChooseSoundboardFragment extends Fragment {
    /* access modifiers changed from: private */
    public Context context;
    private RecyclerView recyclerView;
    private ArrayList<ModelSoundBoard> soundboardsList;

    public static ChooseSoundboardFragment newInstance(ArrayList<ModelSoundBoard> arrayList) {
        return new ChooseSoundboardFragment();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.context = getActivity();
        return inflater.inflate(R.layout.fragment_soundboards, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.mRecyclerView);
        this.recyclerView = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        soundboardsList = new ArrayList<ModelSoundBoard>();
        soundboardsList.add(new ModelSoundBoard("Animals & Misc", "Enrique Martinez", new SoundBoardAnimalsMisc()));
        soundboardsList.add(new ModelSoundBoard("BreezyBoard", "Fabrizio Martinez", new SoundBoardFabrizio()));
        soundboardsList.add(new ModelSoundBoard("Connor's Amazing Soundboard", "Connor English", new SoundBoardConnor()));
        soundboardsList.add(new ModelSoundBoard("Deezy", "Dylan Ork", new SoundboardDeezy()));
        soundboardsList.add(new ModelSoundBoard("Duck", "Jose Gonzalez", new SoundBoardDuck()));
        soundboardsList.add(new ModelSoundBoard("Fairy Sounds", "Destiny Chacon", new SoundBoardFairySounds()));
        soundboardsList.add(new ModelSoundBoard("GarageBand", "Hannah Rodriguez", new SoundBoardGarageBand()));
        soundboardsList.add(new ModelSoundBoard("GoofyBoard", "Leo Lerma", new SoundBoardLeo()));
        soundboardsList.add(new ModelSoundBoard("The Greatest", "Nate Berumen", new SoundBoardNate()));
        soundboardsList.add(new ModelSoundBoard("Marsound", "Mario Rocha", new SoundBoardMarsound()));
        soundboardsList.add(new ModelSoundBoard("Meme", "Bryan Guzman", new SoundBoardMeme()));
        soundboardsList.add(new ModelSoundBoard("Natimals", "Natalie Guevara", new SoundBoardMarsound()));
        soundboardsList.add(new ModelSoundBoard("Party", "Jonathan Mek", new SoundBoardParty()));
        soundboardsList.add(new ModelSoundBoard("Sokit", "Darin Sok", new SoundBoardDarin()));
        soundboardsList.add(new ModelSoundBoard("Soundboard Lucas", "Lucas King Baltazar", new SoundBoardLucas()));
        soundboardsList.add(new ModelSoundBoard("WackAttack 2.0", "Naithan Rivera", new SoundBoardNaithan()));

        RecyclerViewAdapterSoundBoard adapter = new RecyclerViewAdapterSoundBoard(this.context, this.soundboardsList);
        this.recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new RecyclerViewAdapterSoundBoard.OnItemClickListener() {
            public void onItemClick(ModelSoundBoard model) {
                Log.d("Clicked", model.getTitle());
                startActivity(new Intent(ChooseSoundboardFragment.this.context, model.getActivity().getClass()));
            }
        });
    }
}
