package br.com.fiap.consultorias.model;


import java.sql.Blob;

import br.com.fiap.consultorias.criptografia.Criptografia;
import br.com.fiap.consultorias.criptografia.CriptografiaTeste;

public class UsuarioModel {
	private int id;
    private String dsNome;
    private String dsSenha;
    private String dsEmail;
    
    public UsuarioModel(int id, String dsNome,String dsSenha, String dsEmail) {
    	this.dsNome = dsNome;
        this.dsSenha = dsSenha;
        this.dsEmail = dsEmail;
        this.id = id;
    }
    
	public UsuarioModel() {
		
	}

	public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDsNome() {
        return dsNome;
    }
    public void setDsNome(String dsNome) {
        this.dsNome = dsNome;
    }
    public String getDsSenha() {
        return dsSenha;
        
    }
   // public void setDsSenha(String dsSenha) {
   //     this.dsSenha = dsSenha;
   // }
    
    public void setDsSenha(String DsSenha) {
    	
    	try {
			this.dsSenha = Criptografia.criptografar(DsSenha);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public String getDsEmail() {
        return dsEmail;
    }
    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
        
    }
    
    

}
