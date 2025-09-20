package observer;

import java.util.ArrayList;
import java.util.List;

import funcionarios.Funcionario;

public interface Subject {
	void registraObserver(Observer observer);
	void notificaObserver(Funcionario f,String mensagem);

}
