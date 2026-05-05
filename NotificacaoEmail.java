public class NotificacaoEmail implements Notificavel {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }

    @Override
    public String getTipo() {
        return "Email";
    }
    }
