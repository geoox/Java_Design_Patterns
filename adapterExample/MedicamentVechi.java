package adapterExample;

public class MedicamentVechi implements IMedicamentVechi{

	@Override
	public void achizitioneazaMedicament() {
		this.prezintaReteta();
		System.out.println("Medicamentul a fost cumparat (Clasa MedVechi)");
	}

	@Override
	public void prezintaReteta() {
		System.out.println("Se verifica reteta...");
	}

}
