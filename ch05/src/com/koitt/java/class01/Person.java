package com.koitt.java.class01;

public class Person extends Animal{
	/*부모인 Animal의 필드를 상복받기 때문에
	중복으로 작성하지 않아도 된다*/
	
	private String ssn;	//주민등록번호
	private String address;	//주소
	
	
	
	
	
	public String getssn() {
		return this.ssn;
	}
	public void setssn(String ssn) {
		this.ssn = ssn;
	}
	public String getaddress() {
		return this.address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
}
