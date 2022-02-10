import java.util.Scanner;
public class LargestAndSmallestInArray {
    static void largestSmallest(int[] arr,int n){
        int min=arr[0],max=arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i])
                min = arr[i];
            if(max<arr[i])
                max = arr[i];
        }
        System.out.println("Largest element in array : "+max+"\n"+"Smallest element in array : "+min);
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of elements:");
        n=S.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++)
            arr[i] =S.nextInt();
        largestSmallest(arr,n);
        
    }
}
