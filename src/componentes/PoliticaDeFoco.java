package componentes;

import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.JTextComponent;

public class PoliticaDeFoco extends FocusTraversalPolicy {

    private final List<JTextComponent> ordem;

    public PoliticaDeFoco(List<JTextComponent> ordem) {
        this.ordem = new ArrayList<>();
        this.ordem.addAll(ordem);
    }

    @Override
    public Component getComponentAfter(Container aContainer, Component aComponent) {
        int idx = (ordem.indexOf(aComponent) + 1) % ordem.size();
        return ordem.get(idx);
    }

    @Override
    public Component getComponentBefore(Container aContainer, Component aComponent) {
        int idx = ordem.indexOf(aComponent) - 1;
        if (idx < 0) {
            idx = ordem.size() - 1;
        }
        return ordem.get(idx);
    }

    @Override
    public Component getFirstComponent(Container aContainer) {
        return ordem.get(0);
    }

    @Override
    public Component getLastComponent(Container aContainer) {
        return ordem.get(ordem.size() - 1);
    }

    @Override
    public Component getDefaultComponent(Container aContainer) {
        return ordem.get(0);
    }

}
