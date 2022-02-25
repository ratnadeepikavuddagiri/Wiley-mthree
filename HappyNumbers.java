import java.util.Scanner;
public class HappyNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k,n,m;
        k= scanner.nextInt();
        m=k;
        while(true){
            n =squareDigitsSum(m);
            if(n==1){
                System.out.println("Happy Number");
                break;
            }
            else if(n==k||n==4){
                System.out.println("Not a happy number");
                break;
            }
            else{
                System.out.println(n);
                m=n; 
            }                  
        }
    }

    static int squareDigitsSum(int k) {
        int s=0;
        while(k>0){
            int r = k%10;
            s += r*r;
            k /= 10;
        }
        return s;
    }
}