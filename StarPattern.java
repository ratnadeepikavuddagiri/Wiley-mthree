import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n : ");
        n = S.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
