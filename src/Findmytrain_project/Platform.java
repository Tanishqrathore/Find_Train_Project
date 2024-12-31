package Findmytrain_project;

public class Platform {
    private int platformNumber;
    //platform per train aaegi: need to link these classes too
    private Train train;


    //platform may or may not contain a train:so dont make a constructor  that takes in train

    public Platform(int platformNumber ){
        this.platformNumber=platformNumber;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformNumber=" + platformNumber +
                ", train=" + train +
                '}';
    }
}
