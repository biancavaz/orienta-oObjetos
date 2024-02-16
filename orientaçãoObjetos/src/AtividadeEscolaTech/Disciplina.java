package AtividadeEscolaTech;

public class Disciplina {
	
	String nomeDisciplina;
	String codDisciplina; 
	String dscrConteúdo;
	String cargaHoraria;
	String mensalidade; 

	public boolean verificaNomeDisciplina(String nomeDisciplina) {
		if (nomeDisciplina.matches(".*( 0 - 9 ).*") || (nomeDisciplina.length()<4))  {
			return false;
			}
		else {
			this.nomeDisciplina = nomeDisciplina;
			return true; 
	} 
}
			public boolean verificacodDisciplina(String codDisciplina) {
				if (codDisciplina.matches(".*(a - z ).*") || (codDisciplina.length()<4))  {
					return false;
					}
				else {
					this.codDisciplina = codDisciplina;
					return true; 
			} 
		}
		
		
	}


