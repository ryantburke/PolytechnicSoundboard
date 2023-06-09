package com.poly.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MenuActivity extends AppCompatActivity {
    private MediaPlayer backtrack;
    private Button btnBT1;
    private Button btnBT2;
    private BottomNavigationView nav;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        replaceFragment(new ChooseSoundboardFragment());
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav);
        this.nav = bottomNavigationView;

        nav.setSelectedItemId(R.id.soundboards);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.soundboards) {
                    MenuActivity.this.replaceFragment(new ChooseSoundboardFragment());
                    return true;
                } else if (itemId == R.id.backtracks) {
                    MenuActivity.this.replaceFragment(new ChooseBacktrackFragment());
                    return true;
                } else if (itemId != R.id.bookmarks) {
                    return true;
                } else {
                    MenuActivity.this.replaceFragment(new AboutFragment());
                    return true;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.constraint_layout, fragment);
        fragmentTransaction.commit();
    }

}
