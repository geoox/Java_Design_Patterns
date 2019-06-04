package proxyExample3;

public class RealEstateProxy {
	
	Appartment appartment;
	
	public void represent(Appartment appartment) {
		System.out.println("Appartment: "+appartment.getLocation()+", "+appartment.getMonthlyRentCost());
		this.appartment = appartment;
	}
	
	public Appartment rent(Student student) {
		if(student.name.toUpperCase().charAt(0) == 'P' || student.money<appartment.MonthlyRentCost) {
			System.out.println("Appartment not rent!");
			return null;
		} else {
			System.out.println("Appartment rent");
			return this.appartment;
		}
	}
}
