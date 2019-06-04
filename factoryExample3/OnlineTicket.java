package factoryExample3;

public class OnlineTicket implements ITicket{
	
	private String date;
	private int price;
	
	public OnlineTicket(String date, int price) {
		super();
		this.date = date;
		this.price = price;
	}


	@Override
	public void displayInfo() {
		System.out.println("Date: " +this.date+ "Price: "+this.price);
	}

}
