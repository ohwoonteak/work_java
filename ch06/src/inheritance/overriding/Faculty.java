package inheritance.overriding;
//부모
public class Faculty extends Person {
	public String univ;
	public long number;

	public Faculty(String name, long number, String univ, long idNumber) {
		super(name, number);
		this.univ = univ;
		this.number = idNumber;
	}

	public long getNumber() {
		return super.number;		//주민번호
	}
	@Override
	public void printInfo() {
		System.out.print("이름: " + super.name + "주민번호: " + super.number);
		System.out.println(" 대학: " + univ + " 직원번호: " + number);
	}
	public void printPersonInfo() {
		super.printInfo();
	}
}
