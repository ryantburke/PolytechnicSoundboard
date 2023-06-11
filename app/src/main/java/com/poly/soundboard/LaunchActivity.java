package com.poly.soundboard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LaunchActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */

    private ImageView ivSwapper;
    private Context context;
    SharedPreferences prefs;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        context = this;

        Intent intent = new Intent(this, MenuActivity.class);
        ((Button) findViewById(R.id.btn_launch)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(intent);

            }
        });
    }

}
