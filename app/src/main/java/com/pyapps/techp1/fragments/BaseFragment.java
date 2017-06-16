package com.pyapps.techp1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.pyapps.techp1.infrastructure.BeastApplication;
import com.squareup.otto.Bus;

import butterknife.ButterKnife;

/**
 * Created by prudh on 6/15/2017.
 */

public class BaseFragment extends Fragment {

    private BeastApplication application;
    protected Bus bus;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (BeastApplication) getActivity().getApplication();
        bus = application.getBus();
        bus.register(this);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }
}

