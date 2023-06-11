package com.poly.soundboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChooseSoundboardFragment extends Fragment {
    /* access modifiers changed from: private */
    public Context context;
    private RecyclerView recyclerView;
    private SoundBoardsManager soundBoardsManager;
    private SharedPreferences prefs;
    private View view;
    private View overlayView;
    private View tutorialLayout;

    public static ChooseSoundboardFragment newInstance(ArrayList<ModelSoundBoard> arrayList) {
        return new ChooseSoundboardFragment();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.context = getActivity();
        prefs = getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        return inflater.inflate(R.layout.fragment_soundboards, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.mRecyclerView);
        this.recyclerView = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        soundBoardsManager = SoundBoardsManager.getInstance();

        showTutorialIfNeeded();

        RecyclerViewAdapterSoundBoard adapter = new RecyclerViewAdapterSoundBoard(context, soundBoardsManager.getModels());
        this.recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new RecyclerViewAdapterSoundBoard.OnItemClickListener() {
            public void onItemClick(ModelSoundBoard model, int position) {
                Log.d("Clicked", model.getTitle());
                prefs.edit().putBoolean("hasChosenSoundBoard",true).apply();
                startActivity(soundBoardsManager.getIntentTo(context,position));
            }
        });
    }

    private void showTutorialIfNeeded() {

        //tutorial settings
        boolean hasChosenSoundBoard = prefs.getBoolean("hasChosenSoundBoard",false);
        boolean hasChosenBacktrack = prefs.getBoolean("hasChosenBacktrack",false);

        overlayView = view.findViewById(R.id.overlay);
        tutorialLayout = view.findViewById(R.id.layout_tutorial_menu);

        if (!hasChosenSoundBoard || !hasChosenBacktrack) {
            overlayView.setVisibility(View.VISIBLE);
            tutorialLayout.setVisibility(View.VISIBLE);
            overlayView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    overlayView.setVisibility(View.GONE);
                    tutorialLayout.setVisibility(View.GONE);
                }
            });
        }

    }
}
