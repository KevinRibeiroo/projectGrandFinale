package br.com.fiap.consultorias.model;

public class ProdutoModel {
    private int idProduto;
    private String imagemProduto;
    private String tituloProduto;
    private String descricaoProduto;
    private double vlPreco;
    private int tgInativo;
    
    
    public ProdutoModel(String tituloProduto, String descricaoProduto, double vlPreco, String imagemProduto, int tgInativo) {
        
    	this.tituloProduto = tituloProduto;
        this.descricaoProduto = descricaoProduto;
        this.vlPreco = vlPreco;
        this.imagemProduto = imagemProduto;
        this.tgInativo = tgInativo;
    }

    public ProdutoModel() {
		// TODO Auto-generated constructor stub
	}

	public int getTgInativo() {
        return tgInativo;
    }
    public void setTgInativo(int tgInativo) {
        this.tgInativo = tgInativo;
    }
    public double getVlPreco() {
        return vlPreco;
    }
    public void setVlPreco(double vlPreco) {
        this.vlPreco = vlPreco;
    }
    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public String getImagemProduto() {
        return imagemProduto;
    }
    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }
    public String getTituloProduto() {
        return tituloProduto;
    }
    public void setTituloProduto(String tituloProduto) {
        this.tituloProduto = tituloProduto;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
}
