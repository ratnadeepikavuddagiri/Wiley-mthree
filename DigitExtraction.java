import java.util.Scanner;
public class DigitExtraction {
    
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        while(n!=0){
            System.out.println(n%10);
            n=n/10;
        }

    }
}
