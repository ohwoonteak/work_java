package HelloProgramming.basic;

public class Helloprintf {
	public static void main(String[] args) {
		
		
		/*
		 * d(Decimal) : 10����
		 * o(Octal) : 8����
		 * h(hexadecimal),x,:16����
		 * $
		 */
		
		System.out.println("123456 123456 123456");
		System.out.println("----------------------");
		System.out.format("%6d %6o %6h %n", 10, 10, 10);
		System.out.format("%-6d %-6o %-6h %n", 20, 20, 20);
		System.out.format("%+6d,%6o,%6h %n", 30, 30, 30);
		System.out.format("%1$6d,%1$6o,%1$6h %n", 128);
		
		/*.2:�� �ι�°�ڸ����� ǥ��
		 * .3:�� ����°�ڸ����� ǥ��
		 * 6�� 6ĭ�� ���� 
		 */
		System.out.printf("%1$6.2f,%1$6.3f,%1$6.4f %n", 3.141592);
		
	}
}
