import java.util.Scanner;
public class Main {

    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter n value: ");
        n=scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements value: ");
        for(int i=0;i<n;i++) 
            arr[i] = scanner.nextInt();
        print5thElement(arr);
        int num1,num2;
        System.out.println("Enter num1 and num2:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        divide(num1,num2);
    }
    static void print5thElement(int[] arr){
        System.out.println(arr[4]);
    }
    static void divide(int num1,int num2){
        System.out.println(num1/num2);
    }
}
