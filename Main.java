import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Notificavel> canais = new ArrayList<>();

        canais.add(new NotificacaoEmail());
        canais.add(new NotificacaoWhatsapp());
        canais.add(new NotificacaoSMS());


        GerenciadorNotificacoes g = new GerenciadorNotificacoes(canais);
        g.dispararTodos("Olá, Pedido confirmado!!");
    }
}