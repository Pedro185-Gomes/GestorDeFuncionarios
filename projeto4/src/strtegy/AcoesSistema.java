package strtegy;

import java.util.List;
import util.InputHandler;
import proxy.Dados;
import funcionarios.Pessoa;
import observer.GerenteObserver;
import funcionarios.Gerente;

public class AcoesSistema implements Acoes {
	private Cadastrar c;
	private InputHandler input;
	private Dados d;
	private Gerente g;
	GerenteObserver go;
	
	public AcoesSistema(Cadastrar c,Dados d, InputHandler input, Gerente g, GerenteObserver go) {
		this.c = c;
        this.d = d;
        this.input = input;
        this.g = g;
        this.go = go;
        
	}

	@Override
	public void executar(List<Pessoa> p) {
		
		System.out.println("Bem vindo ao sistema, Faça seu login: ");
		
		String senha = input.lerTexto("Senha: ");
		String usuario = input.lerTexto("usuário: ");
		
		if(d.login(usuario, senha)) {
			 System.out.println("Acesso Autorizado, " + " Bem vindo gerente : " + g.getNome());
			 String escolha = input.lerTexto("Vc quer cadastrar um funcionário e ver as notificações? ");
			 if(escolha.equalsIgnoreCase("Cadastrar")) {
			 c.executar(p);
			
			 
		    }else if (escolha.equalsIgnoreCase("notificações")){
			go.listarNotificacoes();
		}
		
	}else {
		System.out.println("ERRO! ");
	}
}}