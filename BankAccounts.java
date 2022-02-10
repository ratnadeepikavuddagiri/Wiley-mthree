import java.util.Scanner;
class Account{
    String accountHolder;
    double balance;
    
    Account(String accountHolder,double balance ){
        this.balance = balance;
        this.accountHolder = accountHolder;
    }
    void debit(int amount) {
        if(amount>balance)
        System.out.println("Insufficient Money");
        else
        balance -= amount;
        System.out.println("\nDebited Amount "+amount+"\nYour Current Balance : "+balance);

    }
    void credit(int amount) {
        balance += amount;
        System.out.println("\nCredited Amount: "+amount+"\nYour current Balance : "+balance);
    }
    void print(){
        System.out.println("\nAccount Holder Name : "+accountHolder);
        System.out.println("Balance : "+balance);
        
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        Account account1 = new Account("Deepika",30000);
        Account account2 = new Account("Jhansi",30000);
        account1.print();
        account2.print();
        account1.debit(5000);
        account2.credit(10000);
        account1.print();
        account2.print();
    }
}
