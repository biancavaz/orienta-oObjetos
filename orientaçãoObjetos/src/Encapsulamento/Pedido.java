package Encapsulamento;

import java.sql.Date;

public class Pedido {
	
	private int numero;
	private Date data;
	private int qntdItens; 
	
	public void setData(Date data) {
		this.data = data;
	} 
	public Date getData() {
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
