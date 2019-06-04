package prototypeExample3;

public class TestPrototype {

	public static void main(String[] args) {
		ContClient c = new ContClient("Matei", 23);
		ContClient c2 = (ContClient) c.cloneObj();
		ContClient c3 = (ContClient) c.cloneObj();
	}

}
