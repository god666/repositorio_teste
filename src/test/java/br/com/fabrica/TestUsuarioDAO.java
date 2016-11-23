package br.com.fabrica;

import br.com.fabrica.persistencia.entidade.Usuario;
import br.com.fabrica.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testCadastrar();
		//testAlterar();
		testExcluir();
	}
	
	public static void testCadastrar(){
		Usuario usuario = new Usuario();
		usuario.setNome("Jesus");
		usuario.setLogin("jes");
		usuario.setSenha("123");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.cadastrar(usuario);
		
		System.out.println("Sucesso!");
	}
	
	public static void testAlterar(){
		Usuario usuario = new Usuario();
		usuario.setId(5);
		usuario.setNome("Jose Alterado");
		usuario.setLogin("jose_alt");
		usuario.setSenha("123");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.alterar(usuario);
		
		System.out.println("Sucesso!");
	}
	
	public static void testExcluir(){
		Usuario usuario = new Usuario();
		usuario.setId(7);
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.excluir(usuario);
		
		System.out.println("Sucesso!");
	}

}
