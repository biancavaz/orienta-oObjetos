/***
 * @author bianca_vaz 
 * @author carlos_kviatkowsky
 * data de criação: 08.03.24
 * descrição: Nesta classe contem informações sobre o operador, 
 * tais quais: Id, nome, habilidades que esse operador possui.
 * E também possui irformações da maquina em que ele opera, como: 
 * O status, a necessidade de manutencao  
 */

import java.util.ArrayList;

public class Operador {

	private int idOperador;
	private String nome;
	private ArrayList<String> habilidades = new ArrayList<>();
	private boolean necessidadeManutencaoMaquina;

	
	public String getStatusGeral() {
		
		//String para armazenar todo o conteudo do Operador em uma string para facilitar a visão do usuário 
		String habilidadesCompiladas = "";
		
		// passando todo o ArrayList de habilidades para String para visualização usuário 
		for (int cont = 0; cont < this.habilidades.size(); cont ++) {
			habilidadesCompiladas += this.getHabilidades(cont) + " ";
		}
		// Concatenação de todas informações em uma String só; 
		String status = "ID: " + this.idOperador + "\nNome: "+ this.nome  + "\nHabilidades: " + habilidadesCompiladas + 
				"\nNecessita de manutenção: " + this.necessidadeManutencaoMaquina;
				
		// retornando a String concatenada
		return status;
	}
	
	
	public int getIdOperador() {
		return this.idOperador;
	}

	public void setIdOperador(int idOperador) {
		if (idOperador > 99)
			this.idOperador = idOperador;
	}

	public String getNome() {
		return this.nome;
	}

	public boolean setNome(String nome) {
		// verificando se há ao menos uma letra maiúscula e uma minúscula no nome para ser validado 
		if (nome.matches(".*[A-Z].*") && nome.matches(".*[a-z].*") && nome.length() > 2) {
			this.nome = nome;
			return true;
		} else {
			return false;
		}
	}

	public void addHabilidades(String habilidade) {
		// verificando se há ao menos uma letra maiúscula e uma minúscula no nome para ser validado 
		if (habilidade.matches(".*[A-Z].*") && habilidade.matches(".*[a-z].*") && habilidade.length() > 2) {
			habilidades.add(habilidade);
		}

	}

	public String getHabilidades(int indice) {
		return this.habilidades.get(indice);
	}

	public void removeHabilidade(int indice) {
		this.habilidades.remove(indice);
	}

	public int tamanhoHabilidades() {
		return this.habilidades.size();
	}

	public String monitorarStatus() {
		return "monitorando";
	}

	public boolean isNecessidadeManutencao() {
		return this.necessidadeManutencaoMaquina;
	}

	public String setNecessidadeManutencao(boolean necessidadeManutencao) {
		this.necessidadeManutencaoMaquina = necessidadeManutencao;
		return "";
	}

	public String alertasManutencao(boolean necessidadeManutencao) {
		if (necessidadeManutencao == true) {
			return " Necessita de Manutenção";
		} else {
			return " Não necessita de manutenção";
		}
	}

	public String ajustesproducao(String ajuste) {
		return ajuste;
	}
}