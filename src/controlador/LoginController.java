package controlador;

import DAO.UsuarioDAO;
import componentes.FocoPoliticavel;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import modelo.Usuario;
import util.MensagensUtil;
import validadores.CamposOperations;
import view.LoginView;
import view.PesquisaUsuarioView;

public class LoginController implements FocoPoliticavel {

    private final LoginView loginView;
    private final JTextField txtId;
    private final JTextField txtUsuario;
    private final JPasswordField txtSenha;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.txtId = loginView.getTxtId();
        this.txtUsuario = loginView.getTxtUsuario();
        this.txtSenha = loginView.getTxtSenha();

        registraListeners();
    }

    private void registraListeners() {
        ajustaTab();

        txtId.addActionListener(e -> validaUsuario());
        txtId.addCaretListener(e -> {
            if (isEmptyField(txtId) && e.getDot() == 0) {
                CamposOperations.limpaCampos(policyComponents());
            }
        });
    }

    private void ajustaTab() {
        txtId.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_TAB, 0), "tab");
        txtId.getActionMap().put("tab", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isEmptyField(txtId)) {
                    validaUsuario();
                } else {
                    txtSenha.requestFocusInWindow();
                }
            }
        });
    }

    private Usuario validaUsuario() {
        txtUsuario.setText(null);

        int id;
        String valorInformado = txtId.getText();

        if (valorInformado.isEmpty()) {
            PesquisaUsuarioView usuarioView = new PesquisaUsuarioView();
            
            PesquisaUsuarioController usuarioController = new PesquisaUsuarioController(usuarioView);
            usuarioView.setVisible(true);

            id = 0; // aqui ficaria o método que retorna o id obtido na Pesquisa
        } else {
            id = Integer.parseInt(valorInformado);
        }

        Usuario usuario = new UsuarioDAO().buscaPorId(id);

        if (usuario != null) {
            txtUsuario.setText(usuario.getNome());
            txtSenha.requestFocusInWindow();
        } else {
            CamposOperations.limpaCampos(policyComponents());

            if (id != 0) {
                MensagensUtil.aviso("Usuário não encontrado");
            }

            txtId.requestFocusInWindow();
        }

        return usuario;
    }

    private static boolean isEmptyField(JTextComponent txtComponent) {
        return txtComponent.getText().isEmpty();
    }

    @Override
    public List<JTextComponent> policyComponents() {
        return Arrays.asList(txtId, txtUsuario, txtSenha);
    }

}
