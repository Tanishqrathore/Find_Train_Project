package Aadhar_pan_linker_project;

public class Pan {
    private String aadharnum;
    private  String panmnum;
    private String bankdetails;
    private String investment;

    public String getPanmnum() {
        return panmnum;
    }

    public void setPanmnum(String panmnum) {
        this.panmnum = panmnum;
    }

    public String getAadharnum() {
        return aadharnum;
    }

    public void setAadharnum(String aadharnum) {
        this.aadharnum = aadharnum;
    }

    public String getBankdetails() {
        return bankdetails;
    }

    public void setBankdetails(String bankdetails) {
        this.bankdetails = bankdetails;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public Pan(String aadharnum, String panmnum, String bankdetails, String investment) {
        this.aadharnum = aadharnum;
        this.panmnum = panmnum;
        this.bankdetails = bankdetails;
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "aadharnum='" + aadharnum + '\'' +
                ", panmnum='" + panmnum + '\'' +
                ", bankdetails='" + bankdetails + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
