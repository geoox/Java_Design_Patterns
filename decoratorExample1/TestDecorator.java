package decoratorExample1;

public class TestDecorator {

	public static void main(String[] args) {
		PrintareNota nota = new PrintareNota("Mesaj obisnuit");
		nota.printeaza();
		System.out.println();
		DecoratorPrintareNota decorator = new DecoratorPrintareNota(nota, "LA MULTI ANI!");
		
		decorator.printeaza();
	}

}
