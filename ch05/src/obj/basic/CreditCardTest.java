package obj.basic;	//같은 패키지 안에서 사용이 가능하다.



public class CreditCardTest {
	public static void main(String[] args) {
		CreditCard yourCard = new CreditCard();
		/*
		 * 다음과 같이 변수 선언과 객체 생성 대입의 분리 기능
		 * CreditCard yourCard;
		 * yourCard = new CreditCard();
		 */
		yourCard.owner = new String("이민정");
		
				System.out.println(", 카드소유자"+ " "+yourCard.owner);
		//yourCard.number = 6953_8723_8643_9836L;
		//System.out.println("카드번호: " + yourCard.number); //오류발생
		yourCard.use(150000);
		yourCard.use(100000);
		yourCard.payBill(100000);
		
		CreditCard myCard = new CreditCard();
		myCard.owner = "이민정";
		//주소값 비교
		if(yourCard.owner == myCard.owner) {
			System.out.println("둘의 주소값은 같다.");
		}
		else {
			System.out.println("둘의 주소값은 다르다.");
		}
		//문자열 비교: String의 equals()메소드 이용
		if(yourCard.owner.equals(myCard.owner)) {
			System.out.println("둘의 문자열은 같다.");
		}
		else {
			System.out.println("둘의 문자열은 다르다.");
		}
	}
}
