package com.mstztrk.j10_8fragmentkullanimi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.mstztrk.j10_8fragmentkullanimi.fragments.Ekran1Frag;
import com.mstztrk.j10_8fragmentkullanimi.fragments.Ekran2Frag;
import com.mstztrk.j10_8fragmentkullanimi.fragments.RenkSecimFragrment;

public class BottomNavBarActivity extends AppCompatActivity {

    Ekran1Frag f1;
    Ekran2Frag f2;
    RenkSecimFragrment rsf;

    BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav_bar);

        f1 = new Ekran1Frag();
        f2 = new Ekran2Frag();
        rsf = new RenkSecimFragrment();

        bnv = (BottomNavigationView) findViewById(R.id.bvb);

        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                String ad = item.getTitle().toString();
                Log.i("ad", "Seçilen menu: " + ad);
                if (id == R.id.opt1) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content_area, f1)
                            .commit();
                } else if (id == R.id.opt2) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content_area, f2)
                            .commit();
                } else {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content_area, rsf)
                            .commit();
                }

                return true;
            }
        });
    }
}
