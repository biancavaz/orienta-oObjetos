package Encapsulamento;

public class ExplicaçãoPof {

	private String rua; 
	
	public boolean setRua (String rua) { // set define
		if (rua.length() >=2) {
			this.rua=rua;
			return true; // return fim
		} 
		return false;
	
	}
	public String getRua () { // get pega
		return this.rua;
		
	}
}
