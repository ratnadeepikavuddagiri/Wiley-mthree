package Serialization;

import java.io.*;

public class ATM {

    static void displayBalance(BankAccount bankAccount){
        System.out.println("Balance : "+bankAccount.accBalance);
    }
    public static void main(String args[]) throws IOException {
        ObjectInputStream in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("Serialization/account.txt");
            in = new ObjectInputStream(fin);
            BankAccount bankAccount = (BankAccount) in.readObject();
            System.out.println(bankAccount);
            displayBalance(bankAccount);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            in.close();
            fin.close();
        }
    }    
}
