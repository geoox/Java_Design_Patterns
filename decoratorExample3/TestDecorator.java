package decoratorExample3;

public class TestDecorator {
	public static void main(String[] args) {
		BiletIntrare bilet1 = new BiletIntrare(true, 100);
		BiletIntrare bilet2 = new BiletIntrare(true, 150);
		DecoratorBilet bilet3 = new DecoratorBilet(bilet2, 14);
		
		System.out.println(bilet1.getPret());
		System.out.println(bilet2.getPret());
		System.out.println(bilet3.getPret());
	}
}
