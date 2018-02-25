package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    static final String URL = "jdbc:mysql://127.0.0.1/";
    static final String USER = "root";
    static final String PASSWORD = "";
    static final String DBNAME = "del";
    static final String CONFIGS = "?useSSL=false&serverTimezone=UTC";

    private static final String DDL = "create database if not exists "
            + DBNAME + "\n"
            + "default charset utf8\n"
            + "default collate utf8_general_ci;";

    public static boolean createIfNotExists() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL + CONFIGS, USER, PASSWORD)) {
            new StructureBuilder().createIfNotExists(conn, DDL, DBNAME);
        }

        return true;
    }

}
