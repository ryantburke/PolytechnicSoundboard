package com.poly.soundboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        final Intent intent = new Intent(this, SoundBoardZMenu.class);
        ((Button) findViewById(R.id.btn_launch)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                setContentView(R.layout.activity_start_instructions);

                Button btnLaunch = findViewById(R.id.btn_launch);

                btnLaunch.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        StartActivity.this.startActivity(intent);
                    }
                });
            }
        });
    }
}
