package operator;

public class IncDecOP {
	public static void main(String[] args) {
		int m = 50, n = 30;
		System.out.printf("%d %d %n", m--, n++);   //먼저 사용하고 감소한다 먼저사용하고 증가시킨다.
		
		System.out.printf("%d %d %n", m, n);			//감소가되어서 출력 증가가되어서 출력
		
		System.out.printf("%d %d %n", --m, ++n);	//먼저 감소시키고 사용 먼저 증가시키고 사용
		
		System.out.printf("%d %d %n", m, n);			//바로위에 결과 값을 출력
		
	}
}
