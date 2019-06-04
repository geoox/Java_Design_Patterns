package prototype;

public class TestPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrototypeClass barbat1 = new PrototypeClass("Matei", "Bucuresti");
		PrototypeClass barbat2 = (PrototypeClass) barbat1.cloneObj();
		
		System.out.println(barbat1.getName());
		System.out.println(barbat2.getName());
	}

}
