package builder;

import funcionarios.Funcionario;
import funcionarios.Gerente;

public class Time {
	private Funcionario funcionarios;
	private Gerente gerente;
	
	
	public Funcionario getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario funcionarios) {
		this.funcionarios = funcionarios;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	@Override
	public String toString() {
		return "Time:\n" +
				 "Funcionarios = " + funcionarios + "\n" +
				 		 "Gerente = " + gerente + "\n";
	}
	
}
