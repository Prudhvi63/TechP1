package com.pyapps.techp1.views.meetabroviews;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pyapps.techp1.R;
import com.pyapps.techp1.models.Brother;

import java.util.ArrayList;

/**
 * Created by prudh on 6/15/2017.
 */

public class MeetABroAdapter extends RecyclerView.Adapter<MeetABroViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    private AppCompatActivity activity;
    private BrotherClickedListener listener;
    private ArrayList<Brother> brothers;

    public MeetABroAdapter(BrotherClickedListener listener, AppCompatActivity activity) {
        this.listener = listener;
        this.activity = activity;
        inflater = activity.getLayoutInflater();
        brothers = new ArrayList<Brother>();
    }

    public ArrayList<Brother> getBrothers() {
        return brothers;
    }

    @Override
    public MeetABroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listView = inflater.inflate(R.layout.list_meet_a_bro,parent,false);
        listView.setOnClickListener(this);
        return new MeetABroViewHolder(listView);
    }

    @Override
    public void onBindViewHolder(MeetABroViewHolder holder, int position) {
        holder.populate(activity,brothers.get(position));
    }

    @Override
    public int getItemCount() {
        return brothers.size();
    }

    @Override
    public void onClick(View v) {
        if(v.getTag() instanceof Brother)
        {
            Brother brother = (Brother) v.getTag();
            listener.onBrotherClicked(brother);
        }

    }

    public interface BrotherClickedListener
    {
         void onBrotherClicked(Brother brother);

    }
}
