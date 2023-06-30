package test04;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test08 {
	public static void main(String[] args) {
		
		for(int count = 1 ; count <= 5 ; count ++) {
			System.out.println(makeLotto());
		}
	}

	private static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		// 무한 반복 
		for(;;) {
			int num = (int) Math.ceil(Math.random() * 45);
			
			lottoSet.add(num);
					
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
	}
}