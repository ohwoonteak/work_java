package com.koiit.java.delive;

/*
 * 디자인 패턴 - 템플릿 메소드 패턴 (Template Method Pattern)
 */

//추상 클래스
public abstract class Process {
	
		//1. 주문받기
		public abstract void ordering();
		//2. 요리하기
		public abstract void cooking();
		//3. 배달하기
		public abstract void delivering();
		//4. 결제하기
		public abstract void payment();
		
		//순서대로 호출하는 메소드 구현
		public void processing() {
			this.ordering();
			this.cooking();
			this.delivering();
			this.payment();
		}
		
		//메인메소드
		public static void main(String[] args) {
			Process Chicken = new Chicken();
			Process Chinese = new Chinese();
			Process Pizza = new Pizza();
			Process Porkfeet = new Porkfeet();
			
			Process[] stores = new Process[4];
			stores[0] = Chicken;
			stores[1] = Chinese;
			stores[2] = Pizza;
			stores[3] = Porkfeet;
			
			for(int i = 0; i < stores.length; i++) {
				stores[i].processing();
			}
		}
	
}
