package woontaek;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");


		int a =input.nextInt();

		int wee[][] = new int[a][a];

		for(int i = 0; i < wee.length; i++) {
			for(int j = 0; j<wee[i].length; j++) {
				if(i<=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
