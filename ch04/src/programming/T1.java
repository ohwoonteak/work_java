package programming;

public class T1 {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			// 2,3,5,7의 배수를 제외한 수
			if ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0))
				continue;

			System.out.print(i + " ");
			// 10개를 출력후 줄바꿈
			count++;
			if (count == 10) {
				System.out.println();
				count = 0;
			}

			/*
			 * for( int i = 1; i <=100; i++) { if (i%2 != 0 && i%3!=0 && i%5!=0 && i%7 != 0)
			 * continue;
			 * 
			 * System.out.print(i); }
			 */

		}
	}
}
