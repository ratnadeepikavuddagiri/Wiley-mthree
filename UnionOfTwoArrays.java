import java.util.*;
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n1,n2,k=0;
        n1 = S.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++)
            arr1[i] = S.nextInt();
        n2 = S.nextInt();
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n1+n2];
        for(int i=0;i<n2;i++)
            arr2[i] = S.nextInt();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1=0,p2=0;
        while(p1<n1&&p2<n2){
            if(arr1[p1]==arr2[p2]){
                arr3[k++]=arr1[p1++];
                p2++;
            }
            
            else if(arr1[p1]<arr2[p2]){
                arr3[k++] = arr1[p1++];
            }
            else
                arr3[k++]=arr2[p2++];
        }
        if(p1<n1){
            while(p1<n1)
                arr3[k++] = arr2[p2++];
        }
        if(p2<n2){
            while(p2<n2)
                arr3[k++] =arr2[p2++];
        }
        System.out.println("Union of arrays:");
        System.out.println(k);
    }
}
