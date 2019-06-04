package builderExample2;

public class Pacient {
	String nume;
	int varsta;
	private boolean patRabatabil = false;
	private boolean micDejun = false;
	private boolean papuci = false;
	private boolean halat = false;
	
	public Pacient(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	
	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", varsta=" + varsta + ", patRabatabil=" + patRabatabil + ", micDejun="
				+ micDejun + ", papuci=" + papuci + ", halat=" + halat + "]";
	}

	public static class pacientBuilder{
		Pacient pacient;

		public pacientBuilder(Pacient pacient) {
			super();
			this.pacient = pacient;
		}
		
		public pacientBuilder addPatRabatabil() {
			this.pacient.patRabatabil = true;
			return this;
		}
		
		public pacientBuilder addPapuci() {
			this.pacient.papuci = true;
			return this;
		}
		
		public pacientBuilder addHalat() {
			this.pacient.halat = true;
			return this;
		}
		
		public pacientBuilder addMicDejun() {
			this.pacient.micDejun = true;
			return this;
		}
		
		public Pacient build() {
			return this.pacient;
		}
	}
	
	
}
