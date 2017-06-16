package com.pyapps.techp1.inmemory;

import com.pyapps.techp1.infrastructure.BeastApplication;

/**
 * Created by prudh on 6/15/2017.
 */

public class Module {

    public static void register(BeastApplication application)
    {
        new InMemoryBrotherService(application);
    }


}
