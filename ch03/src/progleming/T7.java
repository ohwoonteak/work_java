package progleming;

import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ݱ��ϱ�� �Ϲݱ��ϱ��?");

		int month = input.nextInt();

		switch (month) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.printf("%d���� ��ݱ� �Դϴ�.\n", month);
			break;
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.printf("%d���� �Ϲݱ� �Դϴ�.\n", month);
			break;
		default:
			System.err.println("�߸� �Է��ϼ̽��ϴ�.\n");

		}
	}
}
