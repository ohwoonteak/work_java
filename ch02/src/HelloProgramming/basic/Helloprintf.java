package HelloProgramming.basic;

public class Helloprintf {
	public static void main(String[] args) {
		
		
		/*
		 * d(Decimal) : 10진수
		 * o(Octal) : 8진수
		 * h(hexadecimal),x,:16진수
		 * $
		 */
		
		System.out.println("123456 123456 123456");
		System.out.println("----------------------");
		System.out.format("%6d %6o %6h %n", 10, 10, 10);
		System.out.format("%-6d %-6o %-6h %n", 20, 20, 20);
		System.out.format("%+6d,%6o,%6h %n", 30, 30, 30);
		System.out.format("%1$6d,%1$6o,%1$6h %n", 128);
		
		/*.2:는 두번째자리까지 표시
		 * .3:은 세번째자리까지 표시
		 * 6은 6칸을 차지 
		 */
		System.out.printf("%1$6.2f,%1$6.3f,%1$6.4f %n", 3.141592);
		
	}
}
