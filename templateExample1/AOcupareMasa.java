package templateExample1;

public abstract class AOcupareMasa {
	public abstract void curatareMasa();
	public abstract void asezareServetele();
	public abstract void asezareTacamuri();
	public abstract void invitarePersoane();
	
	public final void templateFunction() {
		this.curatareMasa();
		this.asezareServetele();
		this.asezareTacamuri();
		this.invitarePersoane();
	}
}
