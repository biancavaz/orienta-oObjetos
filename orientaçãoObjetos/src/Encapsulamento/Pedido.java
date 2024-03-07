package Encapsulamento;

import java.sql.Date;
import java.util.ArrayList;

public class Pedido {
	
	private int numero;
	private String data;
	private int qntdItens; 
	
	private Pessoa pessoa; // quem fez o pedido
	private ArrayList<Produtos> produtos = new ArrayList<>(); // produtos q a pessoa comprou ou vai comprar (lista de produtos)
	
	public void addProduto (Object produtos1) {
		this.produtos.add((Produtos) produtos1);
	}
	
	public Produtos getProduto (int indice){
		 return this .produtos.get(indice);
	}
	
	
	public void setData(String data) {
		this.data = data;
	} 
	public String getData() {
		return data;
	}
	
	public boolean setNumero(int numero) {
		if (numero >0) {
		this.numero = numero;
		return true;
	} return false; 
}
	public int getNumero() {
		return numero;
	}
	
	public boolean setQntdItens(int qntdItens) {
		if ( qntdItens >0) {
		this.qntdItens = qntdItens;
		return true;
	} return false; 
}
	public int getQntdItens() {
		return this.qntdItens;
	}
} 
