package com.poly.soundboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.slider.Slider;
import com.poly.soundboard.RecyclerViewAdapterBacktrack;
import java.util.ArrayList;

public class ChooseBacktrackFragment extends Fragment {
    /* access modifiers changed from: private */
    private BacktrackManager backtrack;
    private ArrayList<ModelBacktrack> backtracks;
    /* access modifiers changed from: private */
    public Context context;
    private RecyclerView recyclerView;
    private SharedPreferences prefs;

    private View view;
    private View overlayView;
    private View tutorialLayout;

    public static ChooseBacktrackFragment newInstance() {
        return new ChooseBacktrackFragment();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.backtrack = BacktrackManager.getInstance();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.context = getActivity();
        prefs = getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        return inflater.inflate(R.layout.fragment_backtracks, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        this.recyclerView = (RecyclerView) view.findViewById(R.id.mRecyclerView);;
        recyclerView.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        backtracks = new ArrayList<ModelBacktrack>();
        backtracks.add(new ModelBacktrack("Basic", "Ryan Burke", R.raw.sample_backtrack_basic));
        backtracks.add(new ModelBacktrack("The Buildup", "Ryan Burke", R.raw.sample_backtrack_build_up));
        backtracks.add(new ModelBacktrack("Desert Shimmy", "Ryan Burke", R.raw.sample_backtrack_desert_shimmy));
        backtracks.add(new ModelBacktrack("Garagy", "Ryan Burke", R.raw.sample_backtrack_garagy));
        backtracks.add(new ModelBacktrack("More Cowbell", "Ryan Burke", R.raw.sample_backtrack_more_cowbell));
        backtracks.add(new ModelBacktrack("To the Depths", "Ryan Burke", R.raw.sample_backtrack_downward));
        backtracks.add(new ModelBacktrack("Walking to the Train Station", "Ryan Burke", R.raw.sample_backtrack_train_station));
        backtracks.add(new ModelBacktrack("Weird Carnival", "Ryan Burke", R.raw.sample_backtrack_weird_carnival));

        Slider sVolume = (Slider) view.findViewById(R.id.slider_volume);

        Button btnStop = view.findViewById(R.id.btn_stop);

        showTutorialIfNeeded();


        RecyclerViewAdapterBacktrack adapter = new RecyclerViewAdapterBacktrack(context, backtracks);
        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new RecyclerViewAdapterBacktrack.OnItemClickListener() {
            public void onItemClick(ModelBacktrack model) {
                backtrack.stopMediaPlayer();
                backtrack.startMediaPlayer(ChooseBacktrackFragment.this.context, model.getMediaFile());
                sVolume.setEnabled(true);
                btnStop.setEnabled(true);
            }
        });


        sVolume.setValue(backtrack.getVolume() * 50);
        sVolume.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                if (backtrack != null) {
                    backtrack.setVolume(value / 50);
                }
            }
        });



        btnStop.setVisibility(View.INVISIBLE);

        if (BacktrackManager.getInstance() != null) {
            btnStop.setVisibility(View.VISIBLE);
        }

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BacktrackManager.getInstance().stopMediaPlayer();
            }
        });
    }

    private void showTutorialIfNeeded() {

        //tutorial settings
        boolean hasChosenBacktrack = prefs.getBoolean("hasChosenBacktrack",false);

        overlayView = view.findViewById(R.id.overlay);
        tutorialLayout = view.findViewById(R.id.layout_tutorial_backtrack);

        if (!hasChosenBacktrack) {
            overlayView.setVisibility(View.VISIBLE);
            tutorialLayout.setVisibility(View.VISIBLE);
            overlayView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    overlayView.setVisibility(View.GONE);
                    tutorialLayout.setVisibility(View.GONE);
                    prefs.edit().putBoolean("hasChosenBacktrack",true).apply();
                }
            });
        }

    }
}
