package proxyExample2;

public class RealEstateAgent {
	Appartment appartment;
	
	public RealEstateAgent() {
	}
	
	public void represent(Appartment appartment) {
		System.out.println("The appartment for sale is located in: "
	+appartment.getLocation()+", "+appartment.getMonthlyRentCost());
		
		this.appartment = appartment;
	}
	
	public Appartment rent(Student student) {
		
		if(student.getName().toUpperCase().charAt(0) == 'P') {
			return null;
		}
		System.out.println("Appartment rented");
		return appartment;
	}
}
