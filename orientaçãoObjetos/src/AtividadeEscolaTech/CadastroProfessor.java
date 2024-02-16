package AtividadeEscolaTech;

public class CadastroProfessor {
	
	String nomeProf; 
	String emailProf;
	String senhaProf;
	String numIdentif; 
	String telefoneProf; 
	String loginProf; 
	
	
	public boolean verificaEmail(String emailProf) {
		if (emailProf.contains("@"))
			this.emailProf = emailProf;
		else
			return false;
		return true; 
	} 
	
	public boolean verificaSenhaProf (String senhaProf) {
		if (senhaProf.length() >= 6)
			return true;
		else {
			return false; 
		}
	}
	
	public boolean verificaTelefone ( String telefoneProf ) {
		if ( telefoneProf.length() == 11) 
			return true;
		else {
			return false; 
		}
	}    
	
	public boolean verificaIdentificacao ( String numIdentificacao ) {
		if ( numIdentificacao.length() == 5 )
			return true; 
		else {
			return false;
		}
	}
	
	public boolean verificaLoginProf(String loginProf) {
		if (loginProf.contains("_"))
			this.loginProf = loginProf;
		else
			return false;
		return true; 
	} 
	
	public String mostrarDados() {
		String dados =  "\n O seu login é: " + emailProf + "\nA senha do login é a mesma do e-mail! "; 
				
		return dados; 
	}
}
