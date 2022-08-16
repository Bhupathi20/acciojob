package Acciojob;

import java.util.Scanner;

public class BinaryAndFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int binary = binaryconverter(n);
        int i,fact=1;
        for(i=1;i<=binary;i++){
            fact=fact*i;
        }
        System.out.println(fact);     
    }

    static int binaryconverter(int n) {
        int decimalNumber = 0, i = 0;
    long remainder;
    
    while (n != 0) {
      remainder = n % 10;
      n /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
    }
}
