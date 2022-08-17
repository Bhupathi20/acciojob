package Acciojob;

import java.util.Scanner;

public class printNoOfPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int [][] arr = new int[n1][n2];

        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int count = 0;

        for(int i = 0; i < n1; i++) {
            if(isPrime(i)) {
                count++;
            }
            for(int j = 0; j < n2; j++) {
                if(isPrime(j)){
                    count++;
                }
            }
        }
        System.out.println(count);


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
