package com.koitt.class01.javach03;

public class TypeCast {

	public static void main(String[] args) {
		
		//1. ����� ����ȯ
		byte bt = (byte) - 129;				//128�� int���ε� ������ byte�� ����� ����ȯ (byte)�� �־
		
		System.out.format("%d�� ������: %s %n", -129, Integer.toBinaryString(-129));
		System.out.format("%d�� ������: %s %n", bt,Integer.toBinaryString(bt));
		
		int n = (int) (5.0 / 4.0); 		//����� ����ȯ double  ->  int������
		System.out.println(n);			
		System.out.println(3 / 4);		//  int���״�� ���
		System.out.println(3 / 4.0);	//  ������ ����ȯ  int -> double ������ ��ȯ
		
		double d = 3 + 4*2;				//������ ����ȯ int -> double�� (3 + 4 * 2)
		System.out.println(d);
		
	
	}
	
}
