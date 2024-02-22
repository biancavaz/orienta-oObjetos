package Encapsulamento;

import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

public class Produtos {
	
	private String descricao;
	private int preco;
	
	public boolean setDiscrecao(String descricao) {
		if ( descricao.length() >5) {
			this.descricao = descricao;
			return true;
	} return false; 
}
	public String getDiscrecao() {
		return this.descricao;
		}

	public boolean setPreco(int preco) {
		if (preco >0 ) {
			this.preco = preco;
			return true;
	} return false; 
}
	public int getPreco() {
		return this.preco;
	}
}
