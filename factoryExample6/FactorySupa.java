package factoryExample6;

public class FactorySupa {
	public static Supa creareSupa(String nume) {
		switch (nume.toLowerCase()) {
		case "ciuperci":
			Supa ciuperci = new SupaCiuperci();
			return ciuperci;
		case "vita":
			Supa vita = new SupaVita();
			return vita;
		case "legume":
			Supa legume = new SupaLegume();
			return legume;
		default:
			throw new UnsupportedOperationException();
		}
	}
}
