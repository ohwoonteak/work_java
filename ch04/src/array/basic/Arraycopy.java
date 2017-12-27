package array.basic;

public class Arraycopy {
	public static void main(String[] args) {
		
		int[] copyFrom = { 1, 2, 3, 4, 5, 6, 7 };
		
		int[] copyTo = { 10, 20, 30, 40, 50, 60, 70, 80 };
		
		// System.arraycopy(src, srcPos, dest, destPos, length);   
		//src :  		소스(근원) 
		//srcPos : 	어디부터할꺼냐
		//dest : 		어디다가 붙여놓을꺼냐
		//destPos : 어디서부터 사용할꺼냐
		//length : 	몇개를 사용할꺼냐.
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);

		for (int i = 0; i < copyFrom.length; i++) {
			System.out.print(copyFrom[i] + " ");
		}
		
		System.out.println();
		
		// for -each문
		for (int value : copyTo) {
			System.out.print(value + " ");
		}
	}
}
