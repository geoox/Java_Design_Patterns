package prototypeExample2;

public class TestPrototype {

	public static void main(String[] args) {
		Reteta r1 = new Reteta("Medicamentus 1", 140, 10);
		System.out.println(r1.toString());
		
		Reteta r2 = r1.cloneObj();
		System.out.println(r2.toString());
	}

}
