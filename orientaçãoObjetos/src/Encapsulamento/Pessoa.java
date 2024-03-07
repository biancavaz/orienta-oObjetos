package Encapsulamento;

public class Pessoa {
	
	private String nome;
	private String RG;
	private String CPF; 
	private Edereco endereco; 
	
	
	public void setEndereco(Edereco endereco) {
		this.endereco = endereco;
	}
	
	public boolean setNome (String nome ) {
		if (nome.contains ("0 - 9")) {
			return false;
		}  this.nome = nome; 
		return true;
	}
	
	public String getNome () {
		return this.nome; 
	}
	
	public boolean setCPF (String CPF) {
		if (CPF.length () == 11 ) {
			return true;
		} return false; 
	} 
	
	public String getCPF () {
		return this.CPF;
	}
	
	public  boolean setRG ( String RG) {
		if ( RG.length() == 7) {
			this.RG= RG; 
			return true; 
		}  return false;
	}
	
	public String getRG () {
		return this.RG; 
	}
	
}
