package com.koitt.java.class01;

/*
 * Object클래스
 * -자바에서 모든 클래스가 기본으로 상속받는 클래스
 * -이미 기본으로 구현되어 있는 클래스
 * -extends로 선언하지 않아도 기본으로 상속받는 클래스
 * 
 * 접근제한자
 * - private
 * - public
 */
public class Animal /* extends Object */ {

	// 필드(feild)
	private String name;
	private int age;
	private String gender;

	// 메소드 (Method)
	public String getName() {
		// return sanghoon.name;
		return this.name;
		
	}
	public void setName(String name) {
		//sanghoon.name ="정상훈"; 과 같은 의미
		this.name = name;
	}
	
	public int getage() {
		return this.age;
	}
	public void setage(int age) {
		this.age = age;
	}
	
	public String getgender() {
		return this.gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	
}
