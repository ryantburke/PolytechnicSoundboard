package com.poly.soundboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AboutFragment extends Fragment {
    public static AboutFragment newInstance(String param1, String param2) {
        return new AboutFragment();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnTutorial = view.findViewById(R.id.btn_tutorial);

        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

                prefs.edit().putBoolean("hasChosenSoundBoard",false).apply();
                prefs.edit().putBoolean("hasChosenBacktrack",false).apply();
                prefs.edit().putBoolean("hasSwipedHorizontal",false).apply();
                prefs.edit().putBoolean("hasSwipedUp",false).apply();


            }
        });
    }
}
