package ExplicaçãoProfessor;

public class Aluno {
	
	// atributos :
	String nome; 
	String senha;
	String email; 
	String serie;
	// métodos (funções):
	
	public boolean verificaSenha(String senha) {
		if (senha.length()>=6) {
			if (senha.matches(".*[0-9].*")&&senha.matches(".*[a-z].*")&&senha.matches(".*[A-Z].*")) {
				return true;
			}
		}
		return false;
	}
	
	public boolean verificaEmail(String email) {
		if (email.contains("@"))
			this.email = email;
		else
			return false;
		return true; 
	}
	
	public String mostrarDados() {
		String dados = "\n Nome: " + nome + "\n e-mail: " + email; 
				
		return dados; 
	}
	

}
