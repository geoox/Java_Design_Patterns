package factoryExample6;

public class TestFactory {

	public static void main(String[] args) {
		Supa ciuperci = FactorySupa.creareSupa("ciuperci");
		ciuperci.detalii();
		
		Supa legume = FactorySupa.creareSupa("legume");
		legume.detalii();
		
		Supa vita = FactorySupa.creareSupa("vita");
		vita.detalii();
	}

}
