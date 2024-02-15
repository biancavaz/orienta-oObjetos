package ExplicaçãoProfessor;

public class Curso {
	// atributos:
	String nomeCurso;
	String periodo;
	String valor; 
	
	// métodos:
	public String mostrarDados() {
		String dados = " nomeCurso: " + nomeCurso + 
					"\n periodo do curso: " + periodo + 
				"\n valor do cruso: " + valor; 
		
		return dados; 
	}
}
