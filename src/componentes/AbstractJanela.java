package componentes;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import java.util.List;
import javax.swing.text.JTextComponent;
import util.MensagensUtil;
import static javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
import static javax.swing.JOptionPane.YES_OPTION;
import static java.awt.event.KeyEvent.VK_ESCAPE;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import validadores.CamposValidator;

public abstract class AbstractJanela extends JFrame implements FocoPoliticavel {

    /**
     * Sai do sistema caso não haja campos preenchidos na View.
     * <br>Em caso de algum campo preenchido, será exibido um diálogo
     * confirmando a saída
     *
     * @param fields campos a serem verificados
     */
    protected void sairUsandoEsc(List<JTextComponent> fields) {
        mapeiaEsc(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CamposValidator.haCamposPreenchidos(fields)) {
                    int escolha = MensagensUtil.confirmacao("Confirma saída?");
                    if (escolha == YES_OPTION) {
                        System.exit(0);
                    }
                } else {
                    System.exit(0);
                }
            }
        });
    }

    private void mapeiaEsc(AbstractAction abstractAction) {
        getRootPane().getInputMap(WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(VK_ESCAPE, 0), "esc");
        getRootPane().getActionMap().put("esc", abstractAction);
    }

    /**
     * Configura a tecla ENTER para tabular entre os campos, por padrão esse
     * comportamento acontece com a tecla Tab.
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
