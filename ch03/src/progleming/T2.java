package progleming;

import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Ǽ��� �Է��ϼ��� >>");
		
		//����� ����ȯ
		int a = (int)input.nextDouble();
		int b = (int)input.nextDouble();
		
		
		//������ ����ȯ
		/*
		 * a��b�� ���� int ���̰�
		 * double sum ������ ������� �� �ڵ����� double ������ ����ȴ�.
		 * 
		 * double sum�� int�� 2�� ������ ������ ����� double���̰�
		 * ���������� double avg ������ ���� �־��� ������ �ڵ����� double������ �ٲ��.
		 */
		double sum = a + b;	
		double avg = sum / 2;

		System.out.printf("��: %.2f, ���: %.2f %n",sum,avg);
		
	}
}
