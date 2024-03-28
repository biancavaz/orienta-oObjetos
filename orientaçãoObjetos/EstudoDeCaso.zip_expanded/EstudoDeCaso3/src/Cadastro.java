/***
 * @author bianca_vaz
 * Data de criação: 08.03.24
 * Descrição: Esta classe contem: senha e login para o cadastro. 
 */
public class Cadastro {


	
	private String login = "adm";
	private String senha = "adm"; 
	

	
	public String getLogin() {
		return this.login;
	}
	public String getSenha() {
		return this.senha;
	}
	public String setLogin(String login) {
		if (login.length() > 4  ) {
		this.login = login;
		return "Valido";
		}
		return "Deve conter mais de 4 letras";
		
	}
	public String setSenha(String senha) {
		if (senha.length() > 4 && senha.matches(".*[A-Z].*")) {
		this.senha = senha;
		return "Alterado";
		}
		return "Necessita de mais de 4 caractéres e deve conter uma letra maiúscula";
	}
}
