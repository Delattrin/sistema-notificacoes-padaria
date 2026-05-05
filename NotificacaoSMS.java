public class NotificacaoSMS implements Notificavel {
    @Override
  public void enviar(String mensagem){
        System.out.println("Enviando SMS: " + mensagem);
    }
    @Override
    public String getTipo(){
        return "SMS";
    }
}
