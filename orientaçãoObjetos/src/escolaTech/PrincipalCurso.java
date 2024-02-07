package escolaTech;

import java.util.Scanner;

public class PrincipalCurso {
	
	public static void main ( String [] args) {
	
		System.out.println(" informe o nome do curso: "); 
		Scanner sc = new Scanner ( System.in); 
		Curso curso1 = new Curso(); 
		curso1.nomeCurso = sc.nextLine();
		System.out.println("informe o periodo do curso: ");
		curso1.periodo = sc.nextLine();
		System.out.println(" informe o valor do curso: ");
		curso1.valor = sc.nextLine();
		System.out.println(curso1.mostrarDados());
	}

}
