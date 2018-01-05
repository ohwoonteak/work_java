package com.koiit.java.delive;

public class Chicken extends Process{
	
	@Override
	public void ordering() {
		System.out.println("치킨에서 주문을 받는다.");
	}

	@Override
	public void cooking() {
		System.out.println("치킨집에서 치킨을 튀긴다.");
		
	}

	@Override
	public void delivering() {
		System.out.println("치킨집에서 배달원이 배달을 한다.");
		
	}

	@Override
	public void payment() {
		System.out.println("치킨집 배달원이 결제를 한다.");
		
	}

}



