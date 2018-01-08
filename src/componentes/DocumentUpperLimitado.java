package componentes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class DocumentUpperLimitado extends PlainDocument {

    private final int limite;

    public DocumentUpperLimitado(int limite) {
        this.limite = limite;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str == null) return;

        if (getLength() + str.length() <= limite) {
            super.insertString(offs, str.toUpperCase(), a);
        }
    }

}
