import java.util.Scanner;

public class DisplayNvalue {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int m, n = 0;
        System.out.println("Enter m value : ");
        m = S.nextInt();
        if (m > 0)
            n = 1;
        if (m == 0)
            n = 0;
        if (m < 0)
            n = -1;
        System.out.println("N value is : " + n);
    }
}
