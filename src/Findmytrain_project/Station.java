package Findmytrain_project;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationId;
    private String stationName;

    //we need to somehow interlink classes na, now each station cud have multiple platforms
    //so this is how we link platfrom class with Station class

    private List<Platform> platformList;

    //ab i shudnt be forced to update platforms as soon as i create a station
    //give some independence
    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;

        //make some space for stations though
        this.platformList=new ArrayList<>();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
