import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        int y;
        System.out.println("enter year : ");
        Scanner S = new Scanner(System.in);
        y = S.nextInt();
        if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
            System.out.println("Leap Year");
        else
            System.out.println("Non - Leap Year");
    }
}
