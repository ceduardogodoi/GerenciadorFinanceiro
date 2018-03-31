package controlador;

import DAO.UsuarioDAO;
import view.PesquisaUsuarioView;
import view.tablemodel.UsuarioTableModel;

public class PesquisaUsuarioController {

    private final PesquisaUsuarioView view;
    
    public PesquisaUsuarioController(PesquisaUsuarioView view) {
        this.view = view;
        
        listaUsuarios();
    }
    
    private void listaUsuarios() {
        view.getTblUsuarios().setModel(new UsuarioTableModel(new UsuarioDAO().buscaTodos()));
    }
    
}
