package Findmytrain_project;

public class Train {
    private String trainID;
    private String trainName;
    private String traintype;

    public Train(String trainID, String trainName, String traintype) {
        this.trainID = trainID;
        this.trainName = trainName;
        this.traintype = traintype;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTraintype() {
        return traintype;
    }

    public void setTraintype(String traintype) {
        this.traintype = traintype;
    }

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID='" + trainID + '\'' +
                ", trainName='" + trainName + '\'' +
                ", traintype='" + traintype + '\'' +
                '}';
    }
}
