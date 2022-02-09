import java.util.Scanner;

class CheckPrime {
    public static void main(String[] args) {
        int n, c = 0;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 0)
            System.out.println("prime");
        else
            System.out.println("Not prime");
    }
}
