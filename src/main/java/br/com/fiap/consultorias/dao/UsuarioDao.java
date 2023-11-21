package br.com.fiap.consultorias.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.consultorias.criptografia.Criptografia;
import br.com.fiap.consultorias.model.UsuarioModel;

public class UsuarioDao {
    private Connection conexao;
	public UsuarioDao(Connection conexao) {
		this.conexao = conexao;
	}
	public void createUsuario(UsuarioModel usuario) throws Exception {
		String sql = "INSERT INTO TB_USUARIO (ID_USUARIO, DS_NOME, DS_EMAIL, DS_SENHA,FL_IMAGEM)"
				+ "VALUES (SEQUENCE_USUARIO.nextval, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, usuario.getDsNome());
			ps.setString(2, usuario.getDsEmail());
			ps.setString(3, Criptografia.criptografar(usuario.getDsSenha()));
			ps.setNull(4, java.sql.Types.BLOB);
			
			ps.execute();
			ps.close();
			
			conexao.close();
			
			System.out.println("Usuario cadastrado com sucesso");
		} catch (SQLException e) {
			System.out.println("Falha ao cadastrar o usuario, tente novamente mais tarde");
		}
		
	}

	public void updateUsuario(UsuarioModel usuario) {
        String sql = "UPDATE TB_USUARIO SET (DS_NOME, DS_EMAIL, DS_SENHA,FL_IMAGEM)"
				+ "VALUES (?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, usuario.getDsNome());
			ps.setString(2, usuario.getDsEmail());
			ps.setString(3, usuario.getDsSenha());
			ps.setNull(4, java.sql.Types.BLOB);
			
			ps.execute();
			ps.close();
			
			conexao.close();
			
			System.out.println("Usuario alterado com sucesso");
		} catch (SQLException e) {
			System.out.println("Falha ao alterar o usuario, tente novamente mais tarde");
		}
	}

	public void deleteUsuario(int usuarioId) {
        String sql = "DELETE FROM TB_USUARIO WHERE ID_USUARIO = ?";

try {
    PreparedStatement ps = conexao.prepareStatement(sql);
    
    ps.setInt(1, usuarioId);
    
    ps.execute();
    ps.close();
    
    conexao.close();
    
    System.out.println("Usuario alterado com sucesso");
} catch (SQLException e) {
    System.out.println("Falha ao alterar o usuario, tente novamente mais tarde");
}
	}

	public UsuarioModel readUsuario(int usuarioId) {
		String sql = "SELECT * FROM TB_USUARIO WHERE ID_USUARIO = ?";
		UsuarioModel usuario = new UsuarioModel();
		
		try {
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, usuarioId);
			
			ResultSet res = ps.executeQuery();
			
			if (res.next()) {
				
				usuario.setId(res.getInt("ID_USUARIO"));
				usuario.setDsNome(res.getString("DS_NOME"));
				usuario.setDsEmail(res.getString("DS_EMAIL"));
				usuario.setDsSenha(res.getString("DS_SENHA"));
				//usuario.setFlImagem(res.getBlob("FL_IMAGEM"));
				
			}
			System.out.println(usuario.getDsEmail());
			ps.close();
			
			conexao.close();
			
			System.out.println("Usuario cadastrado com sucesso");
		} catch (SQLException e) {
			System.out.println("Houve uma falha ao consultar os dados referentes ao seu usuario, por favor tente novamente mais tarde.");
		}
		return usuario;
		
		
	}
}
