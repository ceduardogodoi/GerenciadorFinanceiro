package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import util.MensagensUtil;

public class DDLDatabase {

    private static final String URL = "jdbc:mysql://127.0.0.1/";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DEL = "del";
    private static final String CONFIGS = "?useSSL=false&serverTimezone=UTC";

    private static final String CREATE_DATABASE = "create database if not exists "
            + DEL + "\n"
            + "default charset utf8\n"
            + "default collate utf8_general_ci;";

    public static boolean criaDatabase() {
        try (Connection conn = DriverManager.getConnection(URL + CONFIGS, USER, PASSWORD)) {
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(CREATE_DATABASE);

                System.out.println(CREATE_DATABASE);

                return true;
            }
        } catch (SQLException e) {
            MensagensUtil.erro(e.getMessage());

            return false;
        }
    }

}
