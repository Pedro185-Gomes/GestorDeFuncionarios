package main;

import absfactoory2.FuncionarioFactory;
import absfactoory2.GerenteFactory;
import funcionarios.Gerente;
import observer.FuncionarioObserver;
import observer.GerenteObserver;
import proxy.Dados;
import strtegy.AcoesSistema;
import strtegy.Cadastrar;
import util.InputHandler;

public class Main {

	public static void main(String[] args) {
		InputHandler input = new InputHandler();
        Dados dados = new Dados();
        GerenteFactory gf = new GerenteFactory();
        FuncionarioFactory f = new FuncionarioFactory();
        FuncionarioObserver f1 = new FuncionarioObserver();
        Gerente g = gf.gerentePedro();
        GerenteObserver go = new GerenteObserver(g);
        
        f1.registraObserver(go);
        
        f1.Alteracao(f.Funcionario1(),"implementou o login");
        
        Cadastrar c = new Cadastrar(input);
        AcoesSistema a = new AcoesSistema(c, dados, input, g, go);
        a.executar(null);

		
	
	}

}
