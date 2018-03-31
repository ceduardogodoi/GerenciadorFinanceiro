package view;

import componentes.AbstractDialogo;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.text.JTextComponent;

public class PesquisaUsuarioView extends AbstractDialogo {

    public PesquisaUsuarioView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGeral = new JPanel();
        pnlPesquisaUsuario = new JPanel();
        lblNome = new JLabel();
        txtNome = new JTextField();
        scrPnlTable = new JScrollPane();
        tblUsuarios = new JTable();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Usuário");
        setBackground(Color.white);
        setModal(true);
        setResizable(false);
        setSize(new Dimension(500, 500));

        pnlGeral.setBackground(new Color(255, 255, 255));

        pnlPesquisaUsuario.setBackground(Color.white);
        pnlPesquisaUsuario.setBorder(BorderFactory.createEtchedBorder());

        lblNome.setText("Nome:");

        scrPnlTable.setBackground(Color.WHITE);

        tblUsuarios.setBackground(Color.WHITE);
        tblUsuarios.setFillsViewportHeight(true);
        scrPnlTable.setViewportView(tblUsuarios);

        GroupLayout pnlPesquisaUsuarioLayout = new GroupLayout(pnlPesquisaUsuario);
        pnlPesquisaUsuario.setLayout(pnlPesquisaUsuarioLayout);
        pnlPesquisaUsuarioLayout.setHorizontalGroup(pnlPesquisaUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaUsuarioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrPnlTable, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlPesquisaUsuarioLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        pnlPesquisaUsuarioLayout.setVerticalGroup(pnlPesquisaUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaUsuarioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPnlTable)
                .addContainerGap())
        );

        GroupLayout pnlGeralLayout = new GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(pnlGeralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisaUsuario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlGeralLayout.setVerticalGroup(pnlGeralLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPesquisaUsuario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeral, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeral, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sairUsandoEsc(policyComponents());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public List<JTextComponent> policyComponents() {
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel lblNome;
    private JPanel pnlGeral;
    private JPanel pnlPesquisaUsuario;
    private JScrollPane scrPnlTable;
    private JTable tblUsuarios;
    private JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    public JTable getTblUsuarios() {
        return tblUsuarios;
    }
    
}
