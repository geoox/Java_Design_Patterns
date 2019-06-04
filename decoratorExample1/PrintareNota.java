package decoratorExample1;

public class PrintareNota extends PrinteazaMesaj{
	String mesaj;
	
	public PrintareNota(String mesaj) {
		super();
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	public void printeaza() {
		System.out.println(mesaj);
	}
}
