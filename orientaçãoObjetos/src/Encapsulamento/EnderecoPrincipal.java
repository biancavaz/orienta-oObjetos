package Encapsulamento;

import java.util.Scanner;

public class EnderecoPrincipal {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Edereco bairro = new Edereco (); 
		
		System.out.println(" Informe o bairro: ");
			while (bairro.setBairro(sc.next()) != true) {
				System.out.println(" Informe o nome do bairro novamente ");
		}
			System.out.println(" Informe o cep: ");
				while (bairro.setCep(sc.next()) != true) {
					System.out.println(" Informe o cep novamente ");
			}
				System.out.println(" Informe o nome da rua: ");	
					while (bairro.setRua(sc.next()) != true) {
						System.out.println(" Informe o nome da rua novamente ");
					}
						System.out.println("Informe o complemento: ");
		
		
	}
}
