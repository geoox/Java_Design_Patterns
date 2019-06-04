package decoratorExample;

public class DecoratorTest {

	public static void main(String[] args) {
		BiletIntrare bilet1 = new BiletIntrare(true, 20);
		DecoratorAbonament bilet2 = new DecoratorAbonament(bilet1, 14);
		
		System.out.println(bilet1.getPret());
		System.out.println(bilet2.getPret());

	}

}
