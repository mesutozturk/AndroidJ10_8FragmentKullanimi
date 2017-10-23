package com.mstztrk.j10_8fragmentkullanimi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.mstztrk.j10_8fragmentkullanimi.fragments.RenkSecimFragrment;

public class MainActivity extends AppCompatActivity {
    LinearLayout llContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llContent = (LinearLayout) findViewById(R.id.content_area);

        //fragmentimizin adı bu
        RenkSecimFragrment rsf = new RenkSecimFragrment();

        //fragment çağırmak için kullandık
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_area, rsf)
                .commit();
    }
}
