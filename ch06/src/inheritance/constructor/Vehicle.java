package inheritance.constructor;

public class Vehicle {
	private String name = "차량";
	private double maxSpeed;
	private int seater;

	public Vehicle() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}

	public Vehicle(double maxSpeed, int seater) {
		this.maxSpeed = maxSpeed;
		this.seater = seater;

	}
}
