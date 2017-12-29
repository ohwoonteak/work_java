package com.koitt.java.class01;

public class TestDrive {
	public static void main(String[] args) {

		// 강사 상훈 생성 - Teacher 클래스의 객체(Object)를 생성
		Teacher sanghoon = new Teacher();

		// 강사 sanghoon의 정보 입력
		sanghoon.setaddress("상도동");
		sanghoon.setage(32);
		sanghoon.setgender("남");
		sanghoon.setgroup("한국아이티인재개발학원");
		sanghoon.setName("정상훈");
		sanghoon.setssn("861201");
		sanghoon.setsubject("프로그래밍");
		sanghoon.setyear(1);

		// 학생 taehyun 생성 - Student 클래스의 객체(Object)를 생성
		Student taehyun = new Student();

		// 학생 taehyun의 정보 입력
		taehyun.setaddress("서울");
		taehyun.setage(42);
		taehyun.setgender("남");
		taehyun.setmajor("연기과");
		taehyun.setName("차태현");
		taehyun.setssn("760325");
		taehyun.setstudentId(10);
		taehyun.setgrade(4);

		// 강사 sanghoon 객체의 정보를 출력
		System.out.println("========강사 sanghoon 객체 정보 ========");
		System.out.println(sanghoon.getaddress());
		System.out.println(sanghoon.getgroup());
		System.out.println(sanghoon.getName());

		// 학생 taehyun 객체의 정보를 출력
		System.out.println("========학생 taehyun 객체 정보 ========");
		System.out.println(taehyun.getgrade());
		System.out.println(taehyun.getmajor());
		System.out.println(taehyun.getName());
		

		// 강사 sanghoon의 이름을 변경
		sanghoon.setName("홍길동");

		// 학생 taehyun의 나이를 변경
		taehyun.setage(29);
		// 강사 sanghoon 객체의 정보를 출력
		System.out.println("========강사 sanghoon 객체 정보 ========");
		System.out.println(sanghoon.getaddress());
		System.out.println(sanghoon.getgroup());
		System.out.println(sanghoon.getName());

		// 학생 taehyun 객체의 정보를 출력
		System.out.println("========학생 taehyun 객체 정보 ========");
		System.out.println(taehyun.getgrade());
		System.out.println(taehyun.getmajor());
		System.out.println(taehyun.getName());
		System.out.println(taehyun.getage());
	}
}
