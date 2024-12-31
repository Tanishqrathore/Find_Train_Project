package Findmytrain_project;

//this amalgamates all classes


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Train_System {
   private Map<String,Station> stations= new HashMap<>();
    private Map<String,Train> trains= new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    public void addStations(Station station){
        stations.put(station.getStationId(),station);
    }

    public void addTrains(Train train){
        trains.put(train.getTrainID(),train);
    }

    public void addSchedules(Schedule schedule){
        schedules.add(schedule);
    }
    //creating a service to get trains bw 2 destinations
    //now we can have multiple trains arriving at diff time at diff station etc: so many schedules are possibe:hence it return a list of schedules
    public List<Schedule> findMyTrain(String startStationId,String endStationId){
        List<Schedule> res = new ArrayList<>();

        for(Schedule schedule:schedules){
            //crude logic since we dont check times but ok
           if(schedule.getStation().getStationId().equals(startStationId)||schedule.getStation().getStationId().equals(endStationId)){
               res.add(schedule);
           }
    }
    return res;
    }





}
