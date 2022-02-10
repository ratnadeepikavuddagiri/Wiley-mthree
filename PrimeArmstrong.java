import java.util.Scanner;
public class PrimeArmstrong {
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        return (sum == original);
    }
    static boolean isPrime(int n){
        
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n=S.nextInt();
        for(int i=1;i<=n;i++){
            if(isPrime(i)&&(i!=1))
            System.out.println(i+" is prime Number.");
            else if(isArmstrong(i))
            System.out.println(i+" is Armstrong Number.");
            else
            System.out.println(i+" is neither prime nor Armstrong Number.");
        }
    }
}
