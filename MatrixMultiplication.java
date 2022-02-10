import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter no .of rows and columns of matrix1 :");
        r1=S.nextInt();
        c1=S.nextInt();
        
        int[][] mat1 = new int[r1][c1];
        System.out.println("enter matrix1 elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]=S.nextInt();
            }
        }
        System.out.println("Enter no .of rows and columns of matrix2 :");
        r2=S.nextInt();
        c2=S.nextInt();
        int[][] mat2 = new int[r2][c2];
        System.out.println("enter matrix2 elements:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]=S.nextInt();
            }
        }
        if(c1!=r2)
        System.out.println("Multiplication not possible!");
        else{
            System.out.println("Addition of matrix1 and matrix2 elements:");
            for(int i=0;i<r1;i++){
                int s = 0;
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++)
                     s += mat1[i][k]*mat2[k][j];

                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }
        
    }
}

    
