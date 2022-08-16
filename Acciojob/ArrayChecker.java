package Acciojob;

import java.util.Scanner;

public class ArrayChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int max = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
        if(max % 3 == 0) {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
