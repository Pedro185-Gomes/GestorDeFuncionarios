package funcionarios;

public abstract class Pessoa {
	
	private String nome;
	private String cargo;
	private int cpf;
	private int salario;
	private String id;
	
	public Pessoa(String nome,String cargo ,int cpf, int salario, String id) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.cpf = cpf;
		this.salario = salario;
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	
		public String toString() {
	       
	        return "Nome: " + nome + ", Cargo: " + cargo + "Salário" + salario;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}