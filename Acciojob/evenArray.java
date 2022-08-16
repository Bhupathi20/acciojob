package Acciojob;

import java.util.Scanner;

public class evenArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int[][] arr = new int[n1][n2];

        for(int i = 0; i< n1; i++) {
            for(int j = 0; j < n2; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < n1; i++){  
            for(int j = 0; j < n2; j++){  
               System.out.print(arr[i][j] * 2 + " ");  
            } 
            System.out.println();
        }
    }
}
