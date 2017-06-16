package com.pyapps.techp1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyapps.techp1.R;
import com.pyapps.techp1.models.Brother;
import com.pyapps.techp1.views.meetabroviews.MeetABroAdapter;

import java.util.ArrayList;

public class MeetABroFragment extends Fragment implements MeetABroAdapter.BrotherClickedListener{

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
        adapter = new MeetABroAdapter(this, (AppCompatActivity) getActivity());
        brothers = adapter.getBrothers();
        recyclerView = (RecyclerView) rootView.findViewById(R.id.fragemnt_meet_a_bro_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        setUpAdapter();
        getBrothers(brothers);
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
    }

    private ArrayList<Brother> getBrothers ( ArrayList<Brother> brothers)
    {
        for(int i=0; i<=1000;i++)
        {
            Brother brother = new Brother();
            brother.setId(i);
            brother.setDepartment("Computer Science"+i);
            brother.setName("Brother"+i);
            brother.setWhyJoin("For this"+i+" things");
            brother.setDescription("Desc"+i);
            brother.setPicture("http://www.gravatar.com/avatar/"+i+"?d=identicon");
            brothers.add(brother);


        }
        return brothers;

    }
}