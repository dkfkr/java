package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i = 0 ; i < N; i++) {
            A [i] = sc.nextInt();
        }
        
        sc.close();
        Arrays.sort(A);
        System.out.print(A[0] + " " + A[N-1]);
        
    }        
}  
