/***
 * @author bianca_vaz
 * @author carlos_kviatkowsky
 * Data de criação: 08.03.24
 * Descricao: A Classe maquina tem como objetivo mostrar dados sobre o: 
 * Id da maquina, seu tipo, o desempenho dela, o status, o operador que 
 * cuida/controla a maquina e demanda dela. 
 * 
 */

public class Maquina {

	private int idMaquina;
	private String tipoMaquina;
	private String status;
	private String desempenho;
	private Operador operador;
	private boolean funcionando;
	private int demanda = 0;


	
	
	public String getStatusGeral() {
		
		//String para armazenar todo o conteudo da maquina  em uma string para facilitar a visão do usuário 
		String status = "Id: " + this.idMaquina + "\nTipo maquina: " + this.tipoMaquina+ "\nStatus: " + this.status + 
				"\nDesempenho: "+ this.desempenho + "\noperador: " + this.operador.getNome() + "\nEsta funcionando: " + this.funcionando+
				"\nDemanda: " + this.demanda;
		
		// retornando a String concatenada 
		return status;
	}
	
	public String realizarManutencaoPreditiva() {

		return "Manutençao realizada";

	}

	public void pararMaquina() {
		this.funcionando = false;
	}

	public void ligarMaquina() {
		this.funcionando = true;
	}

	public String monitoramento() {

		return "Monitorando";
	}

	public void solicitarProducao(int pedido) {
		if (pedido > 0) {
			this.demanda += pedido;
		}
	}

	public int getIdMaquina() {

		return this.idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		// Auto increment
		if (idMaquina > 0) {
			this.idMaquina = idMaquina;
		}
	}

	public String getTipoMaquina() {
		return this.tipoMaquina;
	}

	public String setTipoMaquina(String tipoMaquina) {
		// verificar se há números no Tipo da maquina, e se houver, retornar erro 
		if (tipoMaquina.matches(".*[0-9].*")) {
			return "O tipo não pode conter numeros ";
		}
		if (tipoMaquina.length() < 3) {
			return "Deve conter mais que 3 caractéres";
		}
		this.tipoMaquina = tipoMaquina;
		return "";
	}

	public String getStatus() {
		return status;
	}

	public String setStatus(String status) {
		if (status.length() < 3) {
			return "O status deve conter mais de 3 caractéres";
		}
		if (status.matches(".*[0-9].*")) {
			return "O status não pode conter números";
		}
		this.status = status;

		return "";

	}

	public String getDesempenho() {
		return this.desempenho;
	}

	public String setDesempenho(String desempenho) {
		if (desempenho.matches(".*[0-9].*") || desempenho.length() < 3) {
			return "O desempenho nao pode conter numeros ";
		}

		this.desempenho = desempenho;
		return "Adicionado";

	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public boolean isFuncionando() {
		return funcionando;
	}

	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}

	public int getDemanda() {
		return this.demanda;
	}

	public void setDemanda(int demanda) {
		if (demanda >= 0) {
			this.demanda = demanda;
		}
	}
	
	
	

}