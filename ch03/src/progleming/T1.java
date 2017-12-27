package progleming;

import java.util.Scanner;

/*
 * 표준입력으로 두 실수를 입력받아 합과 평균을 구하여 출력하는 프로그램을 작성하시오.
 * 합과 평균 모두 실수로 출력
 */
public class T1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두 실수를 입력하세요 >>");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double sum = a + b;
		double avg = sum / 2;

		System.out.printf("합: %.2f, 평균: %.2f %n",sum,avg);
		
	}
}
