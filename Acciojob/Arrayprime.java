package Acciojob;

import java.util.Scanner;

public class Arrayprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int i;

        for( i = 1; i < arr[i]; i++) {
            if (isPrime(i)){
                System.out.println(arr[i]);
            }
        }



    }

    static boolean isPrime (int n){
        //  int count = 0;
    
         // 0, 1 negative numbers are not prime
         if (n < 2)
           return false;
    
         // checking the number of divisors b/w 1 and the number n-1
         for (int i = 2; i < n; i++)
           {
         if (n % i == 0)
            return false;
           }
    
         // if reached here then must be true
         return true;
       }
}
