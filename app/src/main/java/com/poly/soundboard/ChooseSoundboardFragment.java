package com.poly.soundboard;

import android.content.Context;
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

        soundBoardsManager = SoundBoardsManager.getInstance();

        RecyclerViewAdapterSoundBoard adapter = new RecyclerViewAdapterSoundBoard(context, soundBoardsManager.getModels());
        this.recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new RecyclerViewAdapterSoundBoard.OnItemClickListener() {
            public void onItemClick(ModelSoundBoard model, int position) {
                Log.d("Clicked", model.getTitle());
                startActivity(soundBoardsManager.getIntentTo(context,position));
            }
        });
    }
}
