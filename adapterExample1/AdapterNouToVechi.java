package adapterExample1;

public class AdapterNouToVechi implements ISoftVechi{

	SoftNou softNou;
	
	public AdapterNouToVechi(SoftNou softNou) {
		super();
		this.softNou = softNou;
	}

	@Override
	public void runBar() {
		this.softNou.RunBarPlusPlus();
	}

}
