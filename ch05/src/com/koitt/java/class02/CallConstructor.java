package com.koitt.java.class02;

public class CallConstructor {
	public static void main(String[] args) {
		parent p = new parent();
		//Child c= new Child();
		//Child c = new Child("새해 복 많이 받으세요.");
		Child c = new Child(30);
	}
	// Child랑 parent에서 호출해서 나온다
}
