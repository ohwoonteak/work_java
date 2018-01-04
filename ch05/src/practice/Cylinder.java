package practice;

public class Cylinder {
	
	// String text;
	Circle circle;
	double height;
	
	public double getVolume() {
		double area = circle.getArea();	// 원 넓이를 구한다.
		double volume = area * this.height;
		return volume;
	}
	
	// 방법 1: circle 필드를 setter를 이용하여 초기화
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		// 1. 원을 만든다. (Circle 클래스를 이용하여 객체를 생성한다.)
		Circle c1 = new Circle(2.8);
		
		// 2. 실린더를 만든다. (Cylinder 클래스를 이용하여 객체를 생성한다.)
		Cylinder cylinder = new Cylinder();
		cylinder.setCircle(c1);		// cylinder 객체의 circle 필드를 초기화
		cylinder.setHeight(5.6); 	// cylinder 객체의 height 필드를 초기화
		
		System.out.println(cylinder.circle + " / " + cylinder.height);
		
		// 3. 실린더의 부피를 구하는 메소드를 호출한 뒤, 리턴 값을 result 변수에 저장
		double result = cylinder.getVolume();
		System.out.println(result);
	}
}







