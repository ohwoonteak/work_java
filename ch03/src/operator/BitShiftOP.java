package operator;

public class BitShiftOP {
	public static void main(String[] args) {
		int x = 1, y = 3;

		System.out.format("%d(%s) >> %d ��� %d(%s) %n", x, Integer.toBinaryString(x), y, x >> 3,
				Integer.toBinaryString(x >> 3));
		System.out.format("%d(%s) << %d ��� %d(%s) %n", x, Integer.toBinaryString(x), y, x << 3,
				Integer.toBinaryString(x << 3));
		System.out.format("%d(%s) >>> %d ��� %d(%s) %n", x, Integer.toBinaryString(x), y, x >>> 3,
				Integer.toBinaryString(x >>> 3));

	}
}