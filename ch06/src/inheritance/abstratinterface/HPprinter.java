package inheritance.abstratinterface;

public class HPprinter extends Device implements Connectable {
	
	//클래스 Device의 추상 메소드 구현
	@Override
	public void print() {
		System.out.println("HP 프린트입니다.");
		
	}
	@Override
	//인터페이스 Connectable의 추상 메소드 구현
	public void connect() {
		System.out.println(Connectable.name + ", HP 프린트를 연결합니다.");
	}

}
