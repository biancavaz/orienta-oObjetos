package AtividadeEscolaTech;

public class Cursos {
	
	String cod;
	String dscConteudo;
	String valorMensalidade;
	String cargaHoraria;
	String nomeCurso; 
	
	public boolean verificanomeCurso(String nomeCurso) {
		if (nomeCurso.matches("*.( 0 - 9 ).*") || (nomeCurso.length()>4)) {
			return false;
			}
		else
			this.nomeCurso = nomeCurso;
			return true; 
	} 
}
