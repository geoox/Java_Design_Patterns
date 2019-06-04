package compositeExample;

public class TestComposite {

	public static void main(String[] args) {
		Structura s0 = new Structura("bauturi");
		Structura s11 = new Structura("apa");
		Structura s12 = new Structura("sucuri");
		
		Item i21 = new Item("apa plata");
		Item i22 = new Item("apa minerala");
		
		Item i23 = new Item("cola");
		Item i24 = new Item("fanta");
		
		s0.addNode(s11);
		s0.addNode(s12);
		
		s11.addItem(i21);
		s11.addItem(i22);
		
		s12.addItem(i23);
		s12.addItem(i24);
		
		s0.displayInfo();
	}

}
