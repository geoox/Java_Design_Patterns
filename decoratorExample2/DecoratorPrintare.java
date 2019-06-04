package decoratorExample2;

public class DecoratorPrintare extends ADecorator{
	String mesaj;
	int procentDiscount;
	
	public DecoratorPrintare(Printare p, String mesaj, int procentDiscount) {
		super(p);
		p.pret = p.pret - (p.pret*procentDiscount/100) ;
		this.mesaj = mesaj;
		this.procentDiscount = procentDiscount;
	}

	@Override
	void printare() {
		super.printare();
		System.out.println(this.mesaj);
	}
	
	
}
