package operator;

public class DevideByZero {
		public static void main(String[] args) {
			short data1 = 32766;
			short data2 = 1;
			//short data3 = data1 + data2;   //���� ����� int������ ��ȯ		 
			short data3 = (short) (data1 + data2);			//����� ����ȯ int - > short
			short data4 = 32766 + 1;
			System.out.println(data3+ " " + data4);
			
			
			System.out.println(0.0 / 0.0);		//not a Number (���ڰ� �ƴϴ�) �Ǽ������� �����Ѵ�.double,flort
			System.out.println(3 / 0.0);		// ���Ѵ��� ���ڰ� ���´� (3�� double������ ��ȯ)
			System.out.println(3 / 0);			//������ 0���� ���� �� ���� ������ ���� �߻�
		
			
		
		}
}
