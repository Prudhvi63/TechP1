package com.pyapps.techp1.inmemory;

import com.pyapps.techp1.infrastructure.BeastApplication;
import com.squareup.otto.Bus;

/**
 * Created by prudh on 6/15/2017.
 */

public class InMemoryBrothersBase {

    protected final BeastApplication application;
    protected final Bus bus;

    public InMemoryBrothersBase(BeastApplication application) {
        this.application = application;
        bus  = application.getBus();
        bus.register(this);
    }
}
