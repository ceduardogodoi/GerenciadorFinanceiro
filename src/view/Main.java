package view;

import controlador.LoginController;
import db.DDLDatabase;
import java.awt.EventQueue;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import util.MensagensUtil;

public class Main {

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
            DDLDatabase.criaDatabase();
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException
                | NullPointerException | SQLException e) {

            MensagensUtil.erro(e.getClass() + e.getMessage());
            System.exit(0);
        }

        LoginView loginView = new LoginView();
        
        EventQueue.invokeLater(() -> new LoginController(loginView));
        
        loginView.setVisible(true);
    }

}
