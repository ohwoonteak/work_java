package character;

import java.util.Scanner;

public class PersonInfo {
	/*
	 * static int a tatic double age
	 * 
	 * public static void main(String[] args) { java.util.Scanner input = new
	 * java.util.Scanner(System.in); System.out.println("�����Կ� Ű�� ����ϱ�");
	 * 
	 * String age = input.next(); int a = input.nextInt(); System.out.println("������:"
	 * + a + "Ű:" + age);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		System.out.println("�����Կ� Ű�� �Է��ϼ���.");

		// Ű���� �Է��� ���� �غ� ��
		Scanner x = new Scanner(System.in);

		int weight = x.nextInt();
		double height = x.nextDouble();
		System.out.printf("������: %dkg, Ű:%fcm", weight, height);
		x.close();
	}
}
