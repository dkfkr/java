package step2;

import java.util.Scanner;

public class Test07 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("주사위1의 수를 입력하세요");
        int dice1 = sc.nextInt();
        
        System.out.println("주사위2의 수를 입력하세요");
        int dice2 = sc.nextInt();
        
        System.out.println("주사위3의 수를 입력하세요");
        int dice3 = sc.nextInt();
        
        int max = dice1;
        if(dice2 > max) {
        	max = dice2; 
        }
        if(dice3 > max) {
        	max = dice3; 
        }
        	
        if(dice1 == dice2 && dice2 == dice3) {
        	int result1 = 10000 + dice1 * 1000;
            System.out.println(result1);        	
        }else if(dice1 == dice2 && dice1 != dice3) {
        	int result2 = 1000 + dice1 * 100;
        	System.out.println(result2);        
        }else if(dice1 != dice2 && dice1 != dice3) {
        	  	if(dice2 != dice3) {
        	     int result3 = max * 100;
        	     System.out.println(result3);
        	     }        
        }
        
        sc.close();
           
    }
}
