package operator;

public class CondOP {
	public static void main(String[] args) {
		int point = 31;
		
		String str = (point % 2 == 0) ? "짝수" : "홀수";
		
		System.out.printf("%d %s다. %n", point, str);

		double x = 3.45, y = 6.79;
		
		double max = (x > y) ? x : y;
		
		System.out.printf("%f와%f 중에서 %f 가 더 크다.", x, y, max);
	}
}
