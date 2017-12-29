package com.koitt.java.class01;

public class Student extends Person{
	/*	
	 * Animal과 Person의 필드값을 상속받기 때문에
	 * 중복으로 작성하지 않아도 된다.
	 * 단, Teacher는 상속받지 않았기 때문에 
	 * Teacher의 필드는 사용할 수 없다.
	 */
	
	private int studentId;	//학생증 번호
	private String major;	//전공
	private int grade;		//학년
	
	
	public String getmajor() {
		return this.major;
	}

	public void setmajor(String major) {
		this.major = major;
	}
	public int getstudentId() {
		return this.studentId;
	}

	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getgrade() {
		return this.grade;
	}

	public void setgrade(int grade) {
		this.grade = grade;
	}
}
