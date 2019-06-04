package factoryExample2;

import factoryExample2.utils.ObiectiveTuristiceEnum;

public class FactoryObiectivTuristic {
	public static IObiectiveTuristice getObiectiv(ObiectiveTuristiceEnum tip,
			String program, int capacitate, int param) {
		IObiectiveTuristice obj = null;
		
		switch(tip) {
		case MUZEU:{
			obj = new Muzeu(param, program, capacitate);
			break;
		}
		case GRADINA:{
			obj = new Gradina(param, program, capacitate);
			break;
		}
		case CASA_MEMORIALA:{
			obj = new CasaMemoriala(param, program, capacitate);
			break;
		}
		}
		
		return obj;
	}
}
