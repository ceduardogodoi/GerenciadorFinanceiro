package componentes;

import javax.swing.JTextField;

/**
 * Um <tt>JTextField</tt> tratado com um limite de caracteres.
 */
public class JTextFieldUpperLimitado extends JTextField {

    /**
     * Um <tt>JTextField</tt> tratado com um limite de caracteres.
     *
     * @param limite limite de caracteres
     */
    public JTextFieldUpperLimitado(int limite) {
        setDocument(new DocumentUpperLimitado(limite));
    }

}
