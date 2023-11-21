package br.com.fiap.consultorias.criptografia;

public class CriptografiaTeste {
					
			public static void main(String[] args) {
				try {
					System.out.println(Criptografia.criptografar("123456"));
					System.out.println(Criptografia.criptografar("123456"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	