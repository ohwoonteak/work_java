package HelloProgramming.basic;

public class HelloSinpleprintf {
	public static void main(String[] args) {
		byte age = 26;
		int weight = 70;
		double height = 175.8;
		/*
		 * %d: 10����
		 * %f: float ��
		 * %s: String ��
		 * %c: char ��
		 *escpae sequence*/
		 
		
		System.out.printf("����: %d, ������: %d, Ű: %f, ", age, weight, height);
		System.out.printf("%s: %c ��", "������", '0');
	}
}
