package Serialization;

import java.io.*;

public class Kiosk {
    public static void main(String... args) {
        try (FileOutputStream fout = new FileOutputStream("Serialization/account.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);) {
            // Creating the object
            BankAccount bankAccount = new BankAccount(1, "Deepika",1000);
            // Write the object into the file
            out.writeObject(bankAccount);
            // Flush the output stream pipe
            out.flush();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("failure");
            System.out.println(e);
        }
    }
}
