package inheritance.overriding;
//할머니 할아버지
public class Person {
	public String name;
	public long number;

	public Person(String name, long number) {
		this.name = name;
		this.number = number;
	}

	public void printInfo() {
		System.out.println("이름: " + name + "주민번호: " + number);
	}
}
