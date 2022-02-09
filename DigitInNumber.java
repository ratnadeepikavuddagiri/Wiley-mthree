import java.util.Scanner;

public class DigitInNumber {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter a digit[0-9] :");
        n = S.nextInt();
        switch (n) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Enter number between 0-9");
        }

    }

}
