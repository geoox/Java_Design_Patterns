package factoryExample;

import factoryExample.utils.Models;

public class TestFactory {

	public static void main(String[] args) {
		
		IMasina car1 = FactoryDacia.getCar(Models.SUV, "green", "BV0310132");
		car1.sellCar();
		
		IMasina car2 = FactoryDacia.getCar(Models.BERLINA, "grey", "B124-1251-AAA");
		car2.sellCar();

	}

}
