package componentes;

import javax.swing.JPasswordField;

/**
 * Um <tt>JPasswordField</tt> tratado com um limite de caracteres.
 */
public class JPasswordUpperLimitado extends JPasswordField {

    /**
     * Um <tt>JPasswordField</tt> tratado com um limite de caracteres.
     *
     * @param limite limite de caracteres
     */
    public JPasswordUpperLimitado(int limite) {
        setDocument(new DocumentUpperLimitado(limite));
    }

}
