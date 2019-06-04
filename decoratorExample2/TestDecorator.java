package decoratorExample2;

public class TestDecorator {

	public static void main(String[] args) {
		Printare p1 = new Printare(15);
		p1.printare();
		
		DecoratorPrintare p2 = new DecoratorPrintare(p1, "La multi ani!", 50);
		p2.printare();
	}

}
