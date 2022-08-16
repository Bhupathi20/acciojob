package Acciojob;

import java.util.Scanner;

public class FindTheKey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int key = in.nextInt();

        int [][] arr = new int[n1][n2];

        int count = 0;

        for(int i = 0; i< n1; i++) {
            for(int j = 0; j < n2; j++) {
                arr[i][j] = in.nextInt();
                if(i == j && arr[i][j] == key){    
                    count ++;        
                }    
                if(i != j && arr[i][j] == key){    
                    count++;  
                } 
                
            }

        }
          if(count > 0) {
            System.out.println(count);
          }
          else{
            System.out.println(-1);
          }
    
    }
    
}
