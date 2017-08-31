package com.tensaii.kidsinnature.bottomnavigation;

/**
 * Created by Tensaii on 30/06/17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tensaii.kidsinnature.R;

public class ScoreFragment extends Fragment {
    public static ScoreFragment newInstance() {
        ScoreFragment fragment = new ScoreFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_score, container, false);
    }
}
