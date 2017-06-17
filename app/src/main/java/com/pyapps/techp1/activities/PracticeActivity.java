package com.pyapps.techp1.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.pyapps.techp1.R;
import com.pyapps.techp1.fragments.BaseFragment;
import com.pyapps.techp1.fragments.BrotherDetailsFragment;
import com.pyapps.techp1.inmemory.InMemoryBrothersBase;
import com.pyapps.techp1.models.Brother;

/**
 * Created by prudh on 6/16/2017.
 */

public class PracticeActivity extends BaseActivity {

    private static final String BROTHER_EXTRA_INFO = "BROTHER_EXTRA_INFO";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.activity_practice_fragment_container);

        if(fragment == null){
            fragment = BrotherDetailsFragment.newInstance();

            fragmentManager.beginTransaction()
                    .add(R.id.activity_practice_fragment_container,fragment)
                    .commit();
        }
    }

    public static Intent newIntent(Context context, Brother brother)
    {
        Intent intent = new Intent(context,PracticeActivity.class);
        intent.putExtra(BROTHER_EXTRA_INFO,brother);
        return intent;


    }
}
