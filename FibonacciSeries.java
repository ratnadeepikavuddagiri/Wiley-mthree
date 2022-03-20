public class FibonacciSeries {

    static int nthFibonacciNumber(int n){
        
        if(n==0 || n==1) 
        return n;
        return nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2);
    }
    public static void main(String[] args) {
        int a=0,b=1;
        int n = 5;
        int t=0;
        if(n==1)
        System.out.println(a);
        else if(n==2)
        System.out.println(b);
        else{
            for(int i=0;i<n-2;i++){
                t = a+b;
                a=b;
                b=t;
            }
            System.out.println(t);
        }
        System.out.println(nthFibonacciNumber(1));

    }
}
