package operator;

public class LogicalOP {
	public static void main(String[] args) {
		
			System.out.format("%5b && %5b | %b %n", true, true, true&&true);			//논리곱
			
			System.out.format("%5b && %5b | %b %n", true, false, true&&false);		//논리곱
			
			System.out.format("%5b && %5b | %b %n", false, true, false&&true);		//논리곱
			
			System.out.format("%5b || %5b | %b %n", true, false, true||false);			//논리합
			
			System.out.format("%5b || %5b | %b %n", false, true, false||true);			//논리합
			
			System.out.format("%5b || %5b | %b %n", false, false,false||false);		//논리합
			
			System.out.format("!%5b | %b %n",true,!true);										//부정
			
			System.out.format("!%5b | %b %n",false,!false);										//부정
			}
}
