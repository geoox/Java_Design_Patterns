package factoryExample4;

import factoryExample2.utils.ObiectiveTuristiceEnum;

public class FactoryObiective {
	public static AObiectivTuristic generareObiectiv(ObiectiveTuristiceEnum tip, String denumire, String adresa, int param) {
		AObiectivTuristic obiectiv = null;
		switch(tip) {
		case MUZEU:{
			obiectiv = new Muzeu(denumire, adresa, param);
			break;
		}
		case GRADINA:{
			obiectiv = new Gradina(denumire, adresa, param);
			break;
		}
		case CASA_MEMORIALA:{
			obiectiv = new CasaMemoriala(denumire, adresa, param);
			break;
		}
		}
		return obiectiv;
	}
}
