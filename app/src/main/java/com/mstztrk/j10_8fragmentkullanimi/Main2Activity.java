package com.mstztrk.j10_8fragmentkullanimi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.mstztrk.j10_8fragmentkullanimi.fragments.RenkSecimFragrment;

public class Main2Activity extends AppCompatActivity {

    LinearLayout linearLayout1, linearLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //layoutları bind ettik
        linearLayout1 = (LinearLayout) findViewById(R.id.content_area1);
        linearLayout2 = (LinearLayout) findViewById(R.id.content_area2);

        RenkSecimFragrment rsf1 = new RenkSecimFragrment();
        RenkSecimFragrment rsf2 = new RenkSecimFragrment();


        getSupportFragmentManager()                     //Fragmentmanager'dan
                .beginTransaction()                     //Yeni bir transaction başlat
                .replace(R.id.content_area1, rsf1)      //Ekranda id'si content_area1 olan yere rsf1 referrerini ekle
                .commit();                              //işlemi onayla!

        getSupportFragmentManager()                     //Fragmentmanager'dan
                .beginTransaction()                     //Yeni bir transaction başlat
                .replace(R.id.content_area2, rsf2)      //Ekranda id'si content_area2 olan yere rsf2 referrerini ekle
                .commit();                              //işlemi onayla!

    }
}
