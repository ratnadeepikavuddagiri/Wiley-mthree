import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        int n;
        Scanner S = new Scanner(System.in);
        n = S.nextInt();
        int t = (2 * n);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');

            for (int k = 1; k <= t; k++)
                System.out.print(' ');
            t = t - 2;
            for (int l = 1; l <= i; l++)
                System.out.print('*');

            System.out.println();

        }
        for(int i=1;i<(2*n)-1;i++)
        System.out.print('*');
    }
}
