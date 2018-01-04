package com.koitt.java.class04;

import obj.constructor.Car;

public class TestDrive {
	public static void main(String[] args) {
		// 자동차 한대를 생성
		Car Spo = new Car("스포티지", 300);

		Car aban = new Car("아반떼", 200);

		Car[] cars = new Car[3];
		cars[0] = new Car("모닝", 180);
		cars[1] = new Car("티코", 100);
		cars[2] = new Car("스파크", 180);

		Owner dongdong = new Owner("오동동", 25, cars);

		Car[] cars1 = new Car[3];
		cars1[0] = new Car("아우디", 250);
		cars1[1] = new Car("비엠", 280);
		cars1[2] = new Car("벤츠", 300);
		Owner gildong = new Owner("박길동", 27, cars1);

		Car[] cars2 = new Car[2];
		cars2[0] = new Car("소나타", 250);
		cars2[1] = new Car("아반떼", 280);

		Car BMW = new Car("비엠", 400);
		dongdong.introCar();

		dongdong.setCar(cars2);

		dongdong.introCar();

		gildong.setCar(cars1);

		gildong.introCar();

	}
}
