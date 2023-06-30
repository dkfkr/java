package test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.print.event.PrintJobAttributeListener;

public class Test07{
	public static void main(String[] args) {
		
		printList(createList());
	}

	private static void printList(List<Integer> scoreList) {
		
		int total = 0;
		int size = scoreList.size();
				
		for(int i = 0 ; i < size ; i++) {
			
			int score = scoreList.get(i);//가지고 나오는 것 get 추가하는것 add
			
			total += score;
			
			System.out.println(score);
			
			if(i == size - 1) {
				System.out.println(" = ");
			}else {
				System.out.println(" + ");
			}
		}
		System.out.println(total);
	}

	private static List<Integer> createList() {
		
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 1 ; i <= 10 ; i++) {
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		
		return scoreList;
	}
}
