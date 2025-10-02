package absfactoory2;

import funcionarios.Funcionario;

public class FuncionarioFactory implements Funcionarios {

	@Override
	public Funcionario Funcionario1() {
		// TODO Auto-generated method stub
		return new Funcionario("Paulo", "dev", 82992, 1000, "828292");
	}

}
