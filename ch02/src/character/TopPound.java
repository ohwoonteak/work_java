package character;

import java.util.Scanner;

public class TopPound {
	public static void main(String[] args) {
		/*
		 * java.util.Scanner input = new java.util.Scanner(System.in);
		 * 
		 * System.out.println("���� ����ϱ�");
		 * 
		 * double i = input.nextDouble();
		 * 
		 * System.out.println(i + "kg"+ "��2.2Ib");
		 * 
		 * }
		 */
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		System.out.println("����: " + weight + "kg");

		double pound = weight * 2.2;
		System.out.println("����:" + pound + "Ib");
	}
}
