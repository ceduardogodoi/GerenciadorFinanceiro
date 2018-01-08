package componentes;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ESCAPE;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.AbstractAction;
import static javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
import javax.swing.JDialog;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;

public abstract class AbstractDialogo extends JDialog implements FocoPoliticavel {

    /**
     * Sai do sistema caso não haja campos preenchidos na View.
     * <br>Em caso de algum campo preenchido, será exibido um diálogo
     * confirmando a saída
     *
     * @param fields campos a serem verificados
     */
    protected void sairUsandoEsc(List<JTextComponent> fields) {
        mapearEsc(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void mapearEsc(AbstractAction abstractAction) {
        getRootPane().getInputMap(WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(VK_ESCAPE, 0), "esc");
        getRootPane().getActionMap().put("esc", abstractAction);
    }

    /**
     * Configura a tecla ENTER para tabular entre os campos, por padrão esse
     * comportamento acontece com a tecla TAB.
     */
    public void configuraEnterFocusTraversal() {
        Set<AWTKeyStroke> focusTraversalKeys = getFocusTraversalKeys(
                KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS);

        Set<AWTKeyStroke> newForwardKeys = new HashSet<>(focusTraversalKeys);
        newForwardKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));

        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                newForwardKeys);
    }

}
