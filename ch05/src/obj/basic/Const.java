package obj.basic;

//클래스에 final을 붙이면 상속을 할수가없다
public class Const {
	// 메소드에 final을 붙이면 오버라이딩을 할수없다
	public static void main(String[] args) {
		final int maxSize = 5; // final 사용시 선언과 초기화를 동시에 해야한다.
		// maxSize = 8; //오류발생
		int data[] = new int[maxSize];
		System.out.println("배열크기: " + data.length);
		System.out.println("배열크기: " + maxSize);
	}
}
