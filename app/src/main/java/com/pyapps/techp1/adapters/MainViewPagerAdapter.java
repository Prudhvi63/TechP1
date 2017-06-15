package com.pyapps.techp1.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.pyapps.techp1.fragments.AboutUsFragment;
import com.pyapps.techp1.fragments.MeetABroFragment;
import com.pyapps.techp1.fragments.RushFragment;

/**
 * Created by prudh on 6/14/2017.
 */

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {

    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position)
        {
            case 0:
                fragment = AboutUsFragment.newInstance();
                break;
            case 1:
                fragment = MeetABroFragment.newInstance();
                break;
            case 2:
                fragment = RushFragment.newInstance();
                break;
            default:
                fragment = null;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        switch (position)
        {
            case 0:
                title = "About Us";
                break;
            case 1:
                title = "Meet A bro";
                break;
            case 2:
                title = "Rush";
                break;
            default:
                title = null;
        }

        return title;
    }
}
