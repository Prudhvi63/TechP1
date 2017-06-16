package com.pyapps.techp1.infrastructure;

import android.app.Application;

import com.squareup.otto.Bus;

/**
 * Created by prudh on 6/15/2017.
 */

public class BeastApplication extends Application {
    private  Bus bus;

    public  BeastApplication(){
        bus = new Bus();
    }

    public  Bus getBus()
    {
        return bus;
    }
}
