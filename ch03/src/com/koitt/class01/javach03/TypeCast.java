package com.koitt.class01.javach03;

public class TypeCast {

	public static void main(String[] args) {
		
		//1. 명시적 형변환
		byte bt = (byte) - 129;				//128은 int형인데 강제로 byte로 명시적 형변환 (byte)를 넣어서
		
		System.out.format("%d의 이진수: %s %n", -129, Integer.toBinaryString(-129));
		System.out.format("%d의 이진수: %s %n", bt,Integer.toBinaryString(bt));
		
		int n = (int) (5.0 / 4.0); 		//명시적 형변환 double  ->  int형으로
		System.out.println(n);			
		System.out.println(3 / 4);		//  int형그대로 출력
		System.out.println(3 / 4.0);	//  묵시적 형변환  int -> double 형으로 변환
		
		double d = 3 + 4*2;				//묵시적 형변환 int -> double로 (3 + 4 * 2)
		System.out.println(d);
		
	
	}
	
}
