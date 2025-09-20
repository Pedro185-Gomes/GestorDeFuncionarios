package observer;

import java.util.ArrayList;
import java.util.List;
import funcionarios.Funcionario;

public class FuncionarioObserver implements Subject {
	private List<Observer> ob = new ArrayList();
	private Funcionario f;

	@Override
	public void registraObserver(Observer observer) {
		ob.add(observer);
		
	}
	
	@Override
	public void notificaObserver(Funcionario f,String mensagem) {
		for (Observer obs: ob ) {
			obs.mensagem("O funcionário: " + f.getNome() + mensagem);
		}
		
	}
	public void Alteracao(Funcionario f, String descricao) {
		System.out.println(f.getNome() + " fez uma alteração: " + descricao);
		notificaObserver(f, " Realizou uma alteração: " + descricao);
		
	}

}