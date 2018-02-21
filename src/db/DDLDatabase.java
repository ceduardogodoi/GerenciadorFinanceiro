package db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    public static boolean createDatabase() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL + CONFIGS, USER, PASSWORD)) {
            DatabaseMetaData metaData = conn.getMetaData();
            ResultSet rs = metaData.getCatalogs();

            while (rs.next()) {
                if (rs.getString("TABLE_CAT").equals(DEL)) {
                    return true;
                }
            }

            try (Statement stmt = conn.createStatement()) {
                stmt.execute(CREATE_DATABASE);

                System.out.println(CREATE_DATABASE + "\n");
            }
        }

        return true;
    }

}
