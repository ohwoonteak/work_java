package progleming;

import java.util.Scanner;
/*
 * ������ ������ ų�α׷��� �Ҽ��� �Է¹޾� �Ŀ��� ����Ͽ� 
 * �Ҽ��� 3�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * -1�Ŀ��(pound)�� 0.453592(kg)
 */
public class T3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ų�α׷��� �Է��ϼ���.");

		double kg = input.nextDouble();
		double pound = kg * 1000000/453592;

		System.out.printf("�Ŀ��(pound): %.3f",pound);

	}
}
