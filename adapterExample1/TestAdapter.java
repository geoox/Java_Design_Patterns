package adapterExample1;

public class TestAdapter {

	public static void main(String[] args) {
		SoftVechi sv = new SoftVechi("Barul este ok");
		SoftNou sn = new SoftNou("Barul este in regula", 10);
		
		sv.runBar();
		sn.RunBarPlusPlus();
		System.out.println("Sistem adaptat!");
		AdapterNouToVechi adapter = new AdapterNouToVechi(sn);
		adapter.runBar();
	}

}
