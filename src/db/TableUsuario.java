package db;

import java.sql.Connection;
import java.sql.SQLException;

public class TableUsuario {

    private static final String TABLE_NAME = "usuario";
    private static final String ID = "id";
    private static final String LOGIN = "login";
    private static final String SENHA = "senha";
    private static final String NOME = "nome";

    private static final String DDL = "create table if not exists "+ TABLE_NAME + "\n"
            + "(\n"
            + ID + " smallint(4) unsigned not null primary key auto_increment,\n"
            + LOGIN + " varchar(10) unique not null,\n"
            + SENHA + " varchar(20) not null,\n"
            + NOME + " varchar(45) not null,\n"
            + "index idx_login(" + LOGIN + "),\n"
            + "index idx_nome(" + NOME + ")\n"
            + ");";

    public static boolean createIfNotExists() throws SQLException {
        try (Connection conn = new ConnectionPool().getConnection()) {
            new StructureBuilder().createIfNotExists(conn, DDL, TABLE_NAME);
        }
        
        return true;
    }

}
