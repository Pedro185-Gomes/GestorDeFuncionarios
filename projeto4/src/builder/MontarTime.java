package builder;

import absfactoory.CriarProfissional;
import funcionarios.Funcionario;
import funcionarios.Gerente;

public class MontarTime {
	private final TimeBuilder timeBuilder;
	private final CriarProfissional cp;
	
	public MontarTime(TimeBuilder timeBuilder, CriarProfissional cp) {
		this.cp = new CriarProfissional();
		this.timeBuilder = timeBuilder;
	}
	public Time timeFunc() {
		timeBuilder.timeFuncionarios(cp.criarFuncionario("Lucas Almeida", "Desenvolvedor", 03123400, 3000, "128739398"));
		timeBuilder.timeFuncionarios(cp.criarFuncionario("Joao Netao","Estágiario",82827272, 900, "12345"));
		timeBuilder.timeFuncionarios(cp.criarFuncionario("Paulo", "dev", 0666252, 400, "7262892"));
		return timeBuilder.build();
		
	}
	public Time timeGerente() {
		timeBuilder.timeGerente(cp.criarGerente("Pedro","gerente do back-end",253737, 10000, "8228292", "setor de deenvolvimento"));
		return timeBuilder.build() ;	
		}

}
