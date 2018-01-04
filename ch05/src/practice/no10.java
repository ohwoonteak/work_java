package practice;

public class no10 {

	public final String[] osType = {"윈도7","애플 OS X","안드로이드"};
	
	private int indexOfOs;		//osType의 인덱스 
	private int memory;			//메모리 크기
		//생성자
	public no10(int indexOfOs, int memorry) {
		this.indexOfOs = indexOfOs;
		this.memory = memorry;
	}
	public void print() {
		System.out.println("운영체제: " + osType[this.indexOfOs] + ", 메인메모리: " + this.memory);
	}

	public static void main(String[] args) {
		no10 pc = new no10(0,16);
		no10 apple = new no10(1,32);
		no10 galaxy = new no10(2,16);
		pc.print();
		apple.print();
		galaxy.print();
		
	}
	

}
