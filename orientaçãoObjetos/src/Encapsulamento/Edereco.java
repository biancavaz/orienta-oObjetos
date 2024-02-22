package Encapsulamento;

public class Edereco {
	
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	
	public boolean setBairro(String bairro) {
		if ( bairro.length () >=2) {
		this.bairro = bairro;
		return true;
	} return false; 
}
	public String getBairro() {
		return this.bairro;
	}
	
	public boolean setCep(String cep) {
		if (cep.length() == 8) {
			this.cep = cep;
			return true; 
	} return false;
}
	public String getCep() {
		return this.cep.substring(0, 4)+"-"+this.cep.substring(5, 7);
	}
	
	public boolean setNumero(int numero) {
		if ( numero >=0) {
			this.numero = numero;
			return true;
	} return false;
}
	public int getNumero() {
		return this.numero;
	}
	
	public boolean setRua (String rua) { 
		if (rua.length() >=2) {
			this.rua=rua;
			return true; 
	} return false;
}
	public String getRua () { 
		return this.rua;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getComplemento() {
		return this.complemento;
	}
}
