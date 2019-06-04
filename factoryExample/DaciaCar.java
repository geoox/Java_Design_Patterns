package factoryExample;

import factoryExample.utils.Models;

public class DaciaCar implements IMasina{
	private String color;
	private String number;
	
	public DaciaCar(String color, String number) {
		super();
		this.color = color;
		this.number = number;
	}

	@Override
	public void sellCar() {
		System.out.println("Dacia, "+this.color+" with the number "+ this.number+" has been rented!");
	}
	
	
}
