package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DDLTableUsuario {

    private static final String ID = "id";
    private static final String LOGIN = "login";
    private static final String SENHA = "senha";
    private static final String NOME = "nome";

    private static final String CREATE_TABLE_USUARIO = "create table if not exists usuario\n"
            + "(\n"
            + ID + " smallint(4) unsigned not null primary key auto_increment,\n"
            + LOGIN + " varchar(10) unique not null,\n"
            + SENHA + " varchar(20) not null,\n"
            + NOME + " varchar(45) not null,\n"
            + "index idx_login(" + LOGIN + "),\n"
            + "index idx_nome(" + NOME + ")\n"
            + ");";

    public static boolean createTableUsuario() throws SQLException {
        try (Connection conn = new ConnectionPool().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(CREATE_TABLE_USUARIO);

                System.out.println(CREATE_TABLE_USUARIO + "\n");

                return true;
            }
        }
    }

}
