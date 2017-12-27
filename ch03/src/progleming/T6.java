package progleming;

import java.util.Scanner;

public class T6 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("숫자를입력하세요.");
	
	
	int Num = input.nextInt();
	
	System.out.printf("%d 만, %d 천, %d 백, %d 십,%d",Num,Num,Num,Num,Num);

	
}
}
