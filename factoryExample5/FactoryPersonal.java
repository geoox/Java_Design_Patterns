package factoryExample5;

public class FactoryPersonal {
	public static PersonalSpital createPersonal(EnumPersonalSpital tip, String nume, int varsta) {
		PersonalSpital personal = null;
		
		switch (tip) {
		case BRANCARDIER:
			personal = new Brancardier(nume, varsta);
			break;
		case MEDIC:
			personal = new Medic(nume, varsta);
			break;
		case ASISTENT:
			personal = new Asistent(nume, varsta);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return personal;
		
	}
}
