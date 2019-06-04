package builderExample2;

import builderExample2.Pacient.pacientBuilder;

public class TestPacient {

	public static void main(String[] args) {
		Pacient p = new Pacient("Andrei", 56);
		System.out.println(p.toString());
		
		Pacient p2 = new Pacient("Radu", 33);
		Pacient p3 = new pacientBuilder(p2).addHalat().addMicDejun().addPapuci().build();
		System.out.println(p3.toString());
	}

}
