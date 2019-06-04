package proxyExample;

public class CreditProxy implements ICredit{

	@Override
	public boolean acordaCredit(Client client) {
		this.salveazaDate(client);
		if(client.getVarsta() < 21 || client.getVarsta() > 60) {
			return false;
		} else if(client.getSalariu()<2500) {
			return false;
		}
		return true;
	}

	@Override
	public void salveazaDate(Client client) {
		System.out.println("Se salveaza datele urmatoare: "+
				client.getNume()+", "+ client.getVarsta()+", "+client.getSalariu());
	}

}
