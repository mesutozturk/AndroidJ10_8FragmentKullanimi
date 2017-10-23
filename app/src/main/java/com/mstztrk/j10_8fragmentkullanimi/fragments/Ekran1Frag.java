package com.mstztrk.j10_8fragmentkullanimi.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mstztrk.j10_8fragmentkullanimi.R;

/**
 * Created by Mesut on 23.10.2017.
 */

public class Ekran1Frag extends Fragment {
    View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.frag_ekran1, container, false);

        return root;
    }
}
