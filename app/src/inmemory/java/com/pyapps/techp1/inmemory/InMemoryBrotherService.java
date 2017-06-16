package com.pyapps.techp1.inmemory;

import android.util.Log;

import com.pyapps.techp1.infrastructure.BeastApplication;
import com.pyapps.techp1.models.Brother;
import com.pyapps.techp1.services.BrotherService;
import com.squareup.otto.Subscribe;

import java.util.ArrayList;

/**
 * Created by prudh on 6/15/2017.
 */

public class InMemoryBrotherService  extends InMemoryBrothersBase{

    public InMemoryBrotherService(BeastApplication application) {
        super(application);
    }

    @Subscribe public void getBrothers(BrotherService.BrothersRequest request)
    {
        Log.i("InMemoryBrotherService","request received*******");
        BrotherService.BrothersResponse response = new BrotherService.BrothersResponse();

        response.brothers = new ArrayList<>();

        for(int i=0; i<=40;i++)
        {
            Brother brother = new Brother();
            brother.setId(i);
            brother.setDepartment("Computer Science"+i);
            brother.setName("Brother"+i);
            brother.setWhyJoin("For this"+i+" things");
            brother.setDescription("Desc"+i);
            brother.setPicture("http://www.gravatar.com/avatar/"+i+"?d=identicon");
            response.brothers.add(brother);

        }

        bus.post(response);

    }
}
