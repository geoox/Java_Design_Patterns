package adapterExample;

public class TestAdapter {

	public static void main(String[] args) {
		MedicamentVechi mv = new MedicamentVechi();
		MedicamentNou mn = new MedicamentNou();
		
		mv.achizitioneazaMedicament();
		System.out.println();
		mn.cumparaMedicament();
		System.out.println();
		
		AdapterNouToVechi ad = new AdapterNouToVechi(mv);
		ad.cumparaMedicament();
	}

}
