package AtividadeEscolaTech;

import java.util.Scanner;

public class PrincipalCadastro {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int opcao, quantidade = 0, cont, cont1; 
		int matriz [][] = new int [quantidade][30]; 
		CadastroAluno [] listaAlunos = new CadastroAluno [3];
		
		
		System.out.println(" olá!"
				+ "\n1- aluno "
				+ "\n2- professor");
		opcao = sc.nextInt();
		
		switch ( opcao ) {
		
		case 1: 
		
			System.out.println(" Informe a quantidade de alunos que serão cadastrados: ");
				quantidade = sc.nextInt();
				
				CadastroAluno [] aluno1  = new CadastroAluno [quantidade];
				
			
			for ( cont= 0; cont <quantidade; cont++) {
						
				System.out.println("\nInforme os dados do aluno ");
					aluno1 [cont]= new CadastroAluno();
						System.out.println(" Informe o nome: ");
							aluno1[cont].nome = sc.next();
			 
					System.out.println("\n Informe o seu e-mail: ");
			 			while (!aluno1[cont].verificaEmail( sc.next())) { 
			 				System.out.println(" informe o email novamente : ");
			 			} 
			 			System.out.println(" Informe sua senha: ");
			 				while (!aluno1[cont].verificaSenha(sc.next())) { 
			 					System.out.println(" Informe a senha novamente: ");
			 				}  
			 				System.out.println(" Informe o seu número de telefone: ");
			 					while (!aluno1[cont].verificaTelefone(sc.next())) { 
			 						System.out.println(" informe o telefone novamente: ");
			 					} 
			 					
			 					System.out.println(" Informe o seu numero de identificação: ");
			 					while ( !aluno1[cont].verificaIdentificacao(sc.next())) {
			 						System.out.println(" Informe o número de identificação novamente: ");
			 					}
			 					
			 				listaAlunos[0] = aluno1[cont]; 
			 				System.out.println(aluno1[cont].mostrarDados());
			 				cont++; 
			 				
			}
			 					break; 
			 					
		case 2: 
			System.out.println(" Informe a quantidade de profs que serão cadastrados: ");
				quantidade = sc.nextInt();
			
			CadastroProfessor[] prof1  = new CadastroProfessor [quantidade];
			
			for ( cont1= 0; cont1 <quantidade; cont1++) {
				System.out.println("Informe os dados do professor");
					prof1 [cont]= new CadastroProfessor();
						System.out.println(" Informe o nome:");
							prof1[cont1].nomeProf = sc.next();
	 
					System.out.println(" Informe o seu e-mail: ");
						while (!prof1[cont1].verificaEmail( sc.next())) { 
							System.out.println(" informe o email novamente: ");
						} 
						System.out.println(" Informe sua senha: ");
							while (!prof1[cont1].verificaSenha(sc.next())) { 
							System.out.println(" Informe a senha novamente: ");
						}  
						System.out.println(" Informe o seu número de telefone: "); 
							while (!prof1[cont1].verificaTelefone(sc.next())) { 
	 						System.out.println(" informe o telefone novamente: ");
	 					} 
						System.out.println(" Informe o seu numero de identificação: ");
		 					while ( !prof1[cont1].verificaIdentificacao(sc.next())) {
		 					System.out.println(" Informe o número de identificação novamente: ");
		 				}
		 					System.out.println(prof1[cont1].mostrarDados());
		 					break; 
			
			 				
				}
			 					
			 }
		}
	
		


