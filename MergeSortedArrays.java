import java.util.Scanner;
public class MergeSortedArrays {
    static void merge(int[] arr1,int n1,int[] arr2,int n2){
        int i=0,j=0,k=0;
        int[] arr =new int[n1+n2];
        while(i<n1&&j<n2){
            if(arr1[i]<arr2[j])
                arr[k++] = arr1[i++];
            else
                arr[k++] = arr2[j++];
            
        }
        if(i<n1){
            while(i<n1)
            arr[k++] = arr1[i++];
        }
        if(j<n2){
            while(j<n2)
            arr[k++] = arr2[j++];
        }
        System.out.println("Merged Sorted Array : ");
        for(i=0;i<n1+n2;i++)
            System.out.print(arr[i]+" ");
        
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter no. of elements in array1:");
        n1=S.nextInt();
        int[] arr1 =new int[n1];
        System.out.println("Enter elements of array1:");
        for(int i=0;i<n1;i++)
            arr1[i] =S.nextInt();
        System.out.println("Enter no. of elements in array2:");
        n2=S.nextInt();
        int[] arr2 =new int[n2];
        System.out.println("Enter elements of array2:");
        for(int i=0;i<n2;i++)
            arr2[i] =S.nextInt();
        merge(arr1,n1,arr2,n2);
    }
}
