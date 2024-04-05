package Apresentação;

public class Professor {
	
	private String nome;
	private String idade;
	private String cpf;
	
	public boolean setNome(String nome) {
		if (nome.contains(" ") && nome.length()>3) {
		this.nome = nome;
		return true;
		} else {
			return false;
		}
	}
	public String getNome() {
		return nome;
	}
	
	public boolean setIdade(String idade) {
		if ( idade.length()>0 && idade.length()<3 && idade.matches(".*[0-9].*") ) {
			this.idade = idade;
			return true;
		} else {
			return false;
		}
		
	}
	public String getIdade() {
		return idade;
	}
	
	public boolean setCpf(String cpf) {
		if ( cpf.length()==11 && cpf.matches(".*[0-9].*") ) {
			this.cpf = cpf;
			return true;
		} else {
			return false;
		}
	}
	public String getCpf() {
		return cpf;
	}
	

}
