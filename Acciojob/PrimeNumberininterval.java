package Acciojob;

import java.util.Scanner;

public class PrimeNumberininterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        for (int i = n1 + 1; i <= n2; i++){
            if (isPrime (i)){
                System.out.print (i + " ");
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
