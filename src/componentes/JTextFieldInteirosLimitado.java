package componentes;

import javax.swing.JTextField;

/**
 * Um <tt>JTextField</tt> tratado para aceitar somente números e com um limite
 * de caracteres.
 */
public class JTextFieldInteirosLimitado extends JTextField {

    /**
     * Um <tt>JTextField</tt> tratado para aceitar somente números e um limite
     * de caracteres.
     *
     * @param limite máximo de caracteres aceitáveis
     */
    public JTextFieldInteirosLimitado(int limite) {
        configuraDocument(limite);
    }

    private void configuraDocument(int limite) {
        setDocument(new DocumentInteirosLimitado(limite));
    }

}
