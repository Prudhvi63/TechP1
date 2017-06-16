package com.pyapps.techp1.views.meetabroviews;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyapps.techp1.models.Brother;

/**
 * Created by prudh on 6/15/2017.
 */

public class MeetABroAdapter extends RecyclerView.Adapter<MeetABroViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    private AppCompatActivity activity;


    @Override
    public MeetABroAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MeetABroViewHolder holder, int position) {

    }

    @Override
    public void onBindViewHolder(MeetABroAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClick(View v) {

    }

    public interface BrotherClickedListener
    {
        public void onBrotherClicked(Brother brother);

    }
}
