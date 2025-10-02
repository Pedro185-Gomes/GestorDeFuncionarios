package singleton;

import java.util.List;
import funcionarios.Pessoa;
import java.util.ArrayList;

public class Singleton {
	private static Singleton instance;
	List <Pessoa> p = new ArrayList();
	
	public static Singleton getInstance() {
		if (instance == null){
			instance = new Singleton();
			
		}
		return instance;
		
	}
	public void addFuncionario(Pessoa pessoa) {
		p.add(pessoa);
	}
	public void removerFuncionario(Pessoa pessoa) {
		p.remove(pessoa);
	}
	public List<Pessoa> getPessoa(){
		return p;
		
	}
}
