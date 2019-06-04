package flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	private static HashMap<String, Client> hashMap = new HashMap<>();
	
	public static Client getClient(String nume, String numarTelefon, String adresaMail) {
		Client c = hashMap.get(nume);
		if(c == null) {
			c = new Client(nume, numarTelefon, adresaMail);
			hashMap.put(nume, c);
		}
		return c;
	}
	
	public static int getNrClienti() {
		return hashMap.size();
	}
}
