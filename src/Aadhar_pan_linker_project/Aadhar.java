package Aadhar_pan_linker_project;

public class Aadhar {
    private String aadharnum;
    private String name;
    private String fathername;
    private String address;

    public Aadhar(String name, String aadharnum, String fathername, String address) {
        this.name = name;
        this.aadharnum = aadharnum;
        this.fathername = fathername;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharnum() {
        return aadharnum;
    }

    public void setAadharnum(String aadharnum) {
        this.aadharnum = aadharnum;
    }

    @Override
    public String toString() {
        return "Aadhar{" +
                "name='" + name + '\'' +
                ", fathername='" + fathername + '\'' +
                ", address='" + address + '\'' +
                ", aadharnum='" + aadharnum + '\'' +
                '}';
    }
}
