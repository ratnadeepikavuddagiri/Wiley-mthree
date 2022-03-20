package user_data_migration;

import java.io.*;
public class SaveUser {
    public static void main(String... args) {
        try (FileOutputStream fout = new FileOutputStream("user_data_migration/userdata.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);) {
            // Creating the object
            User user = new User("Deepika", "deepika@gmail.com","deepika123");
            // Write the object into the file
            out.writeObject(user);
            // Flush the output stream pipe
            out.flush();
            System.out.println("User Record Saved");
        } catch (Exception e) {
            System.out.println("Saving User Record Failed");
            System.out.println(e);
        }
    }
}
