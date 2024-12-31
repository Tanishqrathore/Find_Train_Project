package Findmytrain_project;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train_finder_app {
    public static void main(String[] args){
         Train_System system = new Train_System();

         //gotta create some stations
        Station station1 = new Station("ST01","Agra");
        Station station2 = new Station("ST02","Delhi");

        //gotta add trains bw the stations
        Train train1 = new Train("TR01","Rawalpindi express","Passenger");
        Train train2 = new Train("TR02","Shatabdi express","Passenger");

        //Create platform
        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);

        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platform> pf = new ArrayList<>();
        pf.add(p1);
        pf.add(p2);

        station1.setPlatformList(pf);

        Schedule s1 = new Schedule(station1,train1,"9AM","9:05AM",p1);
        Schedule s2= new Schedule(station2,train2,"10AM","10:02AM",p2);

        system.addSchedules(s1);
        system.addSchedules(s2);

        system.addTrains(train1);
        system.addTrains(train2);

        system.addStations(station1);
        system.addStations(station2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting and destination");
        String start = sc.nextLine();
        String end = sc.nextLine();

        //this function returns an array list so nice clean code: far better than pehele ek list mei store krne se
         for(Schedule schedule:system.findMyTrain(start,end)){
             System.out.println(schedule);
         }




    }
}
