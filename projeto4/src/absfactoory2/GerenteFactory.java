package absfactoory2;

import funcionarios.Gerente;

public class GerenteFactory implements Gerentes {

	@Override
	public Gerente gerentePedro() {
		// TODO Auto-generated method stub
		return new Gerente("Pedro,", "Gerente- Back-end", 3938, 10000, "78220", "java");
	}

}
