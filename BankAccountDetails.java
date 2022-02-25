import java.util.Scanner;
class BankAccount{
    static int cnt=1;
    int accNo;
    String accHolderName;
    double accBalance;
    
    BankAccount() {
        this.accNo = cnt;
        cnt++;
        this.accBalance = 0.0;
    }
    BankAccount(String accHolderName) {
        this();
        this.accHolderName = accHolderName;
    }
    BankAccount(int accNo, String accHolderName, double accBalance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }

    public int getAccNo() {
        return this.accNo;
    }
    public String getAccHolderName() {
        return this.accHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public double getAccBalance() {
        return this.accBalance;
    }

    @Override
    public String toString() {
        return "accNo = " + accNo +", accHolderName = " + accHolderName + ", accBalance=" + accBalance  ;
    }
    int getYearlyTax(){
        return 0;
    }
    int getInHandYearlySalary(){
        return 0;
    }
    static BankAccount cloneObject(BankAccount obj) {
        return new BankAccount(obj.accNo,obj.accHolderName,obj.accBalance);
    }
    BankAccount getStatement(){
        System.out.println("Name :"+this.getAccHolderName());
        System.out.println("Account Type :"+getClass().getSimpleName());
        return this;

    }

}
class SavingsAccount extends BankAccount{
    int rateOfInterest;
    
    SavingsAccount(String accHolderName) {
        super(accHolderName);
        this.rateOfInterest = 3;
    }
    

    public SavingsAccount(int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
    }


    public int getRateOfInterest() {
        return rateOfInterest;
    }
    public void setRateOfInterest(int rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
    int getComputedInterest(int years){
        return rateOfInterest*years;
    }
    int getYearlyInterest(){
        return getComputedInterest(1);
    }
    
    SavingsAccount cloneObject(SavingsAccount obj) {
        return new SavingsAccount(obj.accNo,accHolderName,obj.accBalance);
    }
    SavingsAccount getStatement(){
        System.out.println("Name :"+this.getAccHolderName());
        System.out.println("Account Type :"+getClass().getSimpleName());
        return this;

    }
}
class CurrentAccount extends BankAccount{
    int avgDailyTransaction;
    
    public CurrentAccount(String accHolderName) {
        super(accHolderName);        
        this.avgDailyTransaction = 5000;
    }

    public CurrentAccount(int accNo, String accHolderName, double accBalance) {
        super(accNo, accHolderName, accBalance);
    }

    public int getAvgDailyTransaction() {
        return avgDailyTransaction;
    }

    public void setAvgDailyTransaction(int avgDailyTransaction) {
        this.avgDailyTransaction = avgDailyTransaction;
    }
    int getTotalTransactionAmount(int days){
        return avgDailyTransaction*days;
    }
    int getYearlyTransaction(){
        return getTotalTransactionAmount(365);
    }
    
    @Override
    public String toString() {
        return super.toString()+" avgDailyTransaction=" + avgDailyTransaction ;
    }
    CurrentAccount cloneObject(CurrentAccount obj) {
        return new CurrentAccount(obj.accNo,accHolderName,obj.accBalance);
    }
    CurrentAccount getStatement(){
        System.out.println("Name :"+this.getAccHolderName());
        System.out.println("Account Type :"+getClass().getSimpleName());
        return this;

    }
}

public class BankAccountDetails {
    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);
        BankAccount generalAcc = new BankAccount("Deepika");
        SavingsAccount savingsAcc =new SavingsAccount("Jhansi");
        CurrentAccount currentAcc = new CurrentAccount("Nandini");
        System.out.println(generalAcc.getStatement());
        System.out.println(savingsAcc.getStatement());
        System.out.println(currentAcc.getStatement());
        
        // System.out.println(generalAcc.toString());
        // System.out.println(savingsAcc.toString());
        // System.out.println(currentAcc.toString());
        // System.out.println("Demonstration of Savings Account Methods");
        // System.out.println("getComputedInterest : "+savingsAcc.getComputedInterest(3));
        // System.out.println("Yearly Interest : "+savingsAcc.getYearlyInterest());
        // System.out.println("Demonstration of Current Account Methods");
        // System.out.println("getTotalTransaction : "+currentAcc.getTotalTransactionAmount(21));
        // System.out.println("get Yearly Interest : "+currentAcc.getYearlyTransaction());
        // BankAccount salaryAcc = new BankAccount(){
        //     int salary = 1000;
        //     int pfAmount = 100;
        //     int incomeTaxRate = 100;
        //     @Override
        //     int getYearlyTax(){
        //         return incomeTaxRate*12;
        //     }
        //     @Override
        //     int getInHandYearlySalary(){
        //         return (salary-pfAmount-incomeTaxRate)*12; 
        //     }
            
        // };
        // System.out.println(salaryAcc.getYearlyTax());
        // System.out.println(salaryAcc.getInHandYearlySalary());
        // int n;
        // System.out.println("Enter n value:");
        // n = S.nextInt();
        //     SavingsAccount[] savingsAccs =new SavingsAccount[n];
        //     CurrentAccount[] currentAccs = new CurrentAccount[n];
        //     BankAccount[] salaryAccs = new BankAccount[n];
        // for(int i=0;i<n;i++){
        //     savingsAccs[i] = new SavingsAccount("Account"+i+1);
        //     currentAccs[i] = new CurrentAccount("Account"+i+1);
        //     salaryAccs[i] = new BankAccount("Account"+i+1){
        //         int salary = 1000;
        //         int pfAmount = 100;
        //         int incomeTaxRate = 100;
        //         @Override
        //         int getYearlyTax(){
        //             return incomeTaxRate*12;
        //         }
        //         @Override
        //         int getInHandYearlySalary(){
        //             return (salary-pfAmount-incomeTaxRate)*12; 
        //     }
        //     };
        // }
        // for(int i=0;i<n;i++){
        // System.out.println(savingsAccs[i].toString());
        // System.out.println(currentAccs[i].toString());
        // }
        // char ch;
        // System.out.println("Input Savings Account/Current Account(S/C) : ");
        // ch =S.next().charAt(0);
        // if(ch == 'S'){
        //     SavingsAccount s1 = new SavingsAccount(201,"Deepika",3000);
        //     System.out.println(s1.toString());
        //     System.out.println(s1.cloneObject(s1));
        // }
        // if(ch=='C'){
        //     CurrentAccount c1 = new CurrentAccount(202,"Jhansi",2000);
        //     System.out.println(c1.toString());
        //     System.out.println(c1.cloneObject(c1));
        // }
        // SavingsAccount savingAcc = new SavingsAccount("hari");
        // BankAccount bankAcc  = BankAccount.cloneObject(savingAcc);
        // System.out.println(bankAcc.toString());
        // System.out.println(savingAcc.toString());

        // CurrentAccount currAcc = new CurrentAccount("hari");
        // BankAccount bankAcc1  = BankAccount.cloneObject(currAcc);
        // System.out.println(bankAcc1.toString());
        // System.out.println(currAcc.toString());
        
    }
}
