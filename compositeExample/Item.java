package compositeExample;

public class Item implements INod{
	String nume;

	public Item(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void addNode(INod nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void rmNode(INod nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public INod getNode(int i) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void displayInfo() {
		System.out.println("Frunza: "+this.nume);
	}

	@Override
	public void addItem(Item item) {
		throw new UnsupportedOperationException();
	}
	
}
