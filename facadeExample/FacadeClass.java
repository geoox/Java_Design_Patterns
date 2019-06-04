package facadeExample;

public class FacadeClass {
	public static void verificareActiuni() {
		VerificaMasaLibera ml = new VerificaMasaLibera();
		ml.verificare();
		
		VerificaMasaDebarasata md = new VerificaMasaDebarasata();
		md.verificare();
		
		VerificaServetele s = new VerificaServetele();
		s.verificare();
	}
}
