package br.com.fabrica.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabrica.persistencia.entidade.Usuario;

public class UsuarioDAO {

	private Connection connection = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuario usuario) {
		// TODO Auto-generated method stub
		String sql = "insert into usuario (nome, login, senha) values (?, ?, ?)";
		
		try {
			PreparedStatement preparador = connection.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			
			//Executando o sql no banco de dados
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void alterar(Usuario usuario) {
		// TODO Auto-generated method stub
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";
		
		try {
			PreparedStatement preparador = connection.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());
			
			//Executando o sql no banco de dados
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void excluir(Usuario usuario) {
		// TODO Auto-generated method stub
		String sql = "delete from usuario where id=?";
		
		try {
			PreparedStatement preparador = connection.prepareStatement(sql);
			preparador.setInt(1, usuario.getId());
			
			//Executando o sql no banco de dados
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
