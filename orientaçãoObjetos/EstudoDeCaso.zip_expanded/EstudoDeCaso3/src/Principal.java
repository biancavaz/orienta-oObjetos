/***
 * @author carlos_kviatkowsky && @author bianca_vaz 
 * Essa classe contém todos os testes das classes, como as suas relações
 * maquina - operador. linha de produção maquina, entre outros testes,
 * a  senha padrao será adm para o primeiro acesso, a senha poderá ser alterada
 * posteriormente.
 * 
 * Data: 21/03/2024
 */

import java.util.Scanner;

public class Principal {

	static Cadastro cadastro1 = new Cadastro();
	public static void main(String[] args) {
		
		
		
		
		login();
	}
	public static void login () {
		Scanner sc = new Scanner(System.in);
		
		String loginCompara, senhaCompara;
		boolean logado = false;
		
		
		
		
		do {
		System.out.println("Digite o login ");
		loginCompara = sc.nextLine();
		System.out.println("Digite a Senha ");
		senhaCompara = sc.nextLine();
		
		if(cadastro1.getLogin().equals(loginCompara) && cadastro1.getSenha().equals(senhaCompara)) {
			System.out.println("ABA DE OPERAÇÕES");
			logado = true;
			operacoes();
		}
		else {
		 System.err.println("Usuário ou senha incorretas ");
		}
	}while (logado != true);
	}
	
