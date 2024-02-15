package ExplicaçãoProfessor;

import java.util.Scanner;

public class principal {
	
	public static void main (String [] args) {
		System.out.println(" informe nome do aluno: ");
		Scanner teclado = new Scanner ( System.in);
		// criar um objeto da classe aluno:
		Aluno aluno1= new Aluno();
		// atribuindo dado ao noem:
		aluno1.nome = teclado.nextLine();
		
		System.out.println("informe a senha: ");
		if(aluno1.verificaSenha (teclado.nextLine())) {
		do {
			System.out.println(" informe a senha novamente : ");
		} while (aluno1.verificaSenha(teclado.nextLine()));
		}
		System.out.println(" informe o e-mail: ");
		aluno1.verificaEmail (teclado.nextLine());
		// perguntar email de novo se for inválido
		do {
			System.out.println(" informe o email novamente : ");
			
		} while (!aluno1.verificaEmail( teclado.nextLine()));
		System.out.println(aluno1.mostrarDados());
		
	}
	
}
