package Serialization;
import java.io.*;

class SerializationDemo {

    public static void main(String... args) {
        try (FileOutputStream fout = new FileOutputStream("Serialization/f.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);) {
            // Creating the object
            StudentClass s1 = new StudentClass(21, "Akash");
            // Write the object into the file
            out.writeObject(s1);
            // Flush the output stream pipe
            out.flush();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("failure");
            System.out.println(e);
        }
    }
}