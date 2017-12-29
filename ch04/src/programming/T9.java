package programming;

public class T9 {
	public static void main(String[] args) {
		int[] prime = new int[1001]; // [0]~[1000] 만들기 위해서

		// 0으로 초기화
		for (int i = 0; i < prime.length; i++) {
			prime[i] = 0;
		}
		// prime[2] 부터 prime[1000]까지 1을 대입
		for (int i = 2; i < prime.length; i++) {
			prime[i] = 1;
		}
		// 에라토스테네스의 체 알고리즘 적용
		int limit = (int) Math.sqrt(1000); // Math.sqrt() 메소드는 제곱근
		// i: i의 배수
		for (int i = 2; i <= limit; i++) {
			if (prime[i] == 1) {
				for (int j = 2 * i; j <= 1000; j++) {
					if (j % i == 0) {
						prime[j] = 0;				//2를 나눌때 0으로 나누어지면 소수가 아니다.
					}
				}

			}
		}
		int count = 0;//20개자리까지만 출력하고 엔터 다음 20개까지출력
		for(int i = 2; i <= 1000; i++) {
			if(prime[i] == 1) {
				System.out.print(i+ " ");
				count++;
			}
			if(count == 20) {
				System.out.println();
				count = 0;
			}
		}
	}
}
