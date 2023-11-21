package br.com.fiap.consultorias.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.consultorias.model.PagamentoModel;
import oracle.sql.DATE;
import oracle.sql.TRANSDUMP;

public class PagamentoDao {
    private Connection conexao;
	
	public PagamentoDao(Connection conexao) {
		this.conexao = conexao;
	}

	public void gravar (PagamentoModel transacao) {
		
		String sql = "INSERT INTO TB_TRANSACAO (ID_TRANSACAO, NR_CARTAO, DS_TITULAR, NR_CVV, DT_VALIDADE, QT_PARCELAS)"
				+ "VALUES (SQ_TRANSACAO.nextval, ?, ?, ?, ?, ?)";		
		try {
			PreparedStatement ps_transacao = conexao.prepareStatement(sql);
			
			
			ps_transacao.setInt(1, transacao.getNumeroCartao());
			ps_transacao.setString(2, transacao.getTitularCartao());
			ps_transacao.setInt(3, transacao.getCvv());
			ps_transacao.setDate(4, Date.valueOf(transacao.getValidadeCartao()));
			ps_transacao.setInt(5, transacao.getQtdParcelas());
			
			ps_transacao.execute();
			
			ps_transacao.close();
			
			conexao.close();
			
			System.out.println("Transação cadastrada com sucesso");
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar informações no banco");
			e.printStackTrace();
		}
		
	}

	public void excluir (int transacaoId) {
		String sql = "DELETE FROM TB_TRANSACAO WHERE ID_TRANSACAO = ?";		
		try {
			PreparedStatement ps_transacao = conexao.prepareStatement(sql);
			
			ps_transacao.setInt(1, transacaoId);
			ps_transacao.execute();
			
			ps_transacao.close();
			
			conexao.close();
			
			System.out.println("Transação cadastrada com sucesso");
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar informações no banco");
			e.printStackTrace();
		}
		
	}
	
	public void editarU (PagamentoModel transacao) {
		String sql = "UPDATE TB_TRANSACAO SET NR_CARTAO = ?, DS_TITULAR = ?, NR_CVV = ?, DT_VALIDADE = ?, QT_PARCELAS = ?"
				+ "WHERE ID_TRANSACAO = ?";		
		try {
			PreparedStatement ps_transacao = conexao.prepareStatement(sql);
			
			
			ps_transacao.setInt(1, transacao.getNumeroCartao());
			ps_transacao.setString(2, transacao.getTitularCartao());
			ps_transacao.setInt(3, transacao.getCvv());
			ps_transacao.setDate(4, Date.valueOf(transacao.getValidadeCartao()));
			ps_transacao.setInt(5, transacao.getQtdParcelas());
            ps_transacao.setInt(6, transacao.getIdTransacao());
			
			ps_transacao.execute();
			
			ps_transacao.close();
			
			conexao.close();
			
			System.out.println("Transação cadastrada com sucesso");
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar informações no banco");
			e.printStackTrace();
		}
    }
        public List<PagamentoModel>  listarTodasTrasacoesUsuario(int transacaoId) {
            String sql = "SELECT * FROM TB_TRANSACAO WHERE FK_USUARIO = ?";		
            List<PagamentoModel> transacoes = new ArrayList<PagamentoModel>();
		try {
			PreparedStatement ps_transacao = conexao.prepareStatement(sql);
			
			
			ps_transacao.setInt(1, transacaoId);
			
			ResultSet res = ps_transacao.executeQuery();
			
            if(res.next()) {
                do {
                    PagamentoModel transacao = new PagamentoModel();
                    transacao.setCvv(res.getInt("NR_CVV"));
                    transacao.setIdTransacao(res.getInt("ID_TRANSACAO"));
                    transacao.setNumeroCartao(res.getInt("NR_CARTAO"));
                    transacao.setQtdParcelas(res.getInt("QT_PARCELAS"));
                    transacao.setTitularCartao(res.getString("DS_TITULAR"));
                    transacao.setValidadeCartao(res.getDate("DT_VALIDADE").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    transacoes.add(transacao);
                } while (res.next());
            }

			ps_transacao.close();
			
			conexao.close();
			
			System.out.println("Transação cadastrada com sucesso");
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar informações no banco");
			e.printStackTrace();
		}

        return transacoes;
        }
	
}
