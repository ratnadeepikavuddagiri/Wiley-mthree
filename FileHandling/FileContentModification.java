package FileHandling;

import java.io.*;
import java.util.Scanner;
public class FileContentModification {
    public static void main(String[] args) {
        StringBuilder content=new StringBuilder();
        File file =new File("FileHandling/playground.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine())
                content  = content.append(sc.nextLine());
            content.insert(5,'@');
            int i,c=0;
            for(i=0;i<content.length();i++){
                if(content.charAt(i)==' ')
                    c++;
                if(c==2)
                    break;
            }
            content.insert(i,"123");
            try (FileWriter writer=new FileWriter("FileHandling/playground.txt");){
                    writer.write(content.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
