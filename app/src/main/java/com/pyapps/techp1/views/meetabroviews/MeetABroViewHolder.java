package com.pyapps.techp1.views.meetabroviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.pyapps.techp1.R;
import com.pyapps.techp1.models.Brother;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by prudh on 6/14/2017.
 */

public class MeetABroViewHolder extends RecyclerView.ViewHolder
{

    @BindView(R.id.list_meet_a_bro_ImageView)
    ImageView imageView;

    @BindView(R.id.list_meet_a_bro_ProgressBar)
    ProgressBar progressBar;


    public MeetABroViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void populate(Context context, Brother brother)
    {
        itemView.setTag(brother);
        Picasso.with(context)
                .load(brother.getPicture())
                .fit()
                .centerCrop()
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError() {

                    }
                });
    }


}
