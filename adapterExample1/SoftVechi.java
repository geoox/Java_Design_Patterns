package adapterExample1;

public class SoftVechi implements ISoftVechi{
	
	String barInfo;

	public SoftVechi(String barInfo) {
		super();
		this.barInfo = barInfo;
	}
	
	@Override
	public void runBar() {
		System.out.println("Info bar: "+this.barInfo);
	}

}
