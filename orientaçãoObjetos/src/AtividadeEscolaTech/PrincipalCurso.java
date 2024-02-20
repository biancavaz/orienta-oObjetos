package AtividadeEscolaTech;

import java.util.Scanner;

public class PrincipalCurso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont5 = 0;
		int quantidade = 0;
		int matriz[][] = new int[quantidade][30];

		System.out.println("Informe a quantidade de cursos que serão cadastrados: ");
		quantidade = sc.nextInt();

		Cursos[] curso1 = new Cursos[quantidade];
		curso1[cont5] = new Cursos();

		for (cont5 = 0; cont5 < quantidade; cont5++) {
			System.out.println("\nNome do curso: ");
			while (curso1[cont5].verificanomeCurso(sc.next()) != true) {
				System.out.println(" informe o nome do curso novamente: ");
			}
			System.out.println("Código do curso: ");
			while (curso1[cont5].verificacod(sc.next()) != true) {
				System.out.println(" informe o código do curso novamente: ");
			}
			System.out.println("Descrição do conteúdo do curso : ");
			while (curso1[cont5].verificadscConteudo(sc.next()) != true) {
				System.out.println(" informe a descrição do curso novamente: ");
			}
			System.out.println("Digite a carga horária do curso: ");
			while (curso1[cont5].verificacargaHoraria(sc.next()) != true) {
				System.out.println(" informe a carga horária do curso novamente: ");
			}
			System.out.println("Mensalidade do curso: ");
			while (curso1[cont5].verificamensalidade(sc.next()) != true) {
				System.out.println(" informe a mensalidade do curso novamente: ");
			}
		}

	}

}
