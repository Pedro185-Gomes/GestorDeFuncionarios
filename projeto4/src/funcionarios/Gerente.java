package funcionarios;

public class Gerente  extends Pessoa{
	
	private String setorResoponsavel;	
		
		// TODO Auto-generated constructor 

	public Gerente(String nome, String cargo, int cpf, int salario, String id, String setorResoponsavel) {
		super(nome, cargo, cpf, salario, id);
		this.setorResoponsavel = setorResoponsavel;
	}

	@Override
	public String toString() {
		return "Gerente: " + "nome: " + this.getNome() + " | salario: " + this.getSalario() + " | id: " +this.getId() + " | setor-responsavel: " + setorResoponsavel;
	}

	public String getSetorResoponsavel() {
		return setorResoponsavel;
	}

	public void setSetorResoponsavel(String setorResoponsavel) {
		this.setorResoponsavel = setorResoponsavel;
	}
	
	

}
	