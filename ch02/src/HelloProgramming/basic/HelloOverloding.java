package HelloProgramming.basic;

public class HelloOverloding {

	public static void main(String[] args) {
		/*�޼ҵ� �����ε�(method Overloading) ȣ������
		 *1. Argument(Parameter)�� ����
		 * 2. Argument�� Ÿ���� ��ġ�� ���
		 */
		int sum = plus(10, 20);
		System.out.println(sum);

		double sum01 = plus(10, 20);
		System.out.println(sum01);

	}

	static int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	static double plus(double a, double b) {
		double result = a + b;
		return result;

	}

}
