package practice;

public class no2 {

	private String c1;
	private int no;

	public no2() {
		
	}
	public no2(String c1, int no) {
		this.c1 = c1;
		this.no = no;
	}

	public String getC1() {
		return c1;
	}
	public void setC1(String c1) {
		this.c1 = c1;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void print() {
		System.out.println(getC1());
		System.out.println(getNo());
	}

	public static void main(String[] args) {
		no2 i = new no2();
		i.setC1("감귤포장학과");
		i.setNo(20180103);
		i.print();

		
	}
}
