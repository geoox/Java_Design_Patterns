package builderExample3;

public class TestBuilder {

	public static void main(String[] args) {
		Rezervare rr = new Rezervare.rezervareBuilder(new Rezervare("Matei")).addAsezareGeam().addMuzicaAmbientala().build();
		
	}

}
