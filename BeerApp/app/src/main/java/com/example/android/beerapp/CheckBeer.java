package com.example.android.beerapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EMASYS ND on 6/14/2017.
 */

public class CheckBeer {
    List<String> beer (String beer){
        List<String> brand  = new ArrayList<String>();

        if(beer.equals("Gulder")){
            brand.add("The master");
        }
        else {
            brand.add("Shine on");
        }
        return brand;
    }

}
