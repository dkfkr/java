package test06;

public class Test01 {
	public static void main(String[] args) {
		int primes = 0;
		
		for (int i = 2; i < 100; i++) {
			boolean isPrime = true;
			
			for (int index = 2; index < i; index++) {
				if (i % index == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				primes++;
				System.out.printf("%5d%s", i, primes % 10 == 0 ? "\n" : "");
			}
		}
		
		System.out.printf("\n2부터 100사이의 소수의 개수: %d개", primes);
	}
}
