package array.basic;

public class ArrayDeclaration {
	public static void main(String[] args) {
		//배열 선언과 생성을 분리
		int[] month;
		double[] values;
			
		//배열 생성
		month = new int[4];
		values = new double[3];
		System.out.println(month.length);
		System.out.println(values.length);

		//배열 선언과 생성을 하나의 문장으로
		char[] ch = new char[6];
		float[] data = new float[5];
		data = new float[7];
		System.out.println(ch.length);
		System.out.println(data.length);
		
		//정적배열
		String[] weeks = {"월","화","수","목","금","토","일"};
		System.out.println(weeks.length);			//배열 크기 출력  결과값은 7
	}
}
