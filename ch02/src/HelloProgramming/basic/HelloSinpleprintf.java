package HelloProgramming.basic;

public class HelloSinpleprintf {
	public static void main(String[] args) {
		byte age = 26;
		int weight = 70;
		double height = 175.8;
		/*
		 * %d: 10진수
		 * %f: float 값
		 * %s: String 값
		 * %c: char 값
		 *escpae sequence*/
		 
		
		System.out.printf("나이: %d, 몸무게: %d, 키: %f, ", age, weight, height);
		System.out.printf("%s: %c 형", "혈액형", '0');
	}
}
