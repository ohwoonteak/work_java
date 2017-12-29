package programming;

/*
 * Math 클래싀의 pow() 메소드 방법을 알아야 풀 수있다.
 * 사용법: math.pow(밑수,지수)
 * ex)2^3   2는 밑수고  3은 지수다.
 */
public class T4 {
	public static void main(String[] args) {
		// 5에서 10사이 0.5씩 증가하도록
		for (double x = 5.0; x < 10; x += 0.5) {
			double y = 4 * Math.pow(x, 3) + 5 * Math.pow(x, 2) + x + 2;
			System.out.printf("x=%.1f, y=%.2f%n", x, y);
			/*
			 * x가 밑수 3은 지수
			 */

		}

	}
}
