package DAO;

import db.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;
import util.MensagensUtil;

public class UsuarioDAO {

    public Usuario buscaPorId(int id) {
        Usuario usuario = null;

        String sql = "select id, login, senha, nome "
                + "from usuario where id = ?;";

        try (Connection conn = new ConnectionPool().getConnection()) {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);

                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        usuario = populaObjeto(rs);
                        break;
                    }
                }
            }
        } catch (SQLException e) {
            MensagensUtil.erro(e.getMessage());
        }

        return usuario;
    }

    public Usuario buscaPorIdESenha(int id, String senha) {
        Usuario usuario = null;
        String sql = "select id, login, senha, nome "
                + "from usuario where id = ? and senha = ?;";

        try (Connection conn = new ConnectionPool().getConnection()) {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.setString(2, senha);

                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        usuario = populaObjeto(rs);
                        break;
                    }
                }
            }
        } catch (SQLException e) {
            MensagensUtil.erro(e.getMessage());
        }

        return usuario;
    }

    private Usuario populaObjeto(ResultSet rs) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(rs.getInt("id"));
        usuario.setLogin(rs.getString("login"));
        usuario.setNome(rs.getString("nome"));
        usuario.setSenha(rs.getString("senha"));

        return usuario;
    }

}
