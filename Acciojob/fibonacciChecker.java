package Acciojob;

import java.util.Scanner;

public class fibonacciChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();

        int[] arr = new int[n1];

        for(int i = 0; i< n1; i++) {
            arr[i] = in.nextInt();
            for(int j = 0; j <= i; j++){
                arr[i] = factorial(j);
            }
            System.out.print(arr[i] + " ");
        }

        


    }
    public static int factorial(int number){  
        int i,fact=1;  

        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        return fact;   
       }  
}
