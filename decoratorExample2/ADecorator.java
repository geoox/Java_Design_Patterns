package decoratorExample2;

public class ADecorator extends APrintare{
	APrintare print;

	public ADecorator(APrintare print) {
		super();
		this.print = print;
	}

	@Override
	void printare() {
		print.printare();
	}
	
}
