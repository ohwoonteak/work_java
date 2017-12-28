package array.basic;

public class MultiDimArray {
	public static void main(String[] args) {
		
		int mtrx[][];
		
		//int [][]mtrx; //ok
		//int []mtrx[]; //ok
		
		mtrx = new int[2][3];						//[2]는 행  [3]은 열
		
		//int mtrx[][] = new int[2][3];
		
		mtrx[0][0] = 3;
		mtrx[0][1] = 5;
		mtrx[0][2] = 0;
		mtrx[1][0] = 7;
		mtrx[1][1] = 2;
		mtrx[1][2] = 8;

		for (int i = 0; i < mtrx[i].length; i++) {
			for (int j = 0; j < mtrx[i].length; j++) {
				System.out.print(mtrx[i][j] + " ");
			}
			System.out.println();
		}
	}
}
