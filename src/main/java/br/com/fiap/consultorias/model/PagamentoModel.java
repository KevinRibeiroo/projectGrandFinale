package br.com.fiap.consultorias.model;

import java.time.LocalDate;

public class PagamentoModel {
	private int idTransacao;
	public int getIdTransacao() {
		return idTransacao;
	}
	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}
	
	public PagamentoModel(String titularCartao, int numeroCartao, LocalDate validadeCartao) {
        TitularCartao = titularCartao;
        this.numeroCartao = numeroCartao;
        this.validadeCartao = validadeCartao;
    }
	
	public PagamentoModel() {
		// TODO Auto-generated constructor stub
	}

	private String TitularCartao;
	private int  numeroCartao;
	private LocalDate validadeCartao;
	private int cvv;
	private int qtdParcelas;
	
	public String getTitularCartao() {
		return TitularCartao;
	}
	public void setTitularCartao(String titularCartao) {
		TitularCartao = titularCartao;
	}
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public LocalDate getValidadeCartao() {
		return validadeCartao;
	}
	public void setValidadeCartao(LocalDate validadeCartao) {
		this.validadeCartao = validadeCartao;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	
}
