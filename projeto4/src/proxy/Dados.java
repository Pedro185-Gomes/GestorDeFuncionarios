package proxy;

import java.util.ArrayList;
import java.util.List;

public class Dados implements Acoes {

    private List<LoginGerente> lg = new ArrayList<>();

    public Dados() {
        lg.add(new LoginGerente("123", "PedroA"));
        lg.add(new LoginGerente("046390", "PauloB"));
        
    }

    @Override
    public boolean login(String senha, String usuario) {
        return lg.stream().anyMatch(g -> g.login(usuario, senha));
    }
}
