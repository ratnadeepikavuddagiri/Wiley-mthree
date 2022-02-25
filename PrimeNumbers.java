import java.util.Scanner;
interface in1
{
    void display(int n);
}
class TestClass implements in1{

    @Override
    public void display(int n) {
        int c=0;
        for(int j=2;j<=n;j++){
            if(isPrime(j))
                c++;
        }
        System.out.println(c);
    }
    static boolean isPrime(int n){
        for(int i=2;i<=n/i;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }                     
}
public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int t;
        TestClass testClass = new TestClass();
        System.out.println("Enter no .of test cases :");
        t =S.nextInt();
        while(t>0){
            int n;
            n= S.nextInt();
            testClass.display(n);
            t--;
        }    
    }
}
