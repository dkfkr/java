package ch04check;

public class Test03 {
	public static void main(String[] args) {
		
		
				
		while(true) {
			
			int dice1 = (int) Math.ceil(Math.random() * 6);
			int dice2 = (int) Math.ceil(Math.random() * 6);
			
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			
			int tot = dice1 + dice2;
			if(tot == 5) {
				
			}
		}
	}	
}

