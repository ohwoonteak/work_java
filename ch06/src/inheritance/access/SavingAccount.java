package inheritance.access;
/*
 * 접근제한자 (접근지정자)
 * -private	:	같은 클래스 내무에만 사용가능
 * -(default , package방식)	:	패키지 내부에서만 사용가능
 * -protected : default 접근 범위 + 상속받은 그! 클래스내부까지 사용가능
 * -public : 어디서든 접근이 가능
 */
public class SavingAccount extends Account {
	public double rates; //이자율
	
	public SavingAccount(String name, int number, double rates) {
		super(name, number);
		this.rates = rates;
	}
	
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희",234567654,0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);				//접근가능
		System.out.println(myAccount.open);				//접근가능
		System.out.println(myAccount.number);			//접근가능
		//System.out.println(myAccount.balance);		//접근불가
	}
}
