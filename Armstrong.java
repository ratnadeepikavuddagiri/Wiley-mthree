import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int original = n;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        System.out.println(sum == original);

    }
}
