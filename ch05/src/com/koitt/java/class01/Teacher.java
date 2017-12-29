package com.koitt.java.class01;

public class Teacher extends Person {

	/*
	 * Animal과 Person의 필드값을 상속받기 때문에 중복으로 작성하지 않아도 된다.
	 */
	private String subject; // 담당과목
	private int year; // 강의경력
	private String group; // 소속

	public String getgroup() {
		return this.group;
	}

	public void setgroup(String group) {
		this.group = group;
	}

	public String getsubject() {
		return this.subject;
	}
	public void setsubject(String subject) {
		this.subject = subject;
	}
	public int getyear() {
		return this.year;
	}
	public void setyear(int year) {
		this.year = year;
	}
}