package AtividadeEscolaTech;

public class Disciplina {
	
	String nomeDisciplina;
	String codDisciplina; 
	String dscrConteudo;
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
			
			public boolean verificadscrConteudo (String dscrConteudo) {
				if (dscrConteudo.length() >=10) {
					this.dscrConteudo = dscrConteudo;
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


