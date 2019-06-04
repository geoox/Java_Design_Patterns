package proxyExample;

public class TestProxy {

	public static void main(String[] args) {
		Client client1 = new Client("Matei", 22, 3000);
		Client client2 = new Client("Mioara", 44, 2000);
		Client client3 = new Client("Marcel", 70, 5500);
		
		CreditProxy credit1 = new CreditProxy();
		if(credit1.acordaCredit(client1)) {
			System.out.println("Credit acordat");
		} else {
			System.out.println("Credit respins");
		}
		
		CreditProxy credit2 = new CreditProxy();
		if(credit2.acordaCredit(client2)) {
			System.out.println("Credit acordat");
		} else {
			System.out.println("Credit respins");
		}
		
		CreditProxy credit3 = new CreditProxy();
		if(credit3.acordaCredit(client3)) {
			System.out.println("Credit acordat");
		} else {
			System.out.println("Credit respins");
		}
	}

}
