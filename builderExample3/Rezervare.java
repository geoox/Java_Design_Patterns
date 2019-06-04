package builderExample3;

public class Rezervare {
	private String numeClient;
	private boolean asezareGeam = false;
	private boolean scaunErgonomic = false;
	private boolean decorareMasa = false;
	private boolean muzicaAmbientala = false;
	private String genMuzica = "";
	
	public Rezervare(String numeClient) {
		this.numeClient = numeClient;
	}

	private void setAsezareGeam(boolean asezareGeam) {
		this.asezareGeam = asezareGeam;
	}

	private void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}

	private void setDecorareMasa(boolean decorareMasa) {
		this.decorareMasa = decorareMasa;
	}

	private void setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
	}

	private void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	public static class rezervareBuilder{
		Rezervare r;

		public rezervareBuilder(Rezervare r) {
			super();
			this.r = r;
		}
		
		public rezervareBuilder addAsezareGeam() {
			this.r.setAsezareGeam(true);
			return this;
		}
		
		public rezervareBuilder addScaunErgonomic() {
			this.r.setScaunErgonomic(true);
			return this;
		}
		
		public rezervareBuilder addDecorareMasa() {
			this.r.setDecorareMasa(true);
			return this;
		}
		
		public rezervareBuilder addMuzicaAmbientala() {
			this.r.setMuzicaAmbientala(true);
			return this;
		}
		
		public rezervareBuilder setMuzica(String muzica) {
			this.r.setGenMuzica(muzica);
			return this;
		}
		
		public Rezervare build() {
			return this.r;
		}
	}
	
}
