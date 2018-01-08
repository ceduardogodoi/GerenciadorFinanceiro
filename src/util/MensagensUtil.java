package util;

import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showConfirmDialog;

/**
 * Classe de utilitário de mensagens
 * <i>JOptionPane</i>.
 */
public class MensagensUtil {

    /**
     * Exibe um <i>JOptionPane</i> de erro.
     *
     * @param mensagem a mensagem a ser exibida
     */
    public static void erro(String mensagem) {
        showMessageDialog(null, mensagem, "Erro", ERROR_MESSAGE);
    }

    /**
     * Exibe um <i>JOptionPane</i> de confirmação com opções Sim e Não.
     *
     * @param mensagem a mensagem a ser exibida
     * @return um <tt>int</tt> com a resposta escolhida
     */
    public static int confirmacao(String mensagem) {
        return showConfirmDialog(null, mensagem, "Confirmação", YES_NO_OPTION);
    }

    /**
     * Exibe um <i>JOptionPane</i> de aviso.
     *
     * @param mensagem a mensagem a ser exibida
     */
    public static void aviso(String mensagem) {
        showMessageDialog(null, mensagem, "Aviso", WARNING_MESSAGE);
    }

}
