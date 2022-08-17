package Acciojob;

import java.util.Scanner;

public class frequencyOfKey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
         int N = in.nextInt();
        int K = in.nextInt();

        int cout = 0;
        int reversedNum = 0;

        while (N > 0) {
            int remainder = N % 10;
             reversedNum = reversedNum * 10 + remainder;
             if(remainder == K) {
                cout++;
             }
            N /= 10;
        }

        if(cout>0){
            System.out.println(cout);
        }else {
            System.out.println(-1);
        }

       
    }
}
