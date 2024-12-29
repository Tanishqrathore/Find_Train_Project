package Aadhar_pan_linker_project;

import java.util.HashMap;
import java.util.Map;
//create internal shit as private
//then create public functions to expose what the internal shit returns;
public class PanService {
    private static Map<String,Pan> panmap = new HashMap<>();
    static{ //static block
        panmap.put("6990",new Pan("11123","6990","Savings","10L"));
        panmap.put("6991",new Pan("11124","6991","Company","500L"));

    }

    public Pan getpanbyaadharnum(String aadharnumber){
        for(Pan x:panmap.values()){  //how to use foreach on map
            if(x.getAadharnum().equals(aadharnumber)){ //always compare strings using equals and not ==
                return x;
            }
        }
        return null;
    }
}

//we cant use foreach directly on map as it doesnt implement iterable
//x.value(): returns a collections object that implements iterable and hence foreach is applicable on it.
