package com.mstztrk.j10_8fragmentkullanimi.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.mstztrk.j10_8fragmentkullanimi.R;

/**
 * Created by Mesut on 23.10.2017.
 */

public class RenkSecimFragrment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    final static String RENK_TAG = "RENG_FRAG";
    View root;
    SeekBar sbRed, sbGreen, sbBlue;
    TextView tvSonuc;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //tüm fragmet bir layout üzerine inflate edilerek view olarak kullanıma sunuluyor.
        root = inflater.inflate(R.layout.frag_renk_secimi, container, false);

        //seekbarlar bind edildi
        sbRed = root.findViewById(R.id.sbR);
        sbGreen = root.findViewById(R.id.sbG);
        sbBlue = root.findViewById(R.id.sbB);
        tvSonuc = root.findViewById(R.id.tvSonuc);

        //yukarıdaki implement edilen interface kullanılarak burada event oluşturuldu. aşağıda kullanımları var.
        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);

        return root;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bb) {
        Log.i(RENK_TAG, "Seekbar değeri değişti");

        int r = sbRed.getProgress();
        int g = sbGreen.getProgress();
        int b = sbBlue.getProgress();
        int renk = Color.rgb(r, g, b);
        tvSonuc.setBackgroundColor(renk);

        int textRenk = Color.rgb(255 - r, 255 - g, 255 - b);
        tvSonuc.setTextColor(textRenk);
        tvSonuc.setText(String.format("[%d,%d,%d]", r, g, b));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Log.i(RENK_TAG, "Seekbara dokunuldu");
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Log.i(RENK_TAG, "Seekbar Bırakıldı");
    }
}
