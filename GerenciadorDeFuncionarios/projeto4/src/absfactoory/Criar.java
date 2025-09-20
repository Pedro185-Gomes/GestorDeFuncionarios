package absfactoory;

import funcionarios.Funcionario;

import funcionarios.Gerente;

public interface Criar {
	Funcionario criarFuncionario(String nome, String cargo,int cpf, int salario, String id);
	Gerente criarGerente(String nome, String cargo, int cpf, int salario, String id, String setorResponsavel);
		
}