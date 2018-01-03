package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {
	public static void main(String[] args) {
		//자동차 한대를 생성
		Car Spo = new Car("스포티지",300);
		
		Car aban = new Car("아반떼",200);
		
		Owner dongdong = new Owner("오동동", 25, aban);
		dongdong.introCar();
		
		
		Owner gildong = new Owner("박길동", 27,Spo);
		
		gildong.introCar();
	}
}
