package AtividadeEscolaTech;

import java.util.Scanner;

public class PrincipalCadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao, quantidade = 0, cont, cont1, cont2, cont3 = 0, cont4 = 0;
		int opcaoCadastro, opcaoProfs, opcaoNota = 0;
		int matriz[][] = new int[quantidade][30];
		CadastroAluno[] listaAlunos = new CadastroAluno[1000];

		do {
		System.out.println(" olá!" + "\n1- aluno " + "\n2- professor"+ "\n3- curso" + "\n4- Disciplina"+ "\n5-Aula " + "\n6- sair");
			opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			System.out.println(" Bem vindo aluno!" + "\n0- login" + "\n1- Cadastro");
			opcaoCadastro = sc.nextInt();

			switch (opcaoCadastro) {

			case 0:
				CadastroAluno aluno2 = new CadastroAluno();
				aluno2 = new CadastroAluno();

				System.out.println(" Informe o seu login: ");
				while (!aluno2.verificaLogin(sc.next())) {
					System.out.println(" informe o login novamente : ");
				}
				System.out.println(" Informe sua senha: ");
				while (!aluno2.verificaSenha(sc.next())) {
					System.out.println(" Informe a senha novamente: ");
				}
				break;

			case 1:
				System.out.println(" Informe a quantidade de alunos que serão cadastrados: ");
				quantidade = sc.nextInt();

				CadastroAluno[] aluno1 = new CadastroAluno[quantidade];

				for (cont = 0; cont < quantidade; cont++) {
					CadastroAluno aluno = new CadastroAluno();
					aluno1[cont] = aluno;

					System.out.println("\nInforme os dados do aluno ");

					System.out.println("\nnome: ");
					aluno1[cont].nome = sc.next();

					System.out.println("\ne-mail: ");
					while (!aluno1[cont].verificaEmail(sc.next())) {
						System.out.println(" informe o email novamente : ");
					}
					System.out.println("\nsenha: ");
					while (!aluno1[cont].verificaSenha(sc.next())) {
						System.out.println(" Informe a senha novamente: ");
					}
					System.out.println("\nnúmero de telefone: ");
					while (!aluno1[cont].verificaTelefone(sc.next())) {
						System.out.println(" informe o telefone novamente: ");
					}

					System.out.println("\nnumero de identificação: ");
					while (!aluno1[cont].verificaIdentificacao(sc.next())) {
						System.out.println(" Informe o número de identificação novamente: ");
					}
				}

				System.out.print(" ------ ALUNOS CADASTRADOS ------  ");
				for (cont2 = 0; cont2 < quantidade; cont2++) {
					System.out.println("\nnome:" + aluno1[cont2].nome + "\ne-mail:" + aluno1[cont2].email
							+ "\ncadastro:" + aluno1[cont2].numIdentificacao + "\n ___________________ ");
				}
			}
			break;

	// cadastro professores

		case 2:
			System.out.println(" Olá professor! " + "\n0- login" + "\n1- cadastro");
			opcaoProfs = sc.nextInt();

			switch (opcaoProfs) {

			case 0:
				CadastroProfessor prof2 = new CadastroProfessor();
				prof2 = new CadastroProfessor();

				System.out.println(" Informe o seu login: ");
				while (!prof2.verificaLoginProf(sc.next())) {
					System.out.println(" informe o login novamente : ");
				}
				System.out.println(" Informe sua senha: ");
				while (!prof2.verificaSenhaProf(sc.next())) {
					System.out.println(" Informe a senha novamente: ");
				}
				break;

			case 1:
				System.out.println(" Informe a quantidade de profs que serão cadastrados: ");
				quantidade = sc.nextInt();

				CadastroProfessor[] prof1 = new CadastroProfessor[quantidade];

				for (cont1 = 0; cont1 < quantidade; cont1++) {
					CadastroProfessor professor = new CadastroProfessor();
					prof1[cont1] = professor;

					System.out.println("Informe os dados do professor");

					System.out.println("\nnome:");
					prof1[cont1].nomeProf = sc.next();

					System.out.println("\ne-mail: ");
					while (!prof1[cont1].verificaEmail(sc.next())) {
						System.out.println(" informe o email novamente: ");
					}
					System.out.println(" \nsenha: ");
					while (!prof1[cont1].verificaSenhaProf(sc.next())) {
						System.out.println(" Informe a senha novamente: ");
					}
					System.out.println("\nnúmero de telefone: ");
					while (!prof1[cont1].verificaTelefone(sc.next())) {
						System.out.println(" informe o telefone novamente: ");
					}
					System.out.println("\nnumero de identificação: ");
					while (!prof1[cont1].verificaIdentificacao(sc.next())) {
						System.out.println(" Informe o número de identificação novamente: ");
					}

				}
			
			System.out.print(" ------ PROFESSORES CADASTRADOS ------  ");
			for (cont2 = 0; cont2 < quantidade; cont2++) {
				System.out.println("\nnome:" + prof1[cont2].nomeProf + "\ne-mail:" + prof1[cont2].emailProf
						+ "\ncadastro:" + prof1[cont2].numIdentif + "\n ___________________ ");
			}
		} break;
			
			// curos e disciplinas cadastradas.
			
		case 3: 
			System.out.println("Informe a quantidade de cursos que serão cadastrados: ");
				quantidade = sc.nextInt();

			Cursos[] curso1 = new Cursos[quantidade];
			
			for (cont3 = 0; cont3 < quantidade; cont3++) {
				curso1[cont3] = new Cursos();

				System.out.println("\nNome do curso: ");
				while (curso1[cont3].verificanomeCurso(sc.next()) != true) {
					System.out.println(" informe o nome do curso novamente: ");
				}
				System.out.println("Código do curso: ");
				while (curso1[cont3].verificacod(sc.next()) != true) {
					System.out.println(" informe o código do curso novamente: ");
				}
				System.out.println("Descrição do conteúdo do curso : ");
				while (curso1[cont3].verificadscConteudo(sc.next()) != true) {
					System.out.println(" informe a descrição do curso novamente: ");
				}
				System.out.println("Digite a carga horária do curso: ");
				while (curso1[cont3].verificacargaHoraria(sc.next()) != true) {
					System.out.println(" informe a carga horária do curso novamente: ");
				}
				System.out.println("Mensalidade do curso: ");
				while (curso1[cont3].verificamensalidade(sc.next()) != true) {
					System.out.println(" informe a mensalidade do curso novamente: ");
				}
			}
			
			System.out.print("\n ------ CURSOS CADASTRADOS ------  ");
			for (cont2 = 0; cont2 < quantidade; cont2++) {
				System.out.println("\nNome do curso: " + curso1[cont2].nomeCurso + "\nCódigo do curso: " + curso1[cont2].cod
						+ "\nCarga horária do curso: " + curso1[cont2].cargaHoraria + "h" +"\n___________________");
			} break; 
			
			
			
			
		case 4: 
			System.out.println(" Informe a quantidade de disciplinas que serão cadastradas: ");
				quantidade = sc.nextInt();
				
				Disciplina[] disciplina1 = new Disciplina[quantidade];
				
			for (cont4 = 0; cont4 < quantidade; cont4++) {
				disciplina1[cont4] = new Disciplina();

				System.out.println("\nInforme o nome da disciplina: ");
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
			
			System.out.print("\n ------ DISCIPLINAS CADASTRADOS ------  ");
			for (cont2 = 0; cont2 < quantidade; cont2++) {
				System.out.println("\nNome do curso: " + disciplina1[cont2].nomeDisciplina
						+ "\nCódigo do curso: " + disciplina1[cont2].codDisciplina
						+ "\nCarga horária do curso: " + disciplina1[cont2].cargaHoraria + "h" +"\n___________________");
			} break; 
			
		case 5: 
			System.out.println(" 1- cadastrar nota"
					+ " 2- frequencia ");
			opcaoNota = sc.nextInt(); 		}
			
			switch (opcaoNota) {
			
			case 1: 
				Disciplina[] disciplina1 = new Disciplina[quantidade];

			System.out.print("\n ------ DISCIPLINAS CADASTRADOS ------  ");
				for (cont2 = 0; cont2 < quantidade; cont2++) {
					System.out.println("\nNome do curso: " + disciplina1[cont2].nomeDisciplina
							+ "\nCódigo do curso: " + disciplina1[cont2].codDisciplina
							+ "\nCarga horária do curso: " + disciplina1[cont2].cargaHoraria + "h" +"\n___________________");
				} 
				
				System.out.println("as posições/disciplinas");
				int posicao = sc.nextInt();
					System.out.println(disciplina1[posicao]);
				
				break; 
				
				
			case 2: 
				
			}
			
			
		} while ( opcao != 6 ); 
		
		
			
	}
		
}


