package composite;

public class TestComposite {
	public static void main(String[] args) {
		Departament dep1 = new Departament("Departament 1");
		Structura s0 = new Structura(dep1);
		
		Sectie se0 = new Sectie("Sectie 0", 144);
		Sectie se1 = new Sectie("Sectie 1", 90);
		Sectie se2 = new Sectie("Sectie 2", 77);
		Sectie se3 = new Sectie("Sectie 3", 199);
		
		s0.addElement(se0);
		s0.addElement(se1);
		s0.addElement(se2);
		s0.addElement(se3);
		
		s0.displayInfo();
	}
}
