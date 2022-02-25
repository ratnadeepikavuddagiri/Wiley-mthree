import java.util.*;
class MathUtils
{
    public static int factorial (int n) throws IllegalArgumentException
    {
        if(n<0){
            throw new IllegalArgumentException("Factorial of Negative Numbers is not possible!");
        }
        if(n>16){
            throw new IllegalArgumentException("Factorial of a number above 16 is not possible!");
        }
        int fac = 1;
        for (int i=n; i>0; i--)
        fac *= i;
        return fac;
    }
} 
public class Factorial {
    public static void main(String[] args) throws IllegalArgumentException{
        MathUtils mathUtils = new MathUtils();
        int n;
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        try{
            System.out.println(mathUtils.factorial(n));
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
