package Acciojob;

import java.util.Scanner;

public class FindThreein2Darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int [][] arr = new int[n1][n2];

        boolean flag = false;

        for(int i = 0; i< n1; i++) {
            for(int j = 0; j < n2; j++) {
                arr[i][j] = in.nextInt();
                if(i == j && arr[i][j] == 3){    
                    flag = true;    
                    break;    
                }    
                if(i != j && arr[i][j] == 3){    
                    flag = true;    
                    break;    
                } 
                
            }

        }
          System.out.println(flag);
    
    }
}
