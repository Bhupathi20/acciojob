package Acciojob;

import java.util.Scanner;

public class DiagonalMatrixAndSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr= new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                // Condition for principal diagonal
                if (i == j && arr[i][j] == 1) {
                    count++;
                }
            }
        }

        int sum = 0;
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (i == j)
               sum += arr[i][j];
            }
        }
        if(count>n){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


        System.out.println(sum);
    }
}
