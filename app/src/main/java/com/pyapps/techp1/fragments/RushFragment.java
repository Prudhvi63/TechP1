package com.pyapps.techp1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyapps.techp1.R;

/**
 * Created by prudh on 6/14/2017.
 */

public class RushFragment extends BaseFragment {

    public static RushFragment newInstance()
    {
        return new RushFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rush,container,false);
    }
}
