package view;

import componentes.AbstractJanela;
import componentes.PoliticaDeFoco;
import componentes.JPasswordUpperLimitado;
import componentes.JTextFieldInteirosLimitado;
import componentes.JTextFieldNaoFocavel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.text.JTextComponent;

public class LoginView extends AbstractJanela {

    private List<JTextComponent> componentes;

    public LoginView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForm = new JPanel();
        painel = new JPanel();
        lblInformeCredenciais = new JLabel();
        lblCodigo = new JLabel();
        txtId = new JTextFieldInteirosLimitado(4);
        txtUsuario = new JTextFieldNaoFocavel(txtId);
        lblSenha = new JLabel();
        txtSenha = new JPasswordUpperLimitado(20);
        separador = new JSeparator();
        lblEnterEntrar = new JLabel();
        lblEscSair = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeL - Login do Usuário");
        setFocusTraversalPolicy(new PoliticaDeFoco(policyComponents()));
        setResizable(false);

        pnlForm.setBackground(new Color(255, 255, 255));

        painel.setBackground(new Color(255, 255, 255));
        painel.setBorder(BorderFactory.createEtchedBorder());

        lblInformeCredenciais.setText("Informe suas Credenciais");

        lblCodigo.setText("Código:");

        txtId.setName("Código"); // NOI18N

        lblSenha.setText("Senha:");

        txtSenha.setName("Senha");

        lblEnterEntrar.setText("Pressione ENTER para Entrar");

        lblEscSair.setText("ou ESC para Sair");

        GroupLayout painelLayout = new GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(painelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(separador)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(txtId, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario))
                    .addGroup(GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addGroup(painelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnterEntrar, GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEscSair, GroupLayout.Alignment.TRAILING)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblInformeCredenciais)
                            .addComponent(lblCodigo)
                            .addComponent(lblSenha)
                            .addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(painelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInformeCredenciais)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodigo)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEnterEntrar)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEscSair)
                .addContainerGap())
        );

        GroupLayout pnlFormLayout = new GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(pnlFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormLayout.setVerticalGroup(pnlFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sairUsandoEsc(componentes);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public List<JTextComponent> policyComponents() {
        componentes = new ArrayList<>();
        componentes.addAll(Arrays.asList(txtId, txtSenha));

        return componentes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel lblCodigo;
    private JLabel lblEnterEntrar;
    private JLabel lblEscSair;
    private JLabel lblInformeCredenciais;
    private JLabel lblSenha;
    private JPanel painel;
    private JPanel pnlForm;
    private JSeparator separador;
    private JTextField txtId;
    private JPasswordField txtSenha;
    private JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

}
