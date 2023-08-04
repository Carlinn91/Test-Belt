package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Entidades.usuarios;
import conexao.conexao;

public class usuarioDAO {
    
    public void cadastrarDescricao(usuarios usuarios){

        String sql = "INSERT INTO usuarios (c1_codigo, c2_descricao) VALUES (?,?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, usuarios.getC1_codigo());
            ps.setString(2, usuarios.getc2_descricao());

            ps.execute();
            ps.close();


        } catch (SQLException e) {
        
            e.printStackTrace();
        }


    }
}
