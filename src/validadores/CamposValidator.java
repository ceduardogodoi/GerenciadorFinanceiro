package validadores;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.swing.text.JTextComponent;
import util.MensagensUtil;

/**
 * Classe utilitária com métodos estáticos com validações para
 * <tt>JTextComponents</tt>.
 */
public class CamposValidator {

    /**
     * Verifica se há campos vazios. Caso exista um
     * <code>JOptionPane.showMessageDialog</code> será exibido mostrando os
     * campos que estão vazios.
     *
     * @param textComponents componentes de texto que serão verificados se estão
     * vazios, <tt>isEmpty()</tt>.
     * @return <tt>true</tt> se há campos vazios na lista
     */
    public static boolean haCamposVazios(List<JTextComponent> textComponents) {
        boolean haCamposVazios = false;
        List<Integer> qtdPosicoesVazias = new ArrayList<>();
        StringBuilder msg = new StringBuilder("O(s) campo(s) a seguir"
                + " não pode(m) ser vazio(s): ");

        for (int i = 0; i < textComponents.size(); i++) {
            if (textComponents.get(i).getText().isEmpty()) {
                msg.append("\n* ").append(textComponents.get(i).getName());
                qtdPosicoesVazias.add(i);
            }
        }

        if (qtdPosicoesVazias.size() > 0) {
            haCamposVazios = true;
            textComponents.get(qtdPosicoesVazias.get(0)).requestFocusInWindow();

            MensagensUtil.erro(msg.toString());
        }

        return haCamposVazios;
    }

    /**
     * Verifica se algum dos campos estão preenchidos
     * <code>!field.getText().isEmpty()</code>.
     *
     * @param campos campos a serem verificados
     * @return true se existirem um ou mais campos preenchidos
     */
    public static boolean haCamposPreenchidos(List<JTextComponent> campos) {
        for (JTextComponent campo : campos) {
            if (!campo.getText().isEmpty()) {
                return true;
            }
        }
        
        return false;
    }

}
