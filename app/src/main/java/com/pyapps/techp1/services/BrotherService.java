package com.pyapps.techp1.services;

import com.pyapps.techp1.models.Brother;

import java.util.ArrayList;

/**
 * Created by prudh on 6/15/2017.
 */

public class BrotherService {

    public BrotherService()
    {}

    public static class BrothersRequest
    {
        public String fireBaseUrl;
    }

    public static class BrothersResponse
    {
        public ArrayList<Brother> brothers;
    }
}
