package controlador;

import DAO.UsuarioDAO;
import componentes.FocoPoliticavel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.JTextComponent;
import modelo.Usuario;
import validadores.CamposOperations;
import view.LoginView;
import view.PesquisaUsuarioView;

public class LoginController implements FocoPoliticavel, ActionListener, CaretListener,
        FocusListener {

    // Variáveis do objeto
    private LoginView loginView;
    private JTextField txtId;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;

    // Construtor
    public LoginController(LoginView loginView) {
        inicializaVariaveis(loginView);

        registraListeners();
    }

    // Instancia e inicializa os componentes que serão manipulados
    private void inicializaVariaveis(LoginView loginView) {
        this.loginView = loginView;

        this.txtId = loginView.getTxtId();
        this.txtUsuario = loginView.getTxtUsuario();
        this.txtSenha = loginView.getTxtSenha();
    }

    // Registra os listeners nos componentes
    private void registraListeners() {
        txtId.addActionListener(this);
        txtId.addFocusListener(this);
        txtId.addCaretListener(this);
        txtSenha.addActionListener(this);
    }

    // Desregistra os listeners nos componentes
    private void desregistraListeners() {
        txtId.removeActionListener(this);
        txtId.removeFocusListener(this);
        txtId.removeCaretListener(this);
        txtSenha.removeActionListener(this);
    }

    // Faz a validação do usuário informado
    private Usuario validaUsuario() {
        txtUsuario.setText(null);

        int id;
        String valorInformado = txtId.getText();

        if (valorInformado.isEmpty()) {
            PesquisaUsuarioView pesquisaUsuarioView = new PesquisaUsuarioView();
            pesquisaUsuarioView.setVisible(true);

            id = 0; // aqui ficaria o método que retorna o id obtido na Pesquisa
        } else {
            id = Integer.parseInt(valorInformado);
        }

        Usuario usuario = new UsuarioDAO().buscaPorId(id);

        if (usuario != null) {
            txtUsuario.setText(usuario.getNome());
        }

        return usuario;
    }

    private static boolean isEmptyField(JTextComponent txtComponent) {
        return txtComponent.getText().isEmpty();
    }

    // Retorna um List com os componentes dessa classe
    @Override
    public List<JTextComponent> policyComponents() {
        return Arrays.asList(txtId, txtUsuario, txtSenha);
    }

    // Eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == txtId) {
            validaUsuario();
        }
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        if (isEmptyField(txtId) && e.getDot() == 0) {
            CamposOperations.limpaCampos(policyComponents());
        }
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (!isEmptyField(txtId)) {
            validaUsuario();
        }
    }

}
