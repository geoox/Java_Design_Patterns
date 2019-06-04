package decoratorExample1;

public class DecoratorPrintareNota extends PrintareNotaAbstract{

	String mesajLaMultiAni;
	
	public DecoratorPrintareNota(PrintareNota nota, String mesajLaMultiAni) {
		super(nota);
		this.mesajLaMultiAni = mesajLaMultiAni;
	}

	@Override
	public void printeaza() {
		this.nota.printeaza();
		System.out.println("+ "+this.mesajLaMultiAni);
	}
	
	

}
