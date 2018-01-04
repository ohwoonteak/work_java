package com.koitt.java.class04;

import obj.constructor.Car;

public class Owner {
	private String name; // 주인이름
	private int age; // 주인나이
	private Car[] car1; // 주인이 소유한 차

	// 한번에 초기화하는 생성자 생성
	public Owner(String name, int age, Car[] car) {
		this.name = name;
		this.age = age;
		this.car1 = car;
	}

	public Car[] getCar() {
		return car1;
	}

	public void setCar(Car[] car) {
		this.car1 = car;
	}

	public void introCar() {
		for (int d = 0; d < car1.length; d++) {
		System.out.print(this.name + " " + "자동차의 브랜드는 ");
		
			System.out.print(car1[d].getBrandName() + "이고, 최고속력은 ");

			System.out.println(car1[d].getMaxSpeed() + " 입니다");
		}
		System.out.println("총 " + car1.length + "대입니다.");
	}
}
