/***
 * @author bianca_vaz
 * @author carlos_kviatkowsky
 * data de criação: 08.03.24 
 * Descrição: Esta classe contem informações sobre o produto, como:
 * id do produto, nome, descrição, processo de fabricação, data de produção do produto,
 * ligação com a classe maquina, atualização de processo, fabricação e 
 * tambem contem a lista de produtos. 
 * 
 */



import java.util.ArrayList;
import java.util.Date;

public class Produto {

	private int idProduto;
	private String nome;
	private String descricao;
	private ArrayList<Componente> listaComponentes = new ArrayList<>();
	private String processoFabricacao;
	private Date dataProducao;
	private Maquina maquina;
	private boolean necAtualizarProcessos;
	private boolean fabricacao;
	
	
	public String getStatusTotal () {
		
		//String para armazenar todo o conteudo do produto em uma string para facilitar a visão do usuário 
		String todosComponentes = "";
		
		// passando o nome dos componentes para String para visualização 
		for ( int cont = 0; cont < listaComponentes.size(); cont++) {
			todosComponentes += listaComponentes.get(cont).getNome() + " ";
		}
		// Concatenação de todas informações em uma String só; 
		String statusTotal = "Id produto " + this.idProduto + "\nNome do produto" + this.nome + "\nDescrição: "+ this.descricao+
				"\nComponentes: " + todosComponentes + "\nProcesso de fabricação :" + this.processoFabricacao + "\nData de produção: "+
				this.dataProducao + "\nId maquina que produz: " + maquina.getIdMaquina() + "\nNecessita atualizar processos? " + this.necAtualizarProcessos +
				"\nEstá em fabricação: " + this.fabricacao;
		
		// retornando a String concatenada
		return statusTotal;
	}

	public int getIdProduto() {
		return this.idProduto;
	}

	public boolean setIdProduto(int idProduto) {
		// O ID no sistema será um auto-Increment
		if (idProduto > 0) {
			return false;
		} else {
			this.idProduto = idProduto;
			return true;
		}
	}

	public String getNome() {
		return this.nome;
	}

	public boolean setNome(String nome) {
		if (nome.matches(".*[0-9].*")) {
			return false;
		} else {
			this.nome = nome;
			return true;
		}
	}

	public String getDescricao() {
		return this.descricao;
	}

	public boolean setDescricao(String descricao) {
		if (descricao.length() > 7) {
			this.descricao = descricao;
			return true;
		} else {
			return false;
		}
	}

	public Componente getComponentes(int indice) {
		return listaComponentes.get(indice);
	}

	public void addCompente(Componente componente) {
		listaComponentes.add(componente);
	}

	public void removerComponentes(int indice) {
		listaComponentes.remove(indice);
	}

	public String isfabricacao() {
		return this.processoFabricacao;
	}

	public void setFabricacao(String processoFabricacao) {
		this.processoFabricacao = processoFabricacao;
	}

	public String processoFabricacao(boolean fabricacao) {
		if (fabricacao == true) {
			return " Em processo de Fabricação ";
		} else {
			return " Produto já fabricado! ";
		}
	}

	public Date getDataProducao() {
		return this.dataProducao;
	}

	public void setDataProducao(String dataProducao) {
		// Fazendo a divizão da String dataProdução para criar o objeto date 
		int dia = Integer.parseInt(dataProducao.substring(0, 2));
		int mes = Integer.parseInt(dataProducao.substring(3, 5)) - 1;
		int ano = Integer.parseInt(dataProducao.substring(6, 10));
		Date date = new Date(ano - 1900, mes, dia);

		this.dataProducao = date;
	}

	public Maquina getMaquina() {
		return this.maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

	public String gerenciamentodeInformacoes() {
		return "Gerenciando";
	}

	public boolean isNecAtualizarProcessos() {
		return this.necAtualizarProcessos;
	}

	public void setNecAtualizarProcessos(boolean necAtualizarProcessos) {
		this.necAtualizarProcessos = necAtualizarProcessos;
	}

	public String atualizaProcessos(boolean necAtualizarProcessos) {
		if (necAtualizarProcessos == true) {
			return " Atualize o processo! ";
		} else {
			return " Não há necessidade de atualizar. ";
		}
	}

	public int tamanhoComponentes() {
		return this.listaComponentes.size();
	}

}