	public static void operacoes() {
		// criando os objetos maquina 
		Maquina m1 = new Maquina();
		Maquina m2 = new Maquina();

		// criando o objeto linha de produção
		LinhaDeProducao l1 = new LinhaDeProducao();

		// criando os objeto operador
		Operador op1 = new Operador();
		Operador op2 = new Operador();

		// criando os objetos produtos 
		Produto p1 = new Produto();
		Produto p3 = new Produto();
		Produto p2 = new Produto();
		
		// criando os objetos componente
		Componente c1 = new Componente();
		Componente c2 = new Componente();
		Componente c3 = new Componente();
		
		
		
		// Adicionando os valores aos atributos do objeto Componente
		c1.setNome("lan");
		c1.setQuantidade(5);
		c1.setTipo("Textil ");
		
		c2.setNome("Malha");
		c2.setTipo("Textil");
		c2.setQuantidade(6);
		
		c3.setNome("Ferro de solda ");
		c3.setTipo("A gás ");
		c3.setQuantidade(1);
		
		// Adicionando os valores aos atributos do objeto Maquina 

		m1.setDemanda(14);
		m1.setDesempenho("O desempenho está bom ");
		m1.setFuncionando(true);
		m1.setIdMaquina(1);
		m1.setOperador(op1);
		m1.setStatus("A maquina está em bom status");
		m1.setTipoMaquina("Textil");

		m2.setDemanda(20);
		m2.setDesempenho("O desempenho está bom ");
		m2.setFuncionando(false);
		m2.setIdMaquina(2);
		m2.setOperador(op2);
		m2.setStatus("A maquina está ficando sem energia");
		m2.setTipoMaquina("Conctatenadora de fibra óptica ");

		// Adicionando os valores aos atributos do objeto Operador

		op1.setIdOperador(1);
		op1.setNome("Carlos");
		op1.setNecessidadeManutencao(false);
		op1.addHabilidades("Dinamico");
		op1.addHabilidades("Rapido");

		op2.setIdOperador(2);
		op2.setNome("Bianca");
		op2.setNecessidadeManutencao(false);
		op2.addHabilidades("Organizada");
		op2.addHabilidades("Comunicativa");

		// Adicionando os valores aos atributos do objeto Produto 

		
		p1.setDataProducao("14/02/2024");
		p1.setDescricao("Camisa polo");
		p1.setFabricacao("Utiliza uma maquina e seus componentes");
		p1.setIdProduto(1);
		p1.setMaquina(m1);
		p1.setNecAtualizarProcessos(true);
		p1.setNome("Camisa");
		p1.addCompente(c2);
		

		p2.setDataProducao("10/03/2024");
		p2.setDescricao("Fibra optica de 50 metros de comprimento");
		p2.setFabricacao("Utiliza uma maquina");
		p2.setIdProduto(2);
		p2.setMaquina(m2);
		p2.setNecAtualizarProcessos(false);
		p2.setNome("Fibra Optica");
		p2.addCompente(c3);

		p3.setDataProducao("10/09/2023");
		p3.setDescricao("Casaco moletom tamanho XGG");
		p3.setFabricacao("Utiliza uma maquina textil e necessita do operador");
		p3.setIdProduto(3);
		p3.setMaquina(m1);
		p3.setNecAtualizarProcessos(false);
		p3.setNome("Casaco");
		p3.addCompente(c1);
	
		// Adicionando os valores aos atributos do objeto Linha de produção 


		l1.addMaquina(m1);
		l1.addMaquina(m2);
		l1.setId(1);
		l1.setFuncionando(true);
		l1.setTempoDeCiclo(75);
		l1.setStatus("Funcionando perfeitamente");
		
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0 ;
		
		do {
		System.out.println("Digite o que quer fazer"+
						   "\n1 - Informações da maquina"+
				           "\n2 - Informações da linha de produção"+
						   "\n3 - informações do operador"+
				           "\n4 - informações do componente"+
						   "\n5 - informações do produto"+
				           "\n6 - Print id maquina usando a linha de produção"+
						   "\n7 - Printando os componentes do pedido "+
				           "\n8 - Printando o nome do Operador a partir da Classe pedido "+
						   "\n9 - Printando o nome do operador a partir da classe linha de produção para maquina"+
				           "\n10 - Alterar login e senha "+
				           "\n0 - Sair");
		opcao = sc.nextInt();
		
	    
		
		if (opcao == 1 ) {
			System.out.println(m1.getStatusGeral());
			System.out.println();
		}
		if (opcao == 2 ) {
			System.out.println(l1.getStatusTotal());
			System.out.println();
		}
		if (opcao == 3 ) {
			System.out.println(op1.getStatusGeral());
			System.out.println();
		}
		if (opcao == 4 ) {
			System.out.println(c1.getStatusTotal()); 
			System.out.println();
		}
		if (opcao == 5 ) {
			System.out.println(p1.getStatusTotal());
			System.out.println();
		}
		if (opcao == 6) {
			//Printando o Id das maquinas usando a linha de produção; 
			 for (int cont = 0; cont < l1.tamanhoListaMaquina(); cont ++) {
			System.out.println(l1.getMaquina(cont).getIdMaquina());
			}
		}
		if (opcao == 7 ) {
			// Printando os componentes do pedido 
			for(int cont = 0; cont < p1.tamanhoComponentes(); cont++) {
				System.out.println(p1.getComponentes(cont).getNome());
			}
		}
		if(opcao == 8) {
			// Printando o nome do Operador a partir da Classe pedido 
			System.out.println(p1.getMaquina().getOperador().getNome()); 
		}
		if (opcao == 9 ) {
			//Printando o nome do operador a partir da classe linha de produção para maquina 
			System.out.println(l1.getMaquina(1).getOperador().getNome());
		}
		if (opcao == 10 ) {
			// Alterando o login de ADM 
			sc.nextLine();
			do {
				System.out.println("O login deve conter mais que 4 letras ");
				
			System.out.println("Digite o novo login: ");
			} while(cadastro1.setLogin(sc.nextLine()) == "Deve conter mais de 4 letras");
			do {
				System.out.println("A senha deve conter mais que 4 letras e uma letra maiúscula");
			System.out.println("Digite a nova senha: ");
			} while (cadastro1.setSenha(sc.nextLine()) == "Necessita de mais de 4 caractéres e deve conter uma letra maiúscula");
			 
			
		}
		if (opcao == 0 ) {
			//FIM 
			System.out.println("ABA INICIAL ");
			login();
		}
		}while (opcao != 0 );
		

		
		 

	}
	
}
