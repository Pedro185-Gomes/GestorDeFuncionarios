package strtegy;

import java.util.List;
import java.util.Scanner;
import absfactoory.CriarProfissional;
import builder.Time;
import absfactoory.Criar;
import funcionarios.Pessoa;
import singleton.Singleton;
import funcionarios.Funcionario;
import funcionarios.Gerente;
import util.InputHandler;

public class Cadastrar implements Acoes {
	
	private final InputHandler input;
	Singleton s = Singleton.getInstance();
	

    public Cadastrar(InputHandler input) {
        this.input = input;
    }

	@Override
	 public void executar(List<Pessoa> p) {
		System.out.println("Cadastre um funcionário no sistema: ");

        String nome = input.lerTexto("Nome: ");
        String cargo = input.lerTexto("Cargo: ");
        int cpf = input.lerInt("Cpf: ");
        int salario = input.lerInt("Salário: ");
        String id = input.lerTexto("ID: ");
			
		Criar c = new CriarProfissional();
		
		if(cargo.equalsIgnoreCase("gerente")) {
			System.out.println("Qual setor este gerente ficará responsavel: ");
			 String setorResponsavel = input.lerTexto("SetorResponsavel: ");
			
			Gerente g = c.criarGerente(nome, cargo, cpf, salario, id, setorResponsavel);
			System.out.println("Gerente cadastrado com suscesso: ");
			s.addFuncionario(g);
			
		}else {
			Funcionario f = c.criarFuncionario(nome, cargo, cpf, salario, id);
			s.addFuncionario(f);
		}
		for(Pessoa t: s.getPessoa()){
			System.out.println(t);
			
		}
		}}