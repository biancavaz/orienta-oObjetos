package IndustriaInteligente;

public class Produto {
	
	private int idProduto;
	private String nome;
	private String descricao;
	private String listaComponentes;
	private String processoFabricacao;
	private String dataProducao;
	private String variedade;
	private Maquina maquina;
	
	
	public int getIdProduto() {
		return idProduto;
	}
	public boolean setIdProduto(int idProduto) {
		if ( idProduto >99) {
			return false;
		} else {
			this.idProduto = idProduto;
			return true; 
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public boolean setNome(String nome) {
		if (nome.contains ("1-9")) {
			return false;
		} else {
			this.nome = nome;
			return true; 
		}
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}
	public boolean setDescricao(String descricao) {
		if ( descricao.length() >20) {
		this.descricao = descricao;
		return true; 
		} else {
			return false;
		}
	}
	
	
	public String getListaComponentes() {
		return listaComponentes;
	}
	public void setListaComponentes(String listaComponentes) {
		
		this.listaComponentes = listaComponentes;
	}
	
	
	
	public String getProcessoFabricacao() {
		return processoFabricacao;
	}
	public void setProcessoFabricacao(String processoFabricacao) {
		this.processoFabricacao = processoFabricacao;
	}
	
	
	public String getDataProducao() {
		return dataProducao;
	}
	public boolean setDataProducao(String dataProducao) {
		if ( dataProducao.contains ("/")) {
			this.dataProducao = dataProducao;
			return true; 
		} else {
			return false; 
		}
	}
	
	
	public String getVariedade() {
		return variedade;
	}
	public void setVariedade(String variedade) {
		this.variedade = variedade;
	}
	
	
	public Maquina getMaquina() {
		return maquina;
	}
	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}
	
	
	
}
