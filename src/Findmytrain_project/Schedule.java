package Findmytrain_project;


//think whatever needs to be in a train schedule
public class Schedule {
   private Train train;
   private Station station;
   private String arrivalTime;
   private String departureTime;
   private Platform platform;

    //we need all of this data while creating a scedule, so construcotr should include all

    public Schedule(Station station, Train train, String arrivalTime, String departureTime, Platform platform) {
        this.station = station;
        this.train = train;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.platform = platform;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", platform=" + platform +
                '}';
    }
}
