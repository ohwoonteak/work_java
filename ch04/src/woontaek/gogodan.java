package woontaek;

public class gogodan {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d \t", i, j, i * j);
		
				
				count++;
				if (count == 9) {
					System.out.println();
					count = 0;
				}
			
			}
			
		}

	}
}
