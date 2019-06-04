package proxyExample2;

public class TestProxy {
	public static void main(String[] args) {
		Appartment appartment1 = new Appartment("Crangasi", 1000);
		Appartment appartment2 = new Appartment("Grozavesti", 4000);
		
		Student s1 = new Student("Pimothy", 2000);
		Student s2 = new Student("Margaery", 2000);
		
		RealEstateAgent estate = new RealEstateAgent();
		estate.represent(appartment1);
		estate.represent(appartment2);
		
		Appartment apForS1 = estate.rent(s1);
		Appartment apForS2 = estate.rent(s2);
		
		if(apForS1!=null) {
			System.out.println(apForS1.getLocation()+" has been rent by "+s1.getName());
		}
		if(apForS2!=null) {
			System.out.println(apForS2.getLocation()+" has been rent by "+s2.getName());
		} 
		
	}
}
