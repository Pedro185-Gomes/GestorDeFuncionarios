package observer;

import funcionarios.Gerente;
import java.util.ArrayList;
import java.util.List;

public class GerenteObserver implements Observer {
    private Gerente g;
    private List<String> notificacoes;

    public GerenteObserver(Gerente g) {
        this.g = g;
        this.notificacoes = new ArrayList<>();
    }

    @Override
    public void mensagem(String mensagem) {
        
        notificacoes.add(mensagem);

        System.out.println("Notificação recebida para " + g.getNome() + ": " + mensagem);
    }

    public void listarNotificacoes() {
        System.out.println(" Notificações do gerente " + g.getNome() + ":");
        if (notificacoes.isEmpty()) {
            System.out.println("Nenhuma notificação no momento.");
        } else {
            for (String n : notificacoes) {
                System.out.println("- " + n);
            }
        }
    }
}
