package proxyExample5;

public class TestProxy {

	public static void main(String[] args) {
		Rezervare rezervare = new Rezervare(2, "Matei");
		rezervare.mergeLaRestaurant();
		
		ProxySistemRezervare proxy = new ProxySistemRezervare(rezervare);
		proxy.rezervare();
	}

}
