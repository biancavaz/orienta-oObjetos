package Apresentação;

public class Aluno extends Professor {
	
	private int matricula;

	public boolean setMatricula(int matricula) {
		if ( matricula > 0 ) {
			this.matricula = matricula;
			return true;
		} else {
			return false;
		}
		
	}
	public int getMatricula() {
		return matricula;
	}
}