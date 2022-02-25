class Location{
    String street;
    String city;
    Location(String street, String city) {
        this.street = street;
        this.city = city;
    }
    @Override
    public String toString() {
        return "[city=" + city + ", street=" + street + "]";
    } 
}
class Address{
    Location location;
    String state;
    String country;
    // public Address() {
    // }
    
    Address(Location location, String state, String country) {
        this.location = location;
        this.state = state;
        this.country = country;
    }
    @Override
    public String toString() {
        return "[country=" + country + ", location=" + location + ", state=" + state + "], ";
    }


}
class UPIPaymentApps implements Cloneable{
    String appName;
    int dailyLimit;
    double maxDailyAmount;
    Address headOfficeLocation;
    
    UPIPaymentApps(){
    }
    public UPIPaymentApps(String appName,int dailyLimit, double maxDailyAmount,
            Address headOfficeLocation) {
        this.appName = appName;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
        this.headOfficeLocation = headOfficeLocation;
    }
    UPIPaymentApps(String appName,int dailyLimit,double maxDailyAmount){
        this.appName = appName;
        this.dailyLimit = dailyLimit;
        this.maxDailyAmount = maxDailyAmount;
        }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        Location location = new Location(this.headOfficeLocation.location.street, this.headOfficeLocation.location.city);
        Address address = new Address(location, this.headOfficeLocation.state, this.headOfficeLocation.country);
        return new UPIPaymentApps(this.appName, this.dailyLimit, this.maxDailyAmount,address);
    
    }
    @Override
    public String toString() {
        return "appName=" + appName +  ", dailyLimit=" + dailyLimit
                + ", headOfficeLocation=" + headOfficeLocation + " maxDailyAmount=" + maxDailyAmount ;
    } 
}

public class OnlineBanking {

    public static void main(String[] args) throws CloneNotSupportedException {
        Location location = new Location("Nalla Vaari Street","Tanuku");
        Address address = new Address(location,"A.P","India");
        UPIPaymentApps bhim = new UPIPaymentApps("BHIM",10, 100000,address);
        System.out.println("Before Cloning BHIM app\n"+bhim);  
        UPIPaymentApps paytm = (UPIPaymentApps) bhim.clone();
        paytm.appName = "Paytm";
        System.out.println("\nBefore cloning paytm app:\n"+paytm);
        paytm.headOfficeLocation.state ="Telangana";
        paytm.headOfficeLocation.location.city = "Hyderabad";
        System.out.println("\nAfter Cloning BHIM app\n"+bhim);
        System.out.println("\nAfter cloning paytm app:\n"+paytm);
    }
}
