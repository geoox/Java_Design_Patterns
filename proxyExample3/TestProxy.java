package proxyExample3;

public class TestProxy {

	public static void main(String[] args) {
		Appartment ap1 = new Appartment("Crangasi", 1000);
		Student s1 = new Student("ler Georgiana", 1200);
		
		RealEstateProxy proxy = new RealEstateProxy();
		proxy.represent(ap1);
		proxy.rent(s1);
	}

}
