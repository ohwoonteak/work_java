package woontaek;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		// 표준 입력 받기
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int a = input.nextInt();

		int dd[][] = new int[a][a];
		for (int i = 0; i < dd.length; i++) {
			for (int j = 0; j < dd[i].length; j++) {
				if (i >= j) {
					System.out.print("*");
				}

			}
			System.out.println();

		}
	}
}
