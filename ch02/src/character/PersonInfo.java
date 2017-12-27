package character;

import java.util.Scanner;

public class PersonInfo {
	/*
	 * static int a tatic double age
	 * 
	 * public static void main(String[] args) { java.util.Scanner input = new
	 * java.util.Scanner(System.in); System.out.println("몸무게와 키를 출력하기");
	 * 
	 * String age = input.next(); int a = input.nextInt(); System.out.println("몸무게:"
	 * + a + "키:" + age);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		System.out.println("몸무게와 키를 입력하세요.");

		// 키보드 입력을 받을 준비 끝
		Scanner x = new Scanner(System.in);

		int weight = x.nextInt();
		double height = x.nextDouble();
		System.out.printf("몸무게: %dkg, 키:%fcm", weight, height);
		x.close();
	}
}
