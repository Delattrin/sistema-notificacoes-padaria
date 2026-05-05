import java.util.List;

public class GerenciadorNotificacoes {
private List<Notificavel> canais;
public GerenciadorNotificacoes(List<Notificavel> canis) {
    this.canais = canis;
}
    public void dispararTodos(String mensagem) {
        // percorre a lista e chama enviar() em cada um

        for (Notificavel notificavel : canais) {
            notificavel.enviar(mensagem);
        }
    }
}
