
public class Usuario {
	
	//Atributos
	private String login ;
	private int password;
	
	//Constructores
	public Usuario(String login) {
		
		this.login = login;
		this.password = (int) (Math.random() * 10);
	}
	
	public String getLogin() {
		return login;
	}

	public void setLoging(String login) {
		this.login = login;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		
		return "Usuario [login=" + login + ", password=" + password + "]";
	}

}
