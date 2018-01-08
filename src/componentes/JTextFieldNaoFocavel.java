package componentes;

import static java.awt.Cursor.DEFAULT_CURSOR;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 * Um <tt>JTextField</tt> que passa o foco para outro componente quando o
 * recebe.
 */
public class JTextFieldNaoFocavel extends JTextField {

    /**
     * Um <tt>JTextField</tt> que passa o foco para outro componente
     *
     * @param textComponent o componente que receberá o foco
     */
    public JTextFieldNaoFocavel(JTextComponent textComponent) {
        configurar(textComponent);
    }

    private void configurar(JTextComponent textComponent) {
        setCursor(new Cursor(DEFAULT_CURSOR));

        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                textComponent.requestFocusInWindow();
            }
        });
    }

}
