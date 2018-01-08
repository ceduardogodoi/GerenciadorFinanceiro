package db;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

public class ConnectionPool {

    private DataSource dataSource;

    public ConnectionPool() {
        configuraPool();
    }

    private void configuraPool() {
        MysqlDataSource pool = new MysqlDataSource();
        pool.setUrl("jdbc:mysql://127.0.0.1/del?useSSL=false&serverTimezone=UTC");
        pool.setUser("root");
        pool.setPassword("");

        dataSource = pool;
    }

    /**
     * Obtém um pool de conexões do banco de dados.
     * @return um pool de conexões
     * @throws SQLException 
     */
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

}
