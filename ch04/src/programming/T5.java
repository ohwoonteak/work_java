package programming;

public class T5 {
	public static void main(String[] args) {
		
		double money = 1000000;
		//일년에서 10년까지
		for(int year = 1; year <= 10; year++) {
			double result= money*(1 + 0.045 *year);
		
		System.out.printf("%년: %.0f원%n",year,result);
		}
	}

}