package programming;

public class klj {
	public static void main(String[] args) {
		/*
		 * int unit[] = {1, 2, 3, 9, 11}; char ch[] = {'@','#','$','&'};
		 * System.out.printf("%d %d \n",unit.length,ch.length);
		 * System.out.printf("%c %c \n",ch[unit[1]], ch[unit[2]]);
		 */
		/*
		 * int i; for ( i = 1; i <= 20; i++) { if (1 % 3 != 0) continue; }
		 * System.out.printf("%d", i);
		 */
		/*
		 * int n = 10;
		 * 
		 * for( int i = 1; i <= n; i++) { int mult = 1; for (int j= 1; j<=i; j++) {
		 * System.out.printf("%d",j); String str =j ==i ? "=" : " * ";
		 * System.out.printf("%s", str); mult *=j; } System.out.printf("%d\n",mult); }
		 */
		String name1[] = { "최 경주", "김 경태", "김 비오", "배 상문" };
		String name2[] = { "타이거 우즈", "스티븐 스트리거", "이안 폴터", "캐빈 나" };
		System.arraycopy(name1, 0, name2, 0, name1.length);
		for (String name : name2)
			System.out.print(name + " ");
		System.out.println();
		for (String name : name1)
			System.out.print(name + " ");

	}
}
