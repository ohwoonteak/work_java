package progleming;

import java.util.Scanner;

/*
 * ǥ���Է����� �� �Ǽ��� �Է¹޾� �հ� ����� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �հ� ��� ��� �Ǽ��� ���
 */
public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Ǽ��� �Է��ϼ��� >>");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double sum = a + b;
		double avg = sum / 2;

		System.out.printf("��: %.2f, ���: %.2f %n",sum,avg);
		
	}
}
