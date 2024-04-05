package Apresentação;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Professor professor = new Professor();
		Aluno aluno = new Aluno();
		
		//INFORMAÇÕES DO PROFESSOR
		do {
			System.out.println("Digite o nome do professor:");
		} while(professor.setNome(sc.nextLine()) == false);
		do {
			System.out.println("Digite a idade do professor:");
		} while(professor.setIdade(sc.nextLine()) == false);
		do {
			System.out.println("Digite o CPF do professor:");
		} while(professor.setCpf(sc.nextLine()) == false);
		
		//INFORMAÇÕES DO ALUNO
		do {
			System.out.println("Digite o nome do aluno:");
		} while(aluno.setNome(sc.nextLine()) == false);
		do {
			System.out.println("Idade aluno");
		} while(aluno.setIdade(sc.nextLine()) == false);
		do {
			System.out.println("Digite o CPF do aluno:");
		} while(aluno.setCpf(sc.nextLine()) == false);
		do {
			System.out.println("Digite a matrícula do aluno:");
		} while(aluno.setMatricula(sc.nextInt()) == false);
		
		//RESPOSTAS DO ALUNO
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("CPF do aluno: " + aluno.getCpf());
		System.out.println("Matrícula do aluno: "+aluno.getMatricula());
		System.out.println("Idade do aluno: "+aluno.getIdade());
		
		//RESPOSTAS DO PROFESSOR
		System.out.println("Nome do professor: " + professor.getNome());
		System.out.println("CPF do professor: " + professor.getCpf());
		System.out.println("Idade do professor: "+professor.getIdade());
	}
}
