package step06;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();//줄수
		int cnt = 0;//그룹 단어수
		
		for(int i = 0 ; i < N ; i++) {
			String S = sc.next();
			boolean check[] = new boolean[26];// 알파벳 최대 사용
			boolean tmp = true;// 그룹단어 인지
			
			for(int j = 0 ; j < S.length() ; j++) {
				int index = S.charAt(j)-'a';
				if(check[index]) {// 이전에 사용한적이 있는 문자면
					if(S.charAt(j) != S.charAt(j-1)) {//이전 문자와 연속되지 않는다면
						tmp = false;// 그룹단어가 아님
						break;
					}
				}else {//이전에 사용한 적이 없는 문자이면
					check[index] = true;//문자 사용 체크
				}
			}
			if(tmp) cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
