package com.mstztrk.j10_8fragmentkullanimi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mstztrk.j10_8fragmentkullanimi.fragments.Ekran1Frag;
import com.mstztrk.j10_8fragmentkullanimi.fragments.Ekran2Frag;

public class FragmentDegistrenActivity extends AppCompatActivity implements View.OnClickListener {

    //Onclick methodlarından erişileceği için global alanda tanımladık
    Ekran1Frag f1;
    Ekran2Frag f2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_degistren);

        f1 = new Ekran1Frag();
        f2 = new Ekran2Frag();
        btn1 = (Button) findViewById(R.id.btn_Ekran1);
        btn2 = (Button) findViewById(R.id.btn_Ekran2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_Ekran1) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content_area, f1)
                    .commit();

        } else if (view.getId() == R.id.btn_Ekran2) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content_area, f2)
                    .commit();
        }
    }
}
