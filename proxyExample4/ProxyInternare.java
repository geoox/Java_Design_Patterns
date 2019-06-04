package proxyExample4;

public class ProxyInternare {
	public static void internare(Persoana p) {
		if(p.areAsigurareMedicala) {
			Spital.internare(p);
		} else {
			System.out.println("Persoana nu are asigurare medicala => nu poate fi internata!");
		}
	}
}
