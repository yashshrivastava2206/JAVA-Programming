package practice.march05;
//Sum of Matrix Of Size 2*3
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][]Matrix1= new int[2][3];
        int [][]Matrix2= new int[2][3];
        int [][]SumMatrix= new int[2][3];
        int i,j;
        System.out.println("Enter Elements in Matrix of size 2*3 :");

        // Input part
        //Matrix 1
        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                Matrix1[i][j]=sc.nextInt();
            }
        }

        // Matrix 2
        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                Matrix2[i][j]=sc.nextInt();
            }
        }

        // Calculation
        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                SumMatrix[i][j]=Matrix1[i][j]+Matrix2[i][j];
            }
        }
        // Display Sum
        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(SumMatrix[i][j]+",");
            }
            System.out.println();
        }
    }
}
