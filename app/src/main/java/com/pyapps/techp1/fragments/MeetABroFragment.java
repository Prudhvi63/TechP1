package com.pyapps.techp1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyapps.techp1.R;

public class MeetABroFragment extends Fragment {

    public static MeetABroFragment newInstance()
    {
        return new MeetABroFragment();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragement_meet_a_bro,container,false);
    }
}
