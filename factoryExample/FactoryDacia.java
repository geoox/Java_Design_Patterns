package factoryExample;

import factoryExample.utils.Models;

public class FactoryDacia {
	public static IMasina getCar(Models model, String color, String number) {
		IMasina masina = null;
		switch(model) {
		case SUV:{
			masina = new DaciaSUV(color, number);
		}
		case BERLINA:{
			masina = new DaciaBerlina(color, number);
		}
		case BREAK:{
			masina = new DaciaBreak(color, number);
		}
		}
		return masina;
	}
}
