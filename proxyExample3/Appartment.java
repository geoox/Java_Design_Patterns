package proxyExample3;

public class Appartment{
	String location;
	int MonthlyRentCost;
	
	public Appartment(String location, int monthlyRentCost) {
		this.location = location;
		MonthlyRentCost = monthlyRentCost;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMonthlyRentCost() {
		return MonthlyRentCost;
	}

	public void setMonthlyRentCost(int monthlyRentCost) {
		MonthlyRentCost = monthlyRentCost;
	}
	
	
}
