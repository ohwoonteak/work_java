package control.ifcondition;

public class Weatherif {
	public static void main(String[] args) {
		int degree = 30;

		if (30 <= degree) {
			System.out.println("날씨가 덥습니다.");
		}																// { 가 없으면 바로 밑에만 적용된다
		
		System.out.println("날씨 예보였습니다.");

	}
}
