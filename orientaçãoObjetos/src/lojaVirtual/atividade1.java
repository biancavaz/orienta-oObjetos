package lojaVirtual;

import java.util.Scanner;

public class atividade1 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int qnt = 0, cont5 = 0; 
		int valor1 = 0, valor2=0, valor3=0, valor4=0, valor5=0; 
		int pagamento, totalCarrinho, formaPagamento = 0; 
		int categorias, compra = 0, cadastro, result, tenis, senhaLogin;
		int cont1=0, cont2=0, cont3=0, cont4=0, cont6 = 0, cont = 0; 
		byte eletronicos, materialEscolar; 
		byte roupas, acessorios; 
		String nome, email, CPF, telefone, senha, sobrenome;
		int dia, mes, ano;
		boolean verificaNumero = false, verificaCPF = false, verificaEmail = false, verificaSenha = false;
		

		System.out.println(" olá, faça cadastro ou login no site, digite: \n"
				+ "\n  1- login. "
				+ "\n  2- cadastro. ");
		cadastro = sc.nextInt();
		
		switch ( cadastro ) {
			case 1: 
				System.out.println(" Digite o seu nome: ");
					nome = sc.next(); 
					do {
		                System.out.println("\n Insira sua senha: ");
		                	senha = sc.next();
		                if(senha.length()==4) {
		                    verificaSenha = true;
		                } else {
		                    verificaSenha = false;
		                    	System.out.println(" Senha inválida tente novamente.");
		                }
		                
		            } while(verificaSenha != true);
			break;
			
		case 2: 
			System.out.println(" Vamos começar o seu cadastro! ");
			System.out.println(" Digite o seu nome: ");
				nome = sc.next();
			System.out.println("\n Digite seu sobrenome: ");
				sobrenome = sc.next();
			System.out.println("\n insira sua data de nascimento (dividindo por 'enter'): ");
		        dia = sc.nextInt(); mes = sc.nextInt(); ano = sc.nextInt();  
			
			  do {
	              	System.out.println("\n Insira seu número para contato: ");
	                	telefone = sc.next();
	                if(telefone.length()==11) {
	                    verificaNumero = true;
	                } else { 
	                	verificaNumero = false;
	                		System.out.println("\n número inválido tente novamente.");
	                }
	                
	            } while(verificaNumero != true);
	            
	            do {
	                System.out.println("\n Insira seu email: ");
	                	email = sc.next();
	                if(email.length()>=11) {
	                    verificaEmail = true;
	                } else {
	                    verificaEmail = false;
	                    	System.out.println("\n email inválido tente novamente.");
	                }
	                
	            } while(verificaEmail != true);
	            
	            do {
	                System.out.println("\n Insira seu CPF: ");
	                	CPF = sc.next();
	                if(CPF.length()==11) {
	                    verificaCPF = true;
	                } else {
	                    verificaCPF = false;
	                    	System.out.println("\n CPF inválido tente novamente.");
	                }
	                
	            } while(verificaCPF != true);
	            
	            do {
	                System.out.println("\n Insira uma senha de 4 digitos: ");
	                	senha = sc.next();
	                if(senha.length()==4) {
	                    verificaSenha = true;
	                } else {
	                    verificaSenha = false;
	                    	System.out.println(" Senha inválida tente novamente.");
	                }
	                
	            } while(verificaSenha != true);
	            
	            System.out.println("Você foi cadastrado com sucesso!");
	        } 
		
		
		do {
			do {
		 System.out.println("\n Olá, Escolha a categoia que você deseja pequisar: \n"
				+ "\n 1- Eletrônico "
				+ "\n 2- Roupas " 
				+ "\n 3- Acessórios " 
				+ "\n 4- Material escolar "
				+ "\n 5- Tenis " ); 
			categorias = sc.nextInt(); 
		
		switch ( categorias ) {
			case 1: 
				System.out.println(" Temos disponível em nossa loja os seguintes eletrônicos: \n" 
						+ "\n 	1- JBL, Caixa de Som Bluetooth, Xtreme 3 = R$1.500,00 ");
				eletronicos = sc.nextByte(); 
				
				if ( eletronicos == 1 ) { 
						System.out.println("     JBL, Caixa de Som Bluetooth, Xtreme 3  \n"
								+ "\n caracteísticas do produto: "
								+ "\n\n Marca	                                   JBL "
								+ "\n Nome do modelo                            XTREME 3 "
								+ "\n Tipo de alto-falante   	           Tweeter"
								+ "\n Tecnologia de conectividade	           Bluetooth, USB "
								+ "\n Características especiais	           Porta USB, À prova d'água "
								+ "\n\n Deseja adicionar esse produto no carrinho de compras? 1- sim, 2- não "); 
						compra = sc.nextInt(); 
						
						if ( compra == 1 ) {
							System.out.println(" Produto adicionado ao carrinho de compras! ");	
							cont1++;
							cont++;
							
							valor1 = (int) (cont1 * 1500); 
						}
						
					} break; 
				
			case 2: 
				System.out.println(" Temos disponível em nossa loja as seguintes roupas: \n"
						+ "\n   1- Cropped Canelado Regata = R$ 30,00 " ); 
					roupas = sc.nextByte(); 
				
				if ( roupas == 1 ) { 
						System.out.println("\n       Cropped Canelado Regata \n"
								+ "\n características do produto: "
								+ "\n\n - Cropped Tecido Ribana "
								+ "\n - SEM Bojo "
								+ "\n - Veste do 36 ate 42 "
								+ "\n - Medida - Altura: 41 cm "
								+ "\n\n Deseja adicionar esse produto no carrinho de compras? 1- sim, 2- não ");
						compra = sc.nextInt();
						
						if ( compra == 1 ) {
							cont2++;
							cont++; 
							System.out.println(" Produto adicionado ao carrinho de compras! ");	
							valor2 = (int) (cont1 * 30); 
						}
						
				} break; 
				
			case 3: 
				System.out.println(" Temos disponível em nossa loja os seguites acessórios: \n"
						+ "\n   1- Colar Clássico Duplo Coração Azul Prata = R$ 17,00 ");
					acessorios = sc.nextByte();
				
				if ( acessorios ==1 ) {
						System.out.println("\n    Colar Clássico Duplo Coração Azul Prata \n"
								+ "\n características do produto "
								+ "\n\n - Tamanho da corrente: 45cm "
								+ "\n - Bolsa de veludo incluída "
								+ "\n - Tamanho do pingente: 1 cm * 1 cm "
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não");
						compra = sc.nextInt();
						
						if ( compra == 1 ) {
							cont++; 
							cont3++;
							System.out.println(" Produto adicionado ao carrinho de compras! ");	
							valor3 = (int) (cont1 * 17); 
						}
						
				} break; 
				
			case 4: 
				System.out.println(" Em nossa loja tem disponível os seguintes materias escolares: \n"
						+ "\n   1- Caneta Hidrográfica Fineliner Ponta Fina 0.4 mm Kit 24 Cores = R$ 25,00 " ); 
				materialEscolar = sc.nextByte(); 
				
				if ( materialEscolar == 1 ) {
						System.out.println("\n   Caneta Hidrográfica Fineliner Ponta Fina 0.4 mm Kit 24 Cores \n"
								+ "\n características do produto: "
								+ "\n\n - Fabricante:	        Fengzengmei	"
								+ "\n - Tipo de material:	‎Plástico"
								+ "\n - Tipo de ponta:	‎Super Fine"
								+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não");
						compra = sc.nextInt();
						
						if ( compra == 1 ) {
							cont++; 
							cont4++;
							System.out.println(" Produto adicionado ao carrinho de compras! ");
							valor4 = (int) (cont1 * 25); 
						}
						
				} break; 	
				
			case 5: 
				System.out.println(" Temos disponível em nossa loja o seguinte tenis: "
						+ "\n 1- TÊNIS KNU SKOOL NAVY TRUE WHITE = R$ 500,00");
				tenis = sc.nextInt(); 
				
				if ( tenis == 1 ) {
					System.out.println("\n  TÊNIS KNU SKOOL NAVY TRUE WHITE  \n"
							+ "\n características do produto: "
							+ "\n\n - Cor: Azul"
							+ "\n - Marca: Vans" 
							+ "\n - Esportes recomendados: Skate "
							+ "\n - Materiais da sola: Borracha "
							+ "\n - Estilo: Urbano "
							+ "\n - Materiais do exterior: Suede"
							+ "\n\n Deseja adicionar esse produto no carrinho de compras ? 1- sim, 2- não");
					compra = sc.nextInt();
					
					if ( compra == 1 ) {
						cont++; 
						cont6++;
						System.out.println(" Produto adicionado ao carrinho de compras! ");	
						valor5 = (int) (cont1 * 500); 
					}
					
				} break; 	
			}
		
		System.out.println(" Total itens no carrinho: " + cont++);
		totalCarrinho = valor1 + valor2 + valor3 + valor4 + valor5; 
		System.out.println(" o valor das compras é: "+ totalCarrinho);

					System.out.println("\n Deseja finaliza a compra? "
							+ "\n 1- sim"
							+ "\n 2- não");
					pagamento = sc.nextInt();
		
				if ( pagamento == 1 ) {
					System.out.println(" Qual a forma de pagamento você deseja: "
							+ "\n 1- Pix"
							+ "\n 2- cartão de crédito "
							+ "\n 3- cartão de débito ");
					formaPagamento = sc.nextInt();
			
					}
			
				} while (pagamento !=1);
					result = (int) formasPagar ( formaPagamento); 
			
		} while ( compra != 1); 	

	}
	
	
		public static int formasPagar ( int formaPagamento ) {
		
			if ( formaPagamento == 1 ) {
				
			}
			
			if ( formaPagamento == 2) {
				
			}
			
			if ( formaPagamento == 3) {
				
			}
			
			
			
			
			return 0; 
	}	
}

