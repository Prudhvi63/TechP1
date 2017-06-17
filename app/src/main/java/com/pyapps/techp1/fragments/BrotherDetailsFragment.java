package com.pyapps.techp1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;

import com.pyapps.techp1.R;
import com.pyapps.techp1.models.Brother;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by prudh on 6/16/2017.
 */

public class BrotherDetailsFragment extends BaseFragment {

    public static BrotherDetailsFragment newInstance()
    {
       return new BrotherDetailsFragment();
    }


    @BindView(R.id.fragment_brother_deatils_imageView)
    ImageView imageView;

    @BindView(R.id.fragment_brother_deatils_ProgressBar)
    ProgressBar progressBar;

    @BindView(R.id.fragment_brother_deatils_name)
    TextView txtviewBrotherName;

    @BindView(R.id.fragment_brother_deatils_whyJoin)
    TextView textViewBrotherWhyJoin;

    @BindView(R.id.fragment_brother_deatils_department)
    TextView textViewBrotherDepartment;

    @BindView(R.id.fragment_brother_deatils_funfact)
    TextView textViewBrotherFunFact;



    Brother brother;
    private final String BROTHER_EXTRA_INFO = "BROTHER_EXTRA_INFO";


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        brother = getActivity().getIntent().getParcelableExtra(BROTHER_EXTRA_INFO);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_brother_details,container,false);
        ButterKnife.bind(this,rootView);
        txtviewBrotherName.setText(brother.getName());
        textViewBrotherDepartment.setText(brother.getDepartment());
        textViewBrotherWhyJoin.setText(brother.getWhyJoin());
        textViewBrotherFunFact.setText(brother.getFunfact());

        Picasso.with(getActivity()).load(brother.getPicture())
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
        return rootView;

    }
}
