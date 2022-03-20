package FileHandling;
import java.io.*;
import java.util.Scanner;
public class Warning {

    static boolean isDefaulter(int sem,double gpa){
        return ((sem<30 && gpa<1.5)||(sem<60 && gpa<1.75)||(gpa<2));
    }
    public static void main (String[]args)
    {
        int creditHrs;		
        double qualityPts;	
        double gpa;			
        String line, name, inputName = "students.dat";
        
        String outputName = "warning.dat";
        
        try
        {
            File f = new File(inputName);
            Scanner scanner = new Scanner(f);
            FileWriter writer = new FileWriter(outputName,true);
            writer.write("Students on Academic Warning:\n");

            while(scanner.hasNextLine())
            {
                String[] currentLine =scanner.nextLine().split(" ");
                name = currentLine[0];
                creditHrs =Integer.parseInt(currentLine[1]);
                qualityPts = Double.parseDouble(currentLine[2]);
                gpa = qualityPts/creditHrs;
                if(isDefaulter(creditHrs, gpa))
                    writer.write(name+" "+creditHrs+" "+qualityPts+"\n");
             }
            writer.close();
        }
        catch (FileNotFoundException exception)
        {
          System.out.println ("The file " + inputName + " was not found.");
        }
        catch (IOException exception)
        {
          System.out.println (exception);
        }
        catch (NumberFormatException e)
        {
          System.out.println ("Format error in input file: " + e);
        }
    }
}
