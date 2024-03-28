/***
 * @author bianca_vaz
 * @author carlos_kviatkowsky
 * Data de criação: 08.03.24
 * descrição: Nesta classe contem informações sobre componente, como: 
 * nome, tipo, estoque e quantidade de componentes. 
 */

public class Componente {

	private String nome;
	private String tipo;
	private int quantidade;
	
	public String  getStatusTotal () {
		// Concatenando todas as informações do componente em uma String
		String status = "Nome do componente: " + this.nome + "\nTipo do componente: " + this.tipo + "\nQuantidade: "+ quantidade;
		// Retornando a String com todas as informações do Componente;
		return status;
	}
	
	public String setNome(String nome) {
		// verificando se há letras minusculas e se a String tem mais de 2 caractéres, se não comprir esses requisitos 
		// nao será validado 
		if (nome.matches(".*[a-z].*") && nome.length() > 2) {
		this.nome = nome;
		return "Adicionado";
		}
		return "O nome do componente deve conter letras minúsculas e ter mais de 2 caractéres";
	}
	public void setTipo(String tipo) {
		// verificando se há letras minusculas e se a String tem mais de 2 caractéres, se não comprir esses requisitos 

		if (nome.matches(".*[a-z].*") && nome.length() > 2) {
			this.tipo = tipo;
			}
		
		
	}
	public String getNome() {
		return this.nome;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setQuantidade(int quantidade) {
		// Verificando se a quantidade é maior ou igual a 0 para ser adicionada
		if (quantidade >= 0 ) {
		this.quantidade = quantidade;
		}
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void reduzirEstoque(int quantidadeReducao) {
		// Verificando a quantidade para impossíbilitar a quantidade ser negativa, e também para ver se o parametro recebido 
		// nao é negativo, se não atender os  requisitos não será adicionado 
		if(this.quantidade >= quantidadeReducao && quantidadeReducao > 0 ) {
		this.quantidade -= quantidadeReducao;
		}
	}
	
	public String aumentarEstoque(int quantidadeAdicao) {
		// Verificando se o parametro que será adicionado não é negativo 
		if (quantidadeAdicao >= 0 ) {
		this.quantidade += quantidadeAdicao;
		return "Quantidade Atualizada";
		}
		return "A quantidade adicionada não pode ser negativa ";
	}
}
