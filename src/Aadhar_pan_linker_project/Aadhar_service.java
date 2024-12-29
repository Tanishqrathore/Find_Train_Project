package Aadhar_pan_linker_project;

import java.util.HashMap;
import java.util.Map;

public class Aadhar_service {

    private static Map<String,Aadhar> aadharmap = new HashMap<>();
    static{
        aadharmap.put("11123",new Aadhar("Tom","11123","jerry","Delhi"));
        aadharmap.put("11124",new Aadhar("Tom1","11124","jerry1","Agra"));

    }

    public Aadhar getAadharbynum(String number){
        return aadharmap.get(number);
    }

}
