package proxyExample4;

public class TestProxy {

	public static void main(String[] args) {
		Persoana p = new Persoana("Matei", false);
		Persoana p2 = new Persoana("Andreea", true);
		
		ProxyInternare.internare(p);
		ProxyInternare.internare(p2);
	}

}
