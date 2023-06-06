package com.poly.soundboard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.poly.soundboard.RecyclerViewAdapterBacktrack;
import java.util.ArrayList;

public class ChooseBacktrackFragment extends Fragment {
    /* access modifiers changed from: private */
    public BacktrackManager backtrack;
    private ArrayList<ModelBacktrack> backtracks;
    /* access modifiers changed from: private */
    public Context context;
    private RecyclerView recyclerView;

    public static ChooseBacktrackFragment newInstance() {
        return new ChooseBacktrackFragment();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.backtrack = BacktrackManager.getInstance();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.context = getActivity();
        return inflater.inflate(R.layout.fragment_backtracks, container, false);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.recyclerView = (RecyclerView) view.findViewById(R.id.mRecyclerView);;
        recyclerView.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        backtracks = new ArrayList<ModelBacktrack>();

        backtracks.add(new ModelBacktrack("Garagy", "Ryan Burke", R.raw.sample_backtrack_garagy));
        backtracks.add(new ModelBacktrack("Anxiety", "Ryan Burke", R.raw.sample_backtrack_anxiety));


        RecyclerViewAdapterBacktrack adapter = new RecyclerViewAdapterBacktrack(context, backtracks);
        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new RecyclerViewAdapterBacktrack.OnItemClickListener() {
            public void onItemClick(ModelBacktrack model) {
                backtrack.stopMediaPlayer();
                backtrack.startMediaPlayer(ChooseBacktrackFragment.this.context, model.getMediaFile());
            }
        });
    }
}
