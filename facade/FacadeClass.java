package facade;

public class FacadeClass {
	public static void internare() {
		Pacient p = new Pacient();
		p.verificareStare();
		
		Medic m = new Medic();
		m.confirmareInternare();
		
		Salon s = new Salon();
		s.verificaDisponibilitate();
	}
}
