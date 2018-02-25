package db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class StructureBuilder {

    private static final String CREATE_DATABASE = "create database";
    private static final String CREATE_TABLE = "create table";

    void createIfNotExists(Connection conn, String sql, String resourceName)
            throws SQLException {
        DatabaseMetaData metaData = conn.getMetaData();
        ResultSet rs;

        if (sql.contains(CREATE_DATABASE)) {
            rs = metaData.getCatalogs();

            while (rs.next()) {
                if (rs.getString("TABLE_CAT").equals(resourceName)) {
                    return;
                }
            }

            create(conn, sql);
            rs.close();
            
            return;
        }

        if (sql.contains(CREATE_TABLE)) {
            rs = metaData.getTables(null, null, resourceName,
                    null);

            while (rs.next()) {
                if (rs.getString("TABLE_NAME").equals(resourceName)) {
                    return;
                }
            }

            create(conn, sql);
            rs.close();
        }
    }

    private void create(Connection conn, String sql) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);

            System.out.println(sql + "\n");
        }
    }

}
