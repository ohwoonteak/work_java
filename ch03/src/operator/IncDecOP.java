package operator;

public class IncDecOP {
	public static void main(String[] args) {
		int m = 50, n = 30;
		System.out.printf("%d %d %n", m--, n++);   //���� ����ϰ� �����Ѵ� ��������ϰ� ������Ų��.
		
		System.out.printf("%d %d %n", m, n);			//���Ұ��Ǿ ��� �������Ǿ ���
		
		System.out.printf("%d %d %n", --m, ++n);	//���� ���ҽ�Ű�� ��� ���� ������Ű�� ���
		
		System.out.printf("%d %d %n", m, n);			//�ٷ����� ��� ���� ���
		
	}
}
