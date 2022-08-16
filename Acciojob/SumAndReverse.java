package Acciojob;

import java.util.Scanner;

public class SumAndReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("the sum is " + sum);

        int reversedNum = 0;
        while (sum > 0) {
            int remainder = sum % 10;
             reversedNum = reversedNum * 10 + remainder;
            sum /= 10;
        }

        System.out.println("the reverse of sum is " + reversedNum);


    }
}
