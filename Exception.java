import java.util.*;
public class Exception {

    public Exception(String msg) {
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        int n = divide(a,b,c);
        System.out.println("division:"+n);
        int[] arr = new int[n];
        print3rdElement(arr);
    }
    static int divide(int a,int b,int c){
        int res=0;
        try{
            res = a/b;
            try{
                res /= c;
            }catch(NullPointerException e){
                System.out.println("Null");
            }
        }catch(ArithmeticException e){
        System.out.println("Divisoris 0.Division is not possible");
        }
        return res;
    }
    static void print3rdElement(int[] arr){
        try{
            System.out.println(arr[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
}
