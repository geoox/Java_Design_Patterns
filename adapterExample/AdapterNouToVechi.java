package adapterExample;

public class AdapterNouToVechi implements IMedicamentNou{
	
	MedicamentVechi medicamentV;

	public AdapterNouToVechi(MedicamentVechi medicamentV) {
		super();
		this.medicamentV = medicamentV;
	}

	@Override
	public void cumparaMedicament() {
		this.medicamentV.achizitioneazaMedicament();
	}

}
