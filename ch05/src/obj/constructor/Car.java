package obj.constructor;

public class Car {
private int maxSpeed;		//최고속도
public String brandName;	//브랜드이름
public int Speed;			//현재 속도

public Car(String brandname) {
	this.brandName = brandName;
	
}
public Car(String brandName, int maxSpeed) {
	this(brandName);
	this.maxSpeed = maxSpeed;
}




}
