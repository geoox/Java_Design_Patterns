package compositeExample;

import java.util.ArrayList;

public class Structura implements INod{
	ArrayList<INod> list = new ArrayList<>();
	String numeCategorie;

	public Structura(String numeCategorie) {
		super();
		this.numeCategorie = numeCategorie;
	}

	@Override
	public void addNode(INod nod) {
		this.list.add(nod);
	}

	@Override
	public void rmNode(INod nod) {
		this.list.add(nod);
	}

	@Override
	public INod getNode(int i) {
		return this.list.get(i);
	}

	@Override
	public void displayInfo() {
		System.out.println("NIVEL ----");
		System.out.println("Sectiune: "+this.numeCategorie);
		for(INod nod:list) {
			nod.displayInfo();
		}
	}

	@Override
	public void addItem(Item item) {
		this.list.add(item);
	}
	
	
	
}
