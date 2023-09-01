package messenger.apps;

/**
 * Telegram herda métodos da classe ServicoMensagemInstantanea.
 */
public class Telegram extends ServicoMensagemInstantanea {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo Telegram");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Telegram");
  }

  @Override
  public void salvarHistoricoMensagem() {
    // TODO Auto-generated method stub
   
  }
}
