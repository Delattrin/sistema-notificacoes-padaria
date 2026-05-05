public class NotificacaoWhatsapp  implements Notificavel{
@Override
    public void enviar (String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
    @Override
    public String getTipo(){
    return "WhatsApp";
    }
}
