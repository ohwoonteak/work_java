package obj.basic;

public class CreditCard {
	/*
	 * 접근제한자
	 * - private : 같은 클래스 내부에만 사용가능
	 * - (default) : 같은 패키지(폴더) 내부에서만 사용가능
	 * - public : 어느 곳이든 사용 가능
	 * - protected	: default 범위 + 상속받은 클래스까지 사용가능
	 */
	private long number;	//16자리 카드번호 
	public String owner;	//카드 소유자
	private int point;		//카드 포인트
	private int balance;	//현재까지 사용액
	
	//카드 사용 메소드
	public void use(int amount) {
		this.balance += amount;
		System.out.println("현재 카드 사용액: "+ balance);
	}
	//카드 비용 지불 메소드
	public void payBill(int amount) {
		this.balance -= amount;
		System.out.println("지불액: "+amount + ",지불 잔액: "+balance);
		addPoint(amount);
	}
	//카드 포인트 추가 메소드
	private void addPoint(int amount) {
		this.point += amount/1000;
		System.out.println("보너스 포인트: " + point);
	}
	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "이수강";
		System.out.print("카드번호: " + myCard.number);
		System.out.println(", 카드소유자: " + myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		
		CreditCard yourCard = new CreditCard();
		yourCard.use(50000);
	}
}
