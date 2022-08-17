package Acciojob;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftArrayElementby1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int i = 0, j = arr.length - 1;
       while(i != j)
       {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
       }

       for ( i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
       }
       
    }
}
