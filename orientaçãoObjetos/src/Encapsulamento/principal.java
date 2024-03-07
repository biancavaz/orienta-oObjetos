package Encapsulamento;

import java.util.Scanner;

import AtividadeEscolaTech.CadastroAluno;

public class principal {
	
public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
			
			Edereco end1 = new Edereco();
			
			System.out.println("Digite o nome da rua: ");
			end1.setRua(sc.nextLine());
			
			System.out.println("Digite o número da residencia: ");
			end1.setNumero(sc.nextInt());
			
			System.out.println("Digite o complemento: ");
			end1.setComplemento(sc.next());
			
			System.out.println("Digite o cep: ");
			end1.setCep(sc.next());
			
			System.out.println("Digite o bairro: ");
			end1.setBairro(sc.next());
			
			System.out.println("Rua: " + end1.getRua());
			System.out.println("Número: " + end1.getNumero());
			System.out.println("Bairro: " + end1.getBairro());
			System.out.println("Cep: " + end1.getCep());
			System.out.println("Complemento: " + end1.getComplemento());
			
			Pessoa pess1 = new Pessoa();
			
			System.out.println("Digite o seu nome: ");
			pess1.setNome(sc.next());

			System.out.println("Digite o CPF: ");
			pess1.setCPF(sc.next());
			
			System.out.println("Digite o RG: ");
			pess1.setRG(sc.next());
			
			System.out.println("Nome: " + pess1.getNome());
			System.out.println("CPF: " + pess1.getCPF());
			System.out.println("RG: " + pess1.getRG());
			
			Produtos prod = new Produtos();
			
			System.out.println("Digite a descrição do produto: ");
			prod.setDiscrecao(sc.next());
			
			System.out.println("Digite o preço: ");
			prod.setPreco(sc.nextInt());
			
			System.out.println("Descrição do produto: " + prod.getDiscrecao());
			System.out.println("Valor: " + prod.getPreco());
			
			Pedido pedi = new Pedido();
			
			System.out.println("Digite o número do pedido: ");
			pedi.setNumero(sc.nextInt());
			
			System.out.println("Digite a data do pedido: ");
			pedi.setData(sc.next());
			
			System.out.println("Digite a quantidade de itens no pedido: ");
			pedi.setQntdItens(sc.nextInt());
			
			System.out.println("N° pedido: " + pedi.getNumero());
			System.out.println("Data: " + pedi.getData());
			System.out.println("Quantidade de itens no pedido: " + pedi.getQntdItens());
			
		}

	}
