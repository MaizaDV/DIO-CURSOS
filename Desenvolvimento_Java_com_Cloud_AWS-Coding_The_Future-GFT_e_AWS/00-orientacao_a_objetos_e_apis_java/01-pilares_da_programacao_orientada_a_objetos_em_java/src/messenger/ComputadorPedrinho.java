package messenger;

import messenger.apps.FacebookMessenger;
import messenger.apps.MSNMessenger;
import messenger.apps.ServicoMensagemInstantanea;
import messenger.apps.Telegram;

/**
 * Simulação do uso da classe MSNMessenger.
 */
public class ComputadorPedrinho {
  private static ServicoMensagemInstantanea smi;

  /**
   * main.
   */
  public static void main(String[] args) {
    /**
    NÃO SE SABE QUAL APP 
    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
    */
    String appEscolhido = "msn"; 

    if (appEscolhido.equals("msn")) {
      smi = new MSNMessenger();
    } else if (appEscolhido.equals("fbm")) {
      smi = new FacebookMessenger();
    } else if (appEscolhido.equals("tlg")) {
      smi = new Telegram();
    }

    smi.enviarMensagem();
    smi.receberMensagem();
  }
}