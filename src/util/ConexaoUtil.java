package util;

import db.ConnectionPool;
import java.sql.SQLException;

/**
 * Classe de utilitários de Conexão com o Banco de Dados.
 */
public class ConexaoUtil {

    /**
     * Faz um simples teste de Conexão com o Banco de Dados, abrindo-o e
     * fechando.
     *
     * @throws SQLException se ocorrer um erro de acesso ao banco
     */
    public static void testaConexao() throws SQLException {
        new ConnectionPool().getConnection().close();
    }

}
