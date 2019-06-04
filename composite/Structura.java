package composite;

import java.util.ArrayList;

public class Structura implements INod{

	ArrayList<INod> lista = new ArrayList<>();
	Departament dep;
	
	Structura(Departament dep){
		super();
		this.dep = dep;
	}
	
	@Override
	public void addElement(INod nod) {
		lista.add(nod);
	}

	@Override
	public void rmElement(INod nod) {
		lista.remove(nod);
	}

	@Override
	public INod getElement(int index) {
		return lista.get(index);
	}
	
	public void displayInfo() {
		dep.displayInfo();
		for(INod el:lista) {
			el.displayInfo();
		}
	}
	
}
