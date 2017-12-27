package control.loop;

public class Dowhile {
	public static void main(String[] args) {

		int i = 1;

		do {            //조건없이 무조건 수행한다
			
			System.out.print(i++ + " ");
		}
		while (i <= 10);
		
		System.out.println();
	}
}
