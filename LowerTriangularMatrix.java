import java.util.Scanner;
public class LowerTriangularMatrix {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int r,c;
        System.out.println("Enter no .of rows and columns :");
        r=S.nextInt();
        c=S.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("enter matrix1 elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=S.nextInt();
            }
        }
        System.out.println("Lower Triangle Matrix Elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i>j)
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
