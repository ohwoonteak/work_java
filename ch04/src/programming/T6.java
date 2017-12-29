package programming;

import java.util.Scanner;

public class T6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * double serbssi = 0.0; double HwassiTemperature = 0.0;
		 * 
		 * System.out.println(" 섭씨온도를 입력하세요.");
		 * 
		 * serbssi = input.nextDouble();
		 * 
		 * HwassiTemperature = (double)5/(double)9*(serbssi - 32); for(serbssi=-60;
		 * serbssi<=140; serbssi +20) System.out.println(" 섭씨온도는 " +
		 * HwassiTemperature+"입니다.");
		 */

		// 섭씨 온도가 -60부터 140까지 20씩 증가
		for (int degree = -60; degree <= 140; degree += 20) {
			double f = (9.0 / 5.0) * degree + 32;
			System.out.printf("섭씨온도:%d,화씨온도:%.2f%n", degree, f);
		}

	}
}
