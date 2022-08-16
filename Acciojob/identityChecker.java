package Acciojob;

import java.util.Scanner;

public class identityChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int [][] arr = new int[n1][n2];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int row = arr.length;
        int col = arr[0].length;
        boolean flag = true;


        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) {
                if(i == j && arr[i][j] != 1){
                    flag = false;
                    
                }
                if(i != j && arr[i][j] != 0) {
                    flag = false;
                    
                }
            }
        }

        if(flag){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
