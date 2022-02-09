import java.util.Scanner;

public class TypesOfTriangles {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int s1, s2, s3;
        System.out.println("Enter sides of a triangle : ");
        s1 = S.nextInt();
        s2 = S.nextInt();
        s3 = S.nextInt();
        if ((s1 == s2) && (s2 == s3))
            System.out.println("Equilateral Triangle");
        else if ((s1 != s2) && (s2 != s3) && (s3 != s1))
            System.out.println("Scalene Triangle");
        else
            System.out.println("Isoceles Triangle");
    }
}
