package HelloProgramming.basic;

//ctrl+ Shift +O : �ڵ����� import �߰�
import java.util.Scanner;

public class HelloOutput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������� �������� ���� �Է��ϼ���");
		int num1 = input.nextInt();
		int num2 = input.nextInt(2);
		System.out.println("num1 = " + num1 + ", num2= " + num2);
		System.out.printf("num1 = %d, num2 = %d", num1, num2);
	}
}