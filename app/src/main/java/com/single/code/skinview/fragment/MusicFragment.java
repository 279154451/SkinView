package com.single.code.skinview.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.single.code.skinview.R;


/**
 * @author Lance
 * @date 2018/3/12
 */

public class MusicFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_music, container, false);
    }

    @Override
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        return super.onGetLayoutInflater(savedInstanceState);
    }
}

