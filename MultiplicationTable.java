import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = scanner.nextInt();
        System.out.println("Multiplication Table : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}
