package view.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Usuario;

public class UsuarioTableModel extends AbstractTableModel {

    private final int COLUNA_ID = 0;
    private final int COLUNA_LOGIN = 1;
    private final int COLUNA_NOME = 2;

    private final String[] colunas = new String[]{"Código", "Login", "Nome"};
    private final List<Usuario> usuarios;

    public UsuarioTableModel() {
        usuarios = new ArrayList<>();
    }
    
    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = this.usuarios.get(rowIndex);

        switch (columnIndex) {
            case COLUNA_ID:
                return usuario.getId();
            case COLUNA_LOGIN:
                return usuario.getLogin();
            case COLUNA_NOME:
                return usuario.getNome();
        }

        return null;
    }

}
