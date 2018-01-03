package practice;

public class no1 {

	public String c1;
	public int no;

	public no1() {
		
	}
	public no1(String c1, int no) {
		this.c1 = c1;
		this.no = no;
	}
	public void print() {
		System.out.println(this.c1);
		System.out.println(this.no);
	}
	public static void main(String[] args) {
		no1 i = new no1();
		i.c1 = "감귤포장학과";
		i.no = 20180103;
		i.print();
		
		no1 d = new no1("감귤판매과", 20180104);
		d.print();
	}

}
