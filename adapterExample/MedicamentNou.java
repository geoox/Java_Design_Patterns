package adapterExample;

public class MedicamentNou implements IMedicamentNou{

	@Override
	public void cumparaMedicament() {
		System.out.println("Medicamentul a fost cumparat (Clasa MedNou)");
	}

}
