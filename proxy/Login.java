package proxy;

public class Login implements ILogin{
	
	String connectionURL;
	
	

	public Login(String connectionURL) {
		super();
		this.connectionURL = connectionURL;
	}


	@Override
	public boolean authenticate(String user, String pass) {
		System.out.println("Connecting via " + this.connectionURL);
		if(user.equals("admin") && pass.equals("admin")) {
			return true;
		}
		return false;
	}

}
