import java.util.Scanner;
public class OneDimensionalArrayOperations {

    static void sort(int[] scores) {
        for(int i=0;i<scores.length;i++) {
            for(int j=0;j<scores.length;j++) {
                if(scores[i]>scores[j]){
                    int t=scores[i];
                    scores[i]=scores[j];
                    scores[j]=t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] counts = new int[10];
        for(int i=0;i<10;i++)
            counts[i]=0;
        int[] scores = new int[10];
        System.out.println("Enter the scores : ");
        for(int i=0;i<10;i++){
            scores[i]=S.nextInt();
            scores[i] += 1;
        }
        sort(scores);
        System.out.println("Highest Scores : ");
        for(int i=0;i<5;i++)
        System.out.println(scores[i]);

    }

    
}
