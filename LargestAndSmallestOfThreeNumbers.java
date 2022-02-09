import java.util.Scanner;

public class LargestAndSmallestOfThreeNumbers {

    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 3 Numbers : ");
        n1 = S.nextInt();
        n2 = S.nextInt();
        n3 = S.nextInt();
        int temp = n1 > n2 ? n1 : n2;
        int max = temp > n3 ? temp : n3;
        System.out.println("Largest Number : " + max);
        temp = n1 < n2 ? n1 : n2;
        int min = temp < n3 ? temp : n3;
        System.out.println("Smallest Number : " + min);
    }
}
