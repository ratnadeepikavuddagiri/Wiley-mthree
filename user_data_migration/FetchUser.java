package user_data_migration;
import java.io.*;
import java.lang.reflect.Field;

public class FetchUser {
    public static void main(String args[]) throws IOException, NoSuchFieldException {
        ObjectInputStream in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("user_data_migration/userdata.txt");
            in = new ObjectInputStream(fin);
            User user = (User) in.readObject();
            System.out.println("User Record Retreived");
            Class cls = user.getClass();
            Field field = cls.getDeclaredField("password");
            field.setAccessible(true);
            field.set(user,"deepika2000");
            System.out.println(user);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            in.close();
            fin.close();
        }
    }
    
}
