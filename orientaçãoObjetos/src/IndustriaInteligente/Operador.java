package IndustriaInteligente;

public class Operador {
	
	private int idOperador;
	private String nome;
	private String habilidades;
	private boolean necessidadeManutencao;  
	
	
	public int getIdOperador() {
		return idOperador;
	}
	public void setIdOperador(int idOperador) {
		if ( idOperador >99)
		this.idOperador = idOperador;
	}
	
	public String getNome() {
		return nome;
	}
	public boolean setNome(String nome) {
		if( nome.matches(".*[A-Z].*") && nome.matches(".*[a-z].*") && nome.length() >2) {
		this.nome = nome;
		return true;
		} else {
			return false; 
		}
	}
	
	public String getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String habilidades) {
		if ( habilidades.matches(" .*[Aa - zZ].* ") && habilidades.matches(".*[a-z].*"))
		this.habilidades = habilidades;
	}
	
	public String monitorarStatus () {
		return "monitorando";
	}
	
	public boolean isNecessidadeManutencao() {
		return necessidadeManutencao;
	}
	
	public String setNecessidadeManutencao(boolean necessidadeManutencao) {
		this.necessidadeManutencao = necessidadeManutencao;
		return "";
	}
	public String alertasManutencao( boolean necessidadeManutencao) {
		if ( necessidadeManutencao == true) {
			return " Necessita de Manutenção";
		} else {
			return " Não necessita de manutenção";
		}
	}
	
	public String ajustesproducao (String ajuste) {
		return ajuste;
	}
}
