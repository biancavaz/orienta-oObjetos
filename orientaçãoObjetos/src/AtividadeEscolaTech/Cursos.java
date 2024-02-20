package AtividadeEscolaTech;

public class Cursos {
	 
	String cod;
	String dscConteudo;
	String valorMensalidade;
	String cargaHoraria;
	String nomeCurso; 
	String mensalidade; 
	Disciplina [] disciplina;
	// curso.disciplina[cont] = disciplina[cont];

	public boolean verificanomeCurso(String nomeCurso) {
		if (nomeCurso.matches(".*( 0 - 9 ).*")) {
			return false;
			}
		else
			this.nomeCurso = nomeCurso;
			return true; 
			}
	
	public boolean verificacod(String cod) {
		if (cod.matches(".*( a - z ).*")) {
			return false;
			}
		if ( cod.length() <4) {
			return false;
		} else {
		this.cod = cod;
			return true;
		}
	}
	
	public boolean verificadscConteudo (String dscConteudo) {
		if (dscConteudo.length() >=10) {
			this.dscConteudo = dscConteudo;
		return true;
		}
		
		else {
			return false; 
		}
	}
	
	public boolean verificacargaHoraria (String cargaHoraria) {
		int x = Integer.valueOf(cargaHoraria);
		if (x >=4 ) {
			this.cargaHoraria = cargaHoraria;
			return true;
		} else {
			return false; 
		}
	}
	
	public boolean verificamensalidade (String mensalidade) {
		if (mensalidade.matches(".*( a - z ).*") ) {
			return false;
			}
		else
			this.mensalidade = mensalidade;
			return true; 
			}
	

	
	
	
}


