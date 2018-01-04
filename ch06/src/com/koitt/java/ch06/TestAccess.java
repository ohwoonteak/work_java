package com.koitt.java.ch06;

import inheritance.access.Account;

public class TestAccess extends Account {

	public TestAccess(String name, int number) {
		super(name, number);
	
	}

public static void main(String[] args) {
		
		Account account = new Account();
		String name = account.name;
		
	}
}
