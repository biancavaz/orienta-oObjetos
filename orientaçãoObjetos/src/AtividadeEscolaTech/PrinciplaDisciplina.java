package AtividadeEscolaTech;

import java.util.Scanner;

public class PrinciplaDisciplina {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont4 = 0;
		int quantidade = 0;
		int matriz[][] = new int[quantidade][30];

		System.out.println(" Informe a quantidade de disciplinas que serão cadastradas: ");
		quantidade = sc.nextInt();

		Disciplina[] disciplina1 = new Disciplina[quantidade];
		disciplina1[cont4] = new Disciplina();

		for (cont4 = 0; cont4 < quantidade; cont4++) {
			System.out.println("\nInforme o nome da disciplina ");
			while (!disciplina1[cont4].verificaNomeDisciplina(sc.next())) {
				System.out.println(" informe o nome da disciplina novamente: ");
			}
			System.out.println(" Informe o código da disciplina: ");
			while (disciplina1[cont4].verificacodDisciplina(sc.next()) != true) {
				System.out.println(" informe o codigo da disciplina novamente: ");
			}
			System.out.println(" Informe a descrição da disciplina : ");
			while (disciplina1[cont4].verificadscrConteudo(sc.next()) != true) {
				System.out.println(" informe a descrição da disciplina novamente: ");
			}
			System.out.println(" Digite a carga horária da disciplina: ");
			while (disciplina1[cont4].verificacargaHoraria(sc.next()) != true) {
				System.out.println(" informe a carga horária da disciplina novamente: ");
			}
			System.out.println(" Mensalidade da disciplina: ");
			while (disciplina1[cont4].verificamensalidade(sc.next()) != true) {
				System.out.println(" informe a mensalidade da disciplina novamente: ");
			}

		}
	}

}
