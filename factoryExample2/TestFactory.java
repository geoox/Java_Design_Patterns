package factoryExample2;

import java.util.ArrayList;
import java.util.List;

import factoryExample2.utils.ObiectiveTuristiceEnum;

public class TestFactory {

	public static void main(String[] args) {
		
		List<IObiectiveTuristice> list = new ArrayList<>();
		
		IObiectiveTuristice obiectiv1 = 
				FactoryObiectivTuristic.getObiectiv(ObiectiveTuristiceEnum.CASA_MEMORIALA, 
						"10:00-17:00", 2000, 150);
		IObiectiveTuristice obiectiv2 = 
				FactoryObiectivTuristic.getObiectiv(ObiectiveTuristiceEnum.GRADINA, 
						"12:00-22:00", 3500, 150100);
		IObiectiveTuristice obiectiv3 = 
				FactoryObiectivTuristic.getObiectiv(ObiectiveTuristiceEnum.MUZEU, 
						"08:00-15:00", 500, 75);
		
		list.add(obiectiv1);
		list.add(obiectiv2);
		list.add(obiectiv3);
		
		for (IObiectiveTuristice obiectiv : list) {
			obiectiv.afiseazaDetalii();
		}
	}

}
