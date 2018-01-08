package validadores;

import java.util.List;
import javax.swing.text.JTextComponent;

/**
 * Classe utilitária com métodos estáticos com operações para
 * <tt>JTextComponents</tt>.
 */
public class CamposOperations {

    /**
     * Limpa os campos passados como parâmetro, aplicando <tt>null</tt>
     * em seus <tt>setText(String text)</tt>.
     *
     * @param textComponents componentes de texto que sofrerão limpeza
     */
    public static void limpaCampos(List<JTextComponent> textComponents) {
        textComponents.forEach(txtComponente -> txtComponente.setText(null));
    }

}
