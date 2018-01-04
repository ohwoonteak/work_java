package inheritance.control;
/*
 * 접근제한자 (접근지정자)
 * -private	:	같은 클래스 내무에만 사용가능
 * -(default , package방식)	:	패키지 내부에서만 사용가능
 * -protected : default 접근 범위 + 상속받은 그! 클래스내부까지 사용가능
 * -public : 어디서든 접근이 가능
 */
import inheritance.access.SavingAccount;

public class CheckTest {
public static void main(String[] args) {
	SavingAccount myAccount = new SavingAccount("김태희", 234567654,0.34);
	myAccount.deposit(400000);
	myAccount.withdraw(50000);
	myAccount.checkBalance();
	
	System.out.println(myAccount.name);		//접근가능
	//System.out.println(myAccount.number);	//접근불가
	//System.out.println(myAccount.balance);	//접근불가	
	//System.out.println(myAccount.open);		//접근불가
	
	CheckAccount cAccount = new CheckAccount("이민정", 87542356, 500000);
	cAccount.deposit(250000);
	cAccount.withdraw(50000);
	cAccount.checkBalance();
	
	System.out.println(cAccount.name);			//접근가능
	System.out.println(cAccount.minimum);		//접근가능
	//System.out.println(cAccount.open);		//접근불가
	//System.out.println(cAccount.number);		//접근불가
	//System.out.println(cAccount.balance);		//접근불가
}
}
