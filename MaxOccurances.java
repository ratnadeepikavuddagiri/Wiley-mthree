public class MaxOccurances {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,6,6,7,8,8,9}; 
        int c=0,max=-1;
        for(int i=0;i<10;i++){
            c=0;
            int num=arr[i];
            int j=i;
            while(j<10){
                if(arr[j]!=num)
                    break;
                else
                    j++;
            }
            c +=(j-i);
            if(max<c)
            max=c;
        }
        System.out.println(max);
    }
}
