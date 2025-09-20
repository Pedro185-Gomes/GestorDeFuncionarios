package builder;

import funcionarios.Funcionario;
import funcionarios.Gerente;

public interface TimeBuilder {
	void timeFuncionarios(Funcionario funcionario);
	void timeGerente(Gerente gerente);
	Time build();

}
