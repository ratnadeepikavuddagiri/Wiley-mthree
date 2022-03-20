package Serialization;

import java.io.Serializable;

public class BankAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    int accNumber;
    String AccHolder;
    double accBalance;

    
    public BankAccount(int accNumber, String accHolder, double accBalance) {
        this.accNumber = accNumber;
        AccHolder = accHolder;
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "BankAccount [AccHolder=" + AccHolder + ", accBalance=" + accBalance + ", accNumber=" + accNumber + "]";
    }   
}



