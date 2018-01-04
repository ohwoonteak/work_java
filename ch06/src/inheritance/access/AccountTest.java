package inheritance.access;
/*
 * 접근제한자 (접근지정자)
 * -private	:	같은 클래스 내무에만 사용가능
 * -(default , package방식)	:	패키지 내부에서만 사용가능
 * -protected : default 접근 범위 + 상속받은 그! 클래스내부까지 사용가능
 * -public : 어디서든 접근이 가능
 */
public class AccountTest {
	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("강민경", 1234567834, 0.32);
		myAccount.deposit(5000);
		myAccount.withdraw(4000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);		//접근가능
		System.out.println(myAccount.open);		//접근가능
		System.out.println(myAccount.number);	//접근가능
		//System.out.println(myAccount.Balance); //접근불가
	}

}
