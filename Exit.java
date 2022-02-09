import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the integers and to quit enter 'q'");
        int c = -1;
        String n;
        do {
            n = S.next();
            c++;
        } while ((n.equals("q")) == false);
        System.out.println("Number of integers : " + c);

    }
}
