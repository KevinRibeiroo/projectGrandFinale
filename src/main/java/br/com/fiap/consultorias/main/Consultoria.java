package br.com.fiap.consultorias.main;

import java.time.LocalDate;

import br.com.fiap.consultorias.dao.Conexao;
import br.com.fiap.consultorias.dao.PagamentoDao;
import br.com.fiap.consultorias.dao.ProdutoDao;
import br.com.fiap.consultorias.dao.UsuarioDao;
import br.com.fiap.consultorias.model.PagamentoModel;
import br.com.fiap.consultorias.model.ProdutoModel;
import br.com.fiap.consultorias.model.UsuarioModel;

public class Consultoria {
	
	public static void main(String[] args) throws Exception {
		
		var conexao = Conexao.abrirConexao();         
		
		UsuarioModel usuario = new UsuarioModel(5,"test","KEVINTEST@GMAIL.COM","19-QQQQQQ-");
		
		UsuarioDao usuarioDao = new UsuarioDao(conexao);

		//usuarioDao.createUsuario(usuario);
		
		ProdutoModel produto = new ProdutoModel("Teste1", "É um produto Teste 1", 2821, "testeURL", 0);
		
		ProdutoDao produtoDao =  new ProdutoDao(conexao);
		
	// produtoDao.cadastrarProduto(produto);
		
	//	produtoDao.listarTodosProdutos(produto);
		
		PagamentoModel pagamento = new PagamentoModel("Fabricio", 2457, LocalDate.now());
		
		PagamentoDao pagamentoDao = new PagamentoDao(conexao);
		
		pagamentoDao.gravar(pagamento);
	}     	
		
		

}
