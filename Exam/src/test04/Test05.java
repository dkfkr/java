package test04;



public class Test05{
	public static void main(String[] args) {
		// 문자열 -> 숫자 변환 후 계산
		String strCsv = "60,72,82,86,92";
		String[] scores = strCsv.split(",");
		
		int total = 0;
		
		for(int i = 0 ; i < scores.length ; i++) {
			
			total += Integer.parseInt(scores[i]);
			
		}
		
		System.out.println("총점 : " + total);
	}
	
	
}

