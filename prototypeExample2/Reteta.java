package prototypeExample2;

public class Reteta implements IReteta{
	
	String denumireMedicament;
	int cantitate1;
	int cantitate2;
	
	public Reteta() {
		
	}
	
	public Reteta(String denumireMedicament, int cantitate1, int cantitate2) {
		super();
		this.denumireMedicament = denumireMedicament;
		this.cantitate1 = cantitate1;
		this.cantitate2 = cantitate2;
	}

	@Override
	public String toString() {
		return "Reteta [denumireMedicament=" + denumireMedicament + ", cantitate1=" + cantitate1 + ", cantitate2="
				+ cantitate2 + "]";
	}



	@Override
	public Reteta cloneObj() {
		Reteta newReteta = new Reteta();
		newReteta.denumireMedicament = this.denumireMedicament;
		newReteta.cantitate1 = this.cantitate1;
		newReteta.cantitate2 = this.cantitate2;
		
		return newReteta;
	}
	

}
