import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        int n1, n2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers :");
        n1 = s.nextInt();
        n2 = s.nextInt();
        int p = n1 * n2;
        System.out.print("LCM of " + n1 + " and " + n2 + ": ");
        if (n1 < n2) {
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        while (n2 != 0) {

            int r = n1 % n2;
            n1 = n2;
            n2 = r;

        }
        System.out.println(p / n1);
    }
}
