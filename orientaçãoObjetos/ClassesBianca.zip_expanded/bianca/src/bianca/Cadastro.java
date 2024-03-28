package bianca;

/***
 * @author bianca_vaz
 * Data de criação: 08.03.24
 * Descrição: Esta classe contem: senha e login para o cadastro. 
 */
public class Cadastro {

	// Atributos começam com o valor "adm" para permitir o primeiro acesso
	
	private String login = "adm";
	private String senha = "adm"; 
	

	
	public String getLogin() {
		return this.login;
	}
	public String getSenha() {
		return this.senha;
	}
	public String setLogin(String login) {
		//Verificando se o login tem mais de 4 caracteres  
		if (login.length() > 4  ) {
		this.login = login;
		return "Valido";
		}
		// Se não entrar na validação, não será atribuido o valor 
		return "Deve conter mais de 4 letras";
		
	}
	public String setSenha(String senha) {
		// Verificando se a senha tem mais de 4 caractéres e ao menos uma letra maiúscula
		// Se validado atribuirá o valor ao atributo do objeto 
		if (senha.length() > 4 && senha.matches(".*[A-Z].*")) {
		this.senha = senha;
		return "Alterado";
		}
		// se não entrar na validação, o valor não será atribuido e será retornado o erro
		return "Necessita de mais de 4 caractéres e deve conter uma letra maiúscula";
	}
}
