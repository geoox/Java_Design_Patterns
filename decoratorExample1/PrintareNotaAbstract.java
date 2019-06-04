package decoratorExample1;

public abstract class PrintareNotaAbstract extends PrinteazaMesaj{
	PrintareNota nota;

	public PrintareNotaAbstract(PrintareNota nota) {
		super();
		this.nota = nota;
	}

	@Override
	public void printeaza() {
		this.nota.printeaza();
	}
	
}
