package builder;

import funcionarios.Funcionario;
import funcionarios.Gerente;

public class TimeConcrete implements TimeBuilder {
	Time time;
	
	public TimeConcrete(Time time) {
		super();
		this.time = time;
	}

	@Override
	public void timeFuncionarios(Funcionario funcionario) {
		time.setFuncionarios(funcionario);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void timeGerente(Gerente gerente) {
		// TODO Auto-generated method stub
		time.setGerente(gerente);
	}
	public Time build() {
		return this.time;
	}

}



