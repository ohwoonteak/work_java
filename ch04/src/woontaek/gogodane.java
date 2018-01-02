package woontaek;

public class gogodane {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i<=9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d \t", j ,i , i * j);
				
				count++;
				if(count == 9) {
					System.out.println();
				count = 0;
				}
			}
		}
	}
}
