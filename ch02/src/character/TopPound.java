package character;

import java.util.Scanner;

public class TopPound {
	public static void main(String[] args) {
		/*
		 * java.util.Scanner input = new java.util.Scanner(System.in);
		 * 
		 * System.out.println("단위 출력하기");
		 * 
		 * double i = input.nextDouble();
		 * 
		 * System.out.println(i + "kg"+ "은2.2Ib");
		 * 
		 * }
		 */
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		System.out.println("무게: " + weight + "kg");

		double pound = weight * 2.2;
		System.out.println("무게:" + pound + "Ib");
	}
}
