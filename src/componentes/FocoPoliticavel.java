package componentes;

import java.util.List;
import javax.swing.text.JTextComponent;

public interface FocoPoliticavel {

    /**
     * Retorna um <tt>List</tt> dos <tt>JTextComponents</tt> da View
     *
     * @return um <tt>List</tt> de <tt>JTextComponent</tt> da View
     */
    List<JTextComponent> policyComponents();

}
