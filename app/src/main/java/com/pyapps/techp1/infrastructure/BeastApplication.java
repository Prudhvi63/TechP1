package com.pyapps.techp1.infrastructure;

import android.app.Application;

import com.pyapps.techp1.inmemory.Module;
import com.squareup.otto.Bus;

/**
 * Created by prudh on 6/15/2017.
 */

public class BeastApplication extends Application {
    private  Bus bus;

    public  BeastApplication(){
        bus = new Bus();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Module.register(this);
    }

    public  Bus getBus()
    {
        return bus;
    }
}
