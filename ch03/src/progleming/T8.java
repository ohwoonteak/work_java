package progleming;

import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		
		int res = num1 > num2 ? 
				(num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
				System.out.println("���� ū ��: "+ res);
	}
}
