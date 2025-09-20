package proxy;

public class LoginGerente {
	
	private String senha;
	private String usuario;
	
	public LoginGerente(String senha, String usuario) {
		this.senha = senha;
		this.usuario = usuario;
	}
	
	public boolean login(String senha, String usuario) {
		return this.senha.equals(senha) && this.usuario.equals(usuario);
	}

}
