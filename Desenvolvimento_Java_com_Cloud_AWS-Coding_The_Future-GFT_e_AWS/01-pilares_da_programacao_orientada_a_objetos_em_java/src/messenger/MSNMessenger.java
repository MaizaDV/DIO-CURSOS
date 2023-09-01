package messenger;

/**
 * MSNMessenger herda métodos da classe ServicoMensagemInstantanea.
 */
public class MSNMessenger extends ServicoMensagemInstantanea {

  public void enviarMensagem() {
    System.out.println("Enviando mensagem pelo MSN Messenger");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Messenger");
  }
}
