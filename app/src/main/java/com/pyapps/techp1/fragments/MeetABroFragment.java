package com.pyapps.techp1.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyapps.techp1.R;
import com.pyapps.techp1.activities.BaseActivity;
import com.pyapps.techp1.activities.PracticeActivity;
import com.pyapps.techp1.models.Brother;
import com.pyapps.techp1.services.BrotherService;
import com.pyapps.techp1.views.meetabroviews.MeetABroAdapter;
import com.squareup.otto.Subscribe;

import java.util.ArrayList;

public class MeetABroFragment extends BaseFragment implements MeetABroAdapter.BrotherClickedListener{

    private final String LOG_TAG = MeetABroFragment.class.getSimpleName();
    private MeetABroAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Brother> brothers;


    public static MeetABroFragment newInstance()
    {
        return new MeetABroFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragement_meet_a_bro,container,false);
        adapter = new MeetABroAdapter(this, (BaseActivity) getActivity());
        brothers = adapter.getBrothers();
        recyclerView = (RecyclerView) rootView.findViewById(R.id.fragemnt_meet_a_bro_recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        setUpAdapter();
        bus.post(new BrotherService.BrothersRequest());
        return rootView;
    }

    private void setUpAdapter()
    {
        if(isAdded())
        {
            recyclerView.setAdapter(adapter);
        }

    }

    @Override
    public void onBrotherClicked(Brother brother)
    {
        Log.i(LOG_TAG,"Brother"+brother.getId()+"was clicked");
        Intent intent = PracticeActivity.newIntent(getActivity(),brother);
        startActivity(intent);
    }

    @Subscribe public void getBrothers (BrotherService.BrothersResponse response)
    {
        brothers.clear();
        brothers.addAll(response.brothers);
    }
}