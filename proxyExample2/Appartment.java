package proxyExample2;

public class Appartment {
	private String location;
	int monthlyRentCost;
	
	public Appartment(String location, int monthlyRentCost) {
		super();
		this.location = location;
		this.monthlyRentCost = monthlyRentCost;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMonthlyRentCost() {
		return monthlyRentCost;
	}

	public void setMonthlyRentCost(int monthlyRentCost) {
		this.monthlyRentCost = monthlyRentCost;
	}
	
	
}
