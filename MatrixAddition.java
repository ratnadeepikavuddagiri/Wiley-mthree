import java.util.Scanner;
public class MatrixAddition {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n,m;
        System.out.println("Enter no .of rows and columns :");
        n=S.nextInt();
        m=S.nextInt();
        int[][] mat1 = new int[n][m];
        int[][] mat2 = new int[n][m];
        System.out.println("enter matrix1 elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat1[i][j]=S.nextInt();
            }
        }
        System.out.println("enter matrix2 elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat2[i][j]=S.nextInt();
            }
        }
        System.out.println("Addition of matrix1 and matrix2 elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat1[i][j]+mat2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
