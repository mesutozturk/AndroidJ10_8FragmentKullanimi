package com.mstztrk.j10_8fragmentkullanimi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ToxicBakery.viewpager.transforms.CubeInTransformer;
import com.ToxicBakery.viewpager.transforms.ScaleInOutTransformer;
import com.mstztrk.j10_8fragmentkullanimi.fragments.Ekran1Frag;
import com.mstztrk.j10_8fragmentkullanimi.fragments.Ekran2Frag;
import com.mstztrk.j10_8fragmentkullanimi.fragments.RenkSecimFragrment;

public class ViewPagerKullanActivity extends AppCompatActivity {
    Ekran1Frag f1;
    Ekran2Frag f2;
    RenkSecimFragrment rsf;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_kullan);

        f1 = new Ekran1Frag();
        f2 = new Ekran2Frag();
        rsf = new RenkSecimFragrment();

        vp = (ViewPager) findViewById(R.id.vp);

        FragmentPagerAdapter fpa = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                if (position == 0)
                    return f1;
                else if (position == 1)
                    return f2;
                else return rsf;
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                String[] adlar = {"Ekran 1", "Ekran 2", "Renk Seçici"};
                return adlar[position];
            }
        };
        vp.setAdapter(fpa);

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                String[] adlar = {"Ekran 1", "Ekran 2", "Renk Seçici"};
                Toast.makeText(ViewPagerKullanActivity.this, "Seçili Ekran: " + adlar[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        vp.setPageTransformer(true, new CubeInTransformer());
        vp.setPageTransformer(true, new ScaleInOutTransformer());
        vp.postDelayed(new Runnable() {
            @Override
            public void run() {
                vp.setCurrentItem(0);
            }
        }, 100);
    }
}
