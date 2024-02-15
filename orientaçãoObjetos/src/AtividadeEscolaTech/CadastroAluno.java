package AtividadeEscolaTech;

import java.util.Scanner;

public class CadastroAluno {

	String nome;
	String telefone;
	String senha;
	String email;
	String login;
	String numIdentificacao; 
	
	public boolean verificaNome(String nome) {
		if (nome.matches("*.( 0 - 9 ).*")) {
			this.nome = nome;
			return false;
		}
		
		else
			return true; 
	} 
	
	
	public boolean verificaEmail(String email) {
		if (email.contains("@"))
			this.email = email;
		else
			return false;
		return true; 
	} 
	
	public boolean verificaSenha (String senha) {
		if (senha.length() >=6) {
			this.senha = senha;
		return true;
		}
		
		else {
			return false; 
		}
	}
	
	public boolean verificaTelefone ( String telefone ) {
		if ( telefone.length() == 11) {
			this.telefone = telefone;
		return true;
		}
		
		else {
			return false; 
		}
	}
	
	public boolean verificaIdentificacao ( String numIdentificacao ) {
		if ( numIdentificacao.length() == 5 ){
			this.numIdentificacao = numIdentificacao;
		return true;
		}
		else {
			return false;
		}
	}
	
	public String mostrarDados() {
		String dados =  "\n O seu login é: " + email + "\nA senha do login é a mesma do e-mail! "; 
				
		return dados; 
	}
	
}
	
	
		


