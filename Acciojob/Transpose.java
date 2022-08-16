package Acciojob;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int rows, column;

        int[][] arr = new int[n1][n2];

        for(int i = 0; i< n1; i++) {
            for(int j = 0; j < n2; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        rows = arr.length;
        column = arr[0].length;

        int[][] t = new int[column][rows];

         //Calculates transpose of given matrix  
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < rows; j++) {
                 //Converts the row of original matrix into column of transposed matrix 
                t[i][j] = arr[j][i];
            }
        }

        // transpose of given matrix
        for(int i = 0; i < column; i++){  
            for(int j = 0; j < rows; j++){  
               System.out.print(t[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }
}
