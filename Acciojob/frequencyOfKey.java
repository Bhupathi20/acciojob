package Acciojob;

import java.util.Scanner;

public class frequencyOfKey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }
        int K = in.nextInt();

        int cout = 0;

        for(int i = 0; i < N; i++){
            if(arr[i] == K) {
                cout++;
            }
        }

        if(cout>0){
            System.out.println(cout);
        }else {
            System.out.println(-1);
        }

    }
}
