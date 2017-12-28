package array.basic;

public class UsingArray {
	public static void main(String[] args) {
		String name[] = {"C++", "Java", "C#"};
		for ( String str : name)
			System.out.print(str + " ");
		
		System.out.println();
		
		String data[][] = {{"홍","길동"},{"최","경","주"},{"Tiger","woods"}};
		
		for (String ary[] : data) {
			for(String value :ary)
				System.out.println(value + " ");
			System.out.println();
		}
	}
}
