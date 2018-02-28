package view;

import componentes.AbstractDialogo;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.text.JTextComponent;

public class PesquisaUsuarioView extends AbstractDialogo {

    public PesquisaUsuarioView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlForm = new JPanel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Usuário");
        setModal(true);
        setResizable(false);
        setSize(new Dimension(500, 500));

        pnlForm.setBackground(new Color(255, 255, 255));

        GroupLayout pnlFormLayout = new GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(pnlFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pnlFormLayout.setVerticalGroup(pnlFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnlForm, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private JPanel pnlForm;
    // End of variables declaration//GEN-END:variables

}
