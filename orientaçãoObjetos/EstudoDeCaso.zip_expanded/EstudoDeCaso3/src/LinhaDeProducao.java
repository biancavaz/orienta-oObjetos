/**
 * @author bianca_vaz
 * @author carlos_kviatkowsky
 * data de criação: 08.03.24
 * Descrção: Nesta classe contem informações sobre a linha de produção, tais quais:
 * o id, a lista de maquinas que operam nessa linha de produção,
 * o tempo de ciclo dessa linha de produção, o status e parametros de produção. 
 */

import java.util.ArrayList;

public class LinhaDeProducao {

	private int id;
	private ArrayList<Maquina> maquinas = new ArrayList<>();
	private int tempoDeCiclo;
	private String status;
	private ArrayList<String> parametrosDeProducao = new ArrayList<>();
	private boolean funcionando;
	
	public String getStatusTotal () {
		String nomeMaquinas = "";
		String todosParametros = "";
		
		// passando todo o ArrayList de id das maquinas para String para visualização usuário 
		for (int cont = 0 ; cont < maquinas.size(); cont++) {
			nomeMaquinas += maquinas.get(cont).getIdMaquina() + " ";
	
		}
		// passando todo o ArrayList de parametros de produção para  uma unica String para visualização usuário 
		for (int cont = 0; cont < parametrosDeProducao.size(); cont++) {
			todosParametros += parametrosDeProducao.get(cont);
		}
		
		//Concatenação de todas as informações da linha de produção em uma unica string 
		String statusTotal = "ID " + this.id  + "\nId das maquinas " + nomeMaquinas + "\nTempo de ciclo "+ this.tempoDeCiclo + 
				" Minutos" +"\nParametros de Producao" + todosParametros + "\nEstá funcionando ? " + this.funcionando;
		
		// retornando a string concatenada 
		return statusTotal;
	}

	public String iniciarProducao() {
		this.funcionando = true;

		return "Funcionando";
	}

	public String pararProducao() {
		this.funcionando = false;

		return "Parou a produção";
	}

	public String emitirAlertaDeManutencao() {
		return "A algo de errado, faça a manutenção preditiva nas maquinas";
	}

	public int tamanhoListaMaquina() {
		return this.maquinas.size();
	}

	public void addMaquina(Maquina maquina) {
		this.maquinas.add(maquina);
	}

	public void removeMaquina(int indice) {
		this.maquinas.remove(indice);
	}

	public Maquina getMaquina(int indice) {
		return this.maquinas.get(indice);

	}

	public String addParametrosDeProducao(String parametro) {
		if (parametro.length() > 3) {
			this.parametrosDeProducao.add(parametro);
			return "Parametro adicionado";
		} else {
			return "O parametro é muito pequeno ";
		}
	}

	public void removeParametrosDeProducao(int indice) {
		this.parametrosDeProducao.remove(indice);
	}

	public void getParametrosDeProducao(int indice) {
		this.parametrosDeProducao.get(indice);
	}

	public int getTempoDeCiclo() {
		return this.tempoDeCiclo;
	}

	public String setTempoDeCiclo(int tempoDeCiclo) {
		// tempo ciclo deverá ser inserido em minutos 
		if (tempoDeCiclo > 0) {
			this.tempoDeCiclo = tempoDeCiclo;
			return "Adicionado ";
		} else {
			return "O valor que deseja adicionar é nulo";
		}
	}

	public String getStatus() {
		return this.status;
	}

	public String setStatus(String status) {
		if (status.length() < 3) {
			return "O status deve conter mais de 3 caractéres";
		}
		// Verificando se há numeros na String status, se houver, não será validado
		if (status.matches(".*[0-9].*")) {
			return "O status não pode conter números";
		}
		this.status = status;

		return "Status setado";

	}

	public boolean isFuncionando() {
		return this.funcionando;
	}

	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

}