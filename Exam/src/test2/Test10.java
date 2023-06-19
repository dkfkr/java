package test2;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(fibo(i)+" ");
		}
		
	}
	
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
   }
	
}
//f(0) = 0
//f(1) = 1
//f(2) = 3
//f(3) = 5
//f(4) = 8
//f(5) = 13
//f(6) = 21
//f(7) = 34
//f(8) = 55
//f(9) = 89
//f(10) =144