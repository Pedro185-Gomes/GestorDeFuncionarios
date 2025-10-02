package absfactoory;

import funcionarios.Funcionario;
import funcionarios.Gerente;

public class CriarProfissional implements Criar {

	@Override
	public Funcionario criarFuncionario(String nome, String cargo,int cpf, int salario, String id) {
		return new Funcionario(nome, cargo,cpf, salario, id);
	}

	@Override
	public Gerente criarGerente(String nome, String cargo, int cpf, int salario, String id, String setorResponsavel) {
		// TODO Auto-generated method stub
		return new Gerente(nome, cargo, cpf, salario,id, setorResponsavel);
	}

	

}
