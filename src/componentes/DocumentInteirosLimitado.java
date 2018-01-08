package componentes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class DocumentInteirosLimitado extends PlainDocument {

    private final int limite;

    public DocumentInteirosLimitado(int limite) {
        this.limite = limite;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null) return;

        if ((getLength() + str.length()) <= limite) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return;
            }

            super.insertString(offs, str, a);
        }
    }

}
