
public class LoopSum {

    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum +=i;
            System.out.println(sum);
        }
            
        sum=0;
        int i=1;
        while(sum<100){
            sum += i;
            i++;
        }
        System.out.println(sum+" is greater than 100 after adding "+(i-1));
    }
}
