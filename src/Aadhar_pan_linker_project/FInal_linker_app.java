package Aadhar_pan_linker_project;

import java.util.Scanner;

public class FInal_linker_app {
    public static   void main(String[] args){
        System.out.println("Enter Aadhar number");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        Aadhar a1 = new Aadhar_service().getAadharbynum(x);
        Pan p1 = new PanService().getpanbyaadharnum(x);

        if(a1!=null){
            System.out.println(a1);
            System.out.println(p1);
        }
        else{
            System.out.println("Not in database");
        }
    }
}
