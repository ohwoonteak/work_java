package com.koitt.java.class02;

//Child 클래스는 parent 클래스를 상속 받는다.
public class Child extends parent {
				//이걸로 인해서 호풀↑	
	// child 클래스의 생성자
	public Child() {
		super();		//부모의 기본생성자 호출: 작성을 안하면 컴파일러가 자동으로 추가한다.
						//그래서 parent()가 한번더 생성된다.
		System.out.println("Child() 기본생성자 호출....");
	}
	public Child(String msg) {
		super();		//부모의 기본생성자 호출: 작성을 안하면 컴파일러가 자동으로 추가한다.
		System.out.println("Child(String msg) 생성자 호출 ..."+ msg);
	}
	public Child(int num) {
		//super();			여기서는 사용이안된다 this에 들어가있기때문에 오류가난다.
		this("화이팅!");
		System.out.println("Child(int num) 생성자 호출..." + num);
	}
}
