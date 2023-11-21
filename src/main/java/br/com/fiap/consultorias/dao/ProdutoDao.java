package br.com.fiap.consultorias.dao;


import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.consultorias.model.PagamentoModel;
import br.com.fiap.consultorias.model.ProdutoModel;

public class ProdutoDao{
	
	private Connection conexao;
	
	public ProdutoDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void cadastrarProduto (ProdutoModel produto) {
		
		String sql = "INSERT INTO TB_PRODUTOS (ID_PRODUTO, DS_TITULO, DS_DESCRICAO, VL_PRECO, TG_INATIVO, DS_URLIMAGEM )"
				+ "VALUES (SQ_PRODUTO.nextval, ?, ?, ?, ?, ?)";		
		try {
			PreparedStatement ps_Produto = conexao.prepareStatement(sql);
		
			ps_Produto.setString(1, produto.getTituloProduto());
			ps_Produto.setString(2, produto.getDescricaoProduto());
			ps_Produto.setDouble(3, produto.getVlPreco());
			ps_Produto.setInt(4, produto.getTgInativo());
			ps_Produto.setString(5, produto.getImagemProduto());
			
			ps_Produto.execute();
			
			ps_Produto.close();
			
			conexao.close();
			
			System.out.println("Produto cadastrada com sucesso");
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar informações referentes ao produto");
			e.printStackTrace();
		}
		
	}

	public void excluirProduto (int produtoId) {
		String sql = "DELETE FROM TB_PRODUTOS WHERE ID_PRODUTO = ?";		
try {
	PreparedStatement ps_Produto = conexao.prepareStatement(sql);

	ps_Produto.setInt(1, produtoId);
	
	ps_Produto.execute();
	
	ps_Produto.close();
	
	conexao.close();
	
	System.out.println("Produto cadastrada com sucesso");
	
	
} catch (SQLException e) {
	System.out.println("Erro ao cadastrar informações referentes ao produto");
	e.printStackTrace();
}

		
	}
	
	public void atualizarProduto (ProdutoModel produto) {
		
		String sql = "UPDATE TB_PRODUTOS SET  DS_TITULO = ?, DS_DESCRICAO = ?, VL_PRECO = ? , TG_INATIVO = ?, DS_URLIMAGEM = ? WHERE ID_PRODUTO = ?";		
try {
	PreparedStatement ps_Produto = conexao.prepareStatement(sql);

	ps_Produto.setString(1, produto.getTituloProduto());
	ps_Produto.setString(2, produto.getDescricaoProduto());
	ps_Produto.setDouble(3, produto.getVlPreco());
	ps_Produto.setInt(4, produto.getTgInativo());
	ps_Produto.setString(5, produto.getImagemProduto());
	ps_Produto.setInt(6, produto.getIdProduto());

	ps_Produto.execute();
	
	ps_Produto.close();
	
	conexao.close();
	
	System.out.println("Produto cadastrada com sucesso");
	
	
} catch (SQLException e) {
	System.out.println("Erro ao cadastrar informações referentes ao produto");
	e.printStackTrace();
}

	}

	public List<ProdutoModel> listarTodosProdutos (ProdutoModel produto) {
	
		String sql = "SELECT * FROM TB_PRODUTOS";
        List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();        
try {
    PreparedStatement ps_Produto = conexao.prepareStatement(sql);

    ResultSet res = ps_Produto.executeQuery();
            
    if (res.next()) {
        do {
            ProdutoModel produto1 = new ProdutoModel();
            produto1.setIdProduto(res.getInt("ID_PRODUTO"));
            produto1.setDescricaoProduto(res.getString("DS_DESCRICAO"));
            produto1.setImagemProduto(res.getString("DS_URLIMAGEM"));
            produto1.setTgInativo(res.getInt("TG_INATIVO"));
            produto1.setTituloProduto(res.getString("DS_TITULO"));
            produto1.setVlPreco(res.getDouble("VL_PRECO"));

            produtos.add(produto1);
        } while (res.next());
    }
    
    ps_Produto.execute();
    
    ps_Produto.close();
    
    
    System.out.println("Produto listado com sucesso");
    
    
} catch (SQLException e) {
    System.out.println("Erro ao cadastrar informações referentes ao produto");
    e.printStackTrace();
}

return produtos;
		
	}

}